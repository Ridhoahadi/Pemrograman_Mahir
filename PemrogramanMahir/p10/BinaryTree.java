package PemrogramanMahir.p10;

public class BinaryTree {
    public NodeBinaryTree root;

    public void insert(int value){
        if (root == null){
            root = new NodeBinaryTree();
            root.data = value;
        } else {
            root.insert(value);
        }
    }
    public void printPreOrder(){
        if (root != null) root.printPreOrder();
    }
    public void printInOrder(){
        if (root != null) root.printInOrder();
    }
    public void printPostOrder(){
        if (root != null) root.printPostOrder();
    }
}