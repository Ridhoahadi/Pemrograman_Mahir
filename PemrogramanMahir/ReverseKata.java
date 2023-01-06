package PemrogramanMahir;

import java.util.Scanner;

public class ReverseKata {
    public static void main(String[] args) {
        StackString stack = new StackString(4);
        String input = "Saya, sedang, belajar, ngoding";
        Scanner baca = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            stack.push(baca.next());
        }

        for (int i = 0; i < 4; i++) {
            System.out.println( stack.pop() + " ");
        }
    }
}
