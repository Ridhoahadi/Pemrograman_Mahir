package PemrogramanMahir;

public class LinkedList {
    public List head;

    public void insertFront(int nilai){
        List baru = new List();
        baru.data = nilai;
        baru.next = head;
        head = baru;

    }
    public void insertionBack(int nilai){
        List current = new List();
        current.next = head;
    }
}
