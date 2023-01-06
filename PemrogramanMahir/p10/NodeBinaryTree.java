package PemrogramanMahir.p10;

public class NodeBinaryTree {
    public int data;
    public NodeBinaryTree left;
    public NodeBinaryTree right;

    public void insert (int value){
        if (value == data){
            // Error
        }else if (value < data) {
            //insert ke kiri
            if (left == null) {
                left = new NodeBinaryTree();
                left.data = value;
            } else {
                left.insert(value);
            }
        }else {
            if (right == null) {
                right = new NodeBinaryTree();
                right.data = value;
            }else {
                right.insert(value);
            }
        }
    }
    public void printPreOrder(){
        System.out.println(data);
        if (left != null) left.printPreOrder();
        if (right != null)right.printPreOrder();
    }
    public void printInOrder(){

        if (left != null) left.printInOrder();
        System.out.println(data);
        if (right != null) right.printInOrder();
    }
    public void printPostOrder(){
        if (left != null) left.printPostOrder();
        if (right != null) right.printPostOrder();
        System.out.println(data);
    }
}