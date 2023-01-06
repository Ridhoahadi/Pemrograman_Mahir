package PemrogramanMahir;

public class StackString {
    public String [] data;
    public int top = 0;

    public StackString(int n){
        data = new String[n];
    }

    public boolean isKosong(){
        return top == 0;
    }

    public boolean isPenuh(){
        return top == data.length;
    }

    public void push (String nilai){
        if (!isPenuh()){
            data[top] = nilai;
            top = top + 1;
        }else{
            System.out.println("Stack penuh!");
        }
    }
    public String pop (){
        if (!isKosong()){
            top = top - 1;
            String c = data[top];
            return c;
        }else{
            return null;
        }
    }
    public String peek(){
        if (!isPenuh()){
            return data[top - 1];
        }else{
            return null;
        }
    }
}
