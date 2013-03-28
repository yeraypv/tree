package evaluator.nodes;

public class Type<T> {

    private T value;

    public Type(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
