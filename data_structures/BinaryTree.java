package data_structures;

public class BinaryTree<T extends Comparable<T>> {
    Node root;
    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = newNode.right = null;

        if (root == null) {
            root = newNode;
        } 
        else {
            Node p = root;
            Node temp = null;
            while (p != null) {
                temp = p;
                if (p.data.compareTo(data) < 1) {
                    p = p.right;
                } else {
                    p = p.left;
                }
            }
            if (temp.data.compareTo(data) < 1) {
                temp.right = newNode;
            } 
            else {
                temp.left = newNode;
            }
        }
    }
    
    public void print(Type type) {
        LNR(root);
    }

    private void LNR(Node node) {
        if (node != null) {
            LNR(node.left);
            System.out.print(node.data + "  ");
            LNR(node.right);
        }
    }
    class Node {
        Node left;
        Node right;
        T data;
    }
    enum Type {
        LNR
    }
}
