package PemrogramanMahir.p10;

public class BelajarBinaryTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.insert(21);
        tree.insert(14);
        tree.insert(36);
        tree.insert(8);
        tree.insert(16);
        tree.insert(24);
        tree.insert(39);
        tree.insert(41);

        System.out.println("Print Pre-Order");
        tree.printPreOrder();

        System.out.println("Print In-Order");
        tree.printInOrder();

        System.out.println("Print Post-Order");
        tree.printPostOrder();

    }
}