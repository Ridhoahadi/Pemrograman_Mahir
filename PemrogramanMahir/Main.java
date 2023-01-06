package PemrogramanMahir;

public class Main {
    public static void main(String[] args) {

        Stack s1 = new Stack();

        s1.push(9);
        s1.push(50);
        s1.push(54);
        s1.push(82);

        for (int i = 0; i < s1.data.length; i++) {
            System.out.println(s1.data[i]);

        }
    }
}
