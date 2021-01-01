package string;

public class Overloading {
    void sum(int a,long b){
        System.out.println(a+b);
    }
    void sum(int a,float b,double c){
        System.out.println(a+b+c);
    }

        public static void main(String[] args) {
        Overloading s1 =new Overloading();
        s1.sum(45,84);
        s1.sum(21, 78.6f,78l );

        }
    }
