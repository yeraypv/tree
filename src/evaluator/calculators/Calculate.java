package evaluator.calculators;

import evaluator.calculators.annotations.Operation;
import evaluator.nodes.Operator;
import evaluator.nodes.Type;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

public class Calculate {

    private HashMap<String, Method> methods = new HashMap<>();

    public Calculate() {
        Reflections ref = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forJavaClassPath()));
        addReflectMethods(ref.getSubTypesOf(Calculator.class));
    }

    private String getMethodSignature(Method method) {
        String signature = method.getName();
        Class<?>[] params = method.getParameterTypes();
        for (Class paramClass : params) {
            signature += paramClass.getSimpleName();
        }
        return signature;
    }

    private String getMethodSignature(Operator operator, Object[] object) {
        String signature = operator.getName();
        for (Object obj : object) {
            signature += obj.getClass().getSimpleName();
        }
        return signature;
    }

    private void addReflectMethods(Set<Class<? extends Calculator>> classes) {
        for (Class<?> theClass : classes) {
            addReflectMethods(theClass);
        }
    }

    private void addReflectMethods(Class<?> theClass) {
        for (Method method : theClass.getDeclaredMethods()) {
            if (!method.isAnnotationPresent(Operation.class)) {
                continue;
            }
            methods.put(getMethodSignature(method), method);
        }
    }

    public Type getType(Operator operator, Type[] types) {
        try {
            String signature = getMethodSignature(operator, types);
            return (Type) methods.get(signature).invoke(null, types);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        }
        return null;
    }
}
