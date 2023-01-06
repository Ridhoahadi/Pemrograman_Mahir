package PemrogramanMahir;

public class CobaRekursi {
    public static void main(String[] args) {
       rekursif(100);

    }

    //Methode rekursif
    public static void rekursif(int x) {
        if (x == 1){
            System.out.println(x);
        } else {
            rekursif(x-1);
            System.out.println(x);

        }
    }
}