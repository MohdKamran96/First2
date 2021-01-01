package string;

public class Adder {
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class testoverloding{
    public static void main(String[] args) {
        System.out.println(Adder.add(56,86));
        System.out.println(Adder.add(92,45,78));
    }
}
