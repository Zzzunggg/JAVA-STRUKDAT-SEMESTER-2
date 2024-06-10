package tree;


public class Node {
    private String data;
    private Node LeftChild;
    private Node RightChild;
    private Node parent;

    // Constructor
    public Node(String data) {
        this.data = data;
        this.LeftChild = null;
        this.RightChild = null;
        this.parent = null;
    }

    // Getter and Setter for data
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // Getter and Setter for LeftChild
    public Node getLeftChild() {
        return LeftChild;
    }

    public void setLeftChild(Node LeftChild) {
        this.LeftChild = LeftChild;
        if (LeftChild != null) {
            LeftChild.setParent(this);  // Set parent to this node
        }
    }

    // Getter and Setter for RightChild
    public Node getRightChild() {
        return RightChild;
    }

    public void setRightChild(Node RightChild) {
        this.RightChild = RightChild;
        if (RightChild != null) {
            RightChild.setParent(this);  // Set parent to this node
        }
    }

    // Getter and Setter for parent
    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    // Method to compare data of this node with another node
    public boolean isGreater(Node compare) {
        return this.data.compareTo(compare.getData()) > 0;
    }
}
