package PemrogramanMahir.p10;

import PemrogramanMahir.Tree;

public class BelajarTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node();
        tree.root.data = 50;

        tree.root.children = new Node[3];

        tree.root.children[0] = new Node();
        tree.root.children[0].data = 18;

        tree.root.children[1] = new Node();
        tree.root.children[1].data = 34;

        tree.root.children[2] = new Node();
        tree.root.children[2].data = 21;

        tree.print();

        System.out.println(tree.root.children.length);

    }
}
