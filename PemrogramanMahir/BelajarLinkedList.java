package PemrogramanMahir;

import PemrogramanMahir.p10.BinaryTree;

public class BelajarLinkedList {
    public static void main(String[] args) {

        List gerbong1 = new List();
        gerbong1.data = 9;

        List gerbong2 = new List();
        gerbong2.data =12;

        List gerbong3 = new List();
        gerbong3.data =44;

        gerbong1.next = gerbong2;
        gerbong2.next = gerbong3;

        System.out.println(gerbong1.data);
        System.out.println(gerbong2.data);
        System.out.println(gerbong1.next.data);
        System.out.println(gerbong2.next.data);
        System.out.println(gerbong1.next.next.data);


    }

    public static class BelajarBinaryTree {
        public static void main(String[] args) {

            BinaryTree tree = new BinaryTree();
            tree.insert(32);
            tree.insert(14);
            tree.insert(7);
        }
    }
}
