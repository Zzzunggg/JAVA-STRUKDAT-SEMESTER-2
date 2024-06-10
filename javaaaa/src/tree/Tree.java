package tree;



public class Tree {
    private Node root;

    // Default constructor
    public Tree() {
        root = null;
    }

    // Constructor with root node
    public Tree(Node root) {
        this.root = root;
    }

    // Constructor with data for root node
    public Tree(String data) {
        this.root = new Node(data);
    }

    // Insert a new node with given data
    public void insert(String data) {
        insert(new Node(data));
    }

    // Insert a new node
    public void insert(Node child) {
        insert(root, child);
    }

    // Recursive insert method
    public void insert(Node parent, Node child) {
        if (root == null) {
            root = child;
            System.out.println("Add " + child.getData() + " as Root");
        } else {
            if (child.isGreater(parent)) {
                if (parent.getRightChild() == null) {
                    parent.setRightChild(child);
                    System.out.println("Add " + child.getData() + " as RightChild of " + parent.getData());
                } else {
                    insert(parent.getRightChild(), child);
                }
            } else {
                if (parent.getLeftChild() == null) {
                    parent.setLeftChild(child);
                    System.out.println("Add " + child.getData() + " as LeftChild of " + parent.getData());
                } else {
                    insert(parent.getLeftChild(), child);
                }
            }
        }
    }

    // Additional methods can be added here (e.g., traversal, deletion, etc.)
}

    
    
