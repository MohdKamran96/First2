package string;

public class Calculate {
    static int cube (int x){
        return x*x*x;
    }

    public static void main(String[] args) {
        int result=Calculate.cube(9);
        System.out.println(result);
    }
}
