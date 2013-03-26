package evaluator.calculators;

import evaluator.Type;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

public class Calculate implements Evaluate {
    private HashMap<String, Method> methodBySignature = new HashMap<>();

    public Calculate() {
        Reflections ref = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forJavaClassPath()));
        addMethods(ref.getSubTypesOf(Calculator.class));
    }

    private void addMethods(Set<Class<? extends Calculator>> classes) {
        for (Class<?> theClass : classes) {
            addMethods(theClass);
        }
    }

    private void addMethods(Class<?> theClass) {
        for (Method method : theClass.getDeclaredMethods()) {
            if (!method.isAnnotationPresent(Operation.class)) continue; //TODO: Create file operation
            methodBySignature.put(getMethodStringSignature(method), method);
        }
    }
    
    public Type getTypeof(Operator operator, Type[] types) {
        try {
            String signature = getMethodStringSignature(operator, types);
            return (Type) methodBySignature.get(signature).invoke(null, types);
        } 
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        }
        return null;
    }

    private String getMethodStringSignature(Method method) {
        String signature = method.getName();
        Class<?>[] params = method.getParameterTypes();
        for (Class paramClass : params) signature += paramClass.getSimpleName();
        return signature;
    }

    private String getMethodStringSignature(Operator operator, Object[] object) {
        String signature = operator.getName();
        for (Object obj : object) signature += obj.getClass().getSimpleName();
        return signature;
    }
    
    @Override
    public Type calculate(Operator operator, Type arg0, Type arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
