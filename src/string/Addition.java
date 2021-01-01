package string;

public class Addition {
    public static void main(String[] args) {
        int a=19;
        int b=56;
        //method calling
        int c= Add(a,b);
        System.out.println("enter the a and b is :"+c);
    }

    private static int Add(int n1, int n2) {
        int s;
        s=n1+n2;
        return s;
    }
}
