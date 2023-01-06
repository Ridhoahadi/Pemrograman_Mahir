package PemrogramanMahir;

public class BelajarSearch {
    public static void main(String[] args) {

        Stack hasil = new Stack();
        int [] data ={88, 42, 16, 62, 29, 40, 81, 33, 57};
        int n = 40;

        for (int i = 0; i < data.length; i++) {
            if (n == data[i]) {
                System.out.println("Data ke:" + n + " berada di indeks ke " + i);
            }
        }
        hasil.push(3);
    }
}
