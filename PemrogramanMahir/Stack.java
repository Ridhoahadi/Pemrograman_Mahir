package PemrogramanMahir;

import java.util.Scanner;

public class Stack {

    //ini adalah field
    int top;
    int[] data = new int[5];

    public void push(int nilai) {
        //cek apakah full
        if (top >= data.length) {
            return;
        }
        data[top] = nilai;
        top = top + 1;

    }
    public int pop(){
        //cek apakah empty
        if (top <= 0){
            return -99;
        }
        top = top -1;
        int temp = data[top];
        data[top] = 0;
        return temp;
    }
}
