package evaluator.tree;

public class Operator {
    private int indexOperator;
    private final String info;
    private final String name;

    public Operator(String info, String name, int indexOperator) {
        this.indexOperator = indexOperator;
        this.info = info;
        this.name = name;
    }

    public int getIndexOperator() {
        return indexOperator;
    }
    
    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    public void setIndexOperator(int index) {
        this.indexOperator = index;
    }
}
