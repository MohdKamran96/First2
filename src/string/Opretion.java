package string;

public class Opretion {
    int square(int n){
        return n*n;
    }
}
class Circle{
    Opretion op;  // aggregation
    double pi=3.14;
    double area(int radius){
        op=new Opretion();
        op=new Opretion();
        int resquare= op.square(radius);
        return pi*resquare;
    }

    public static void main(String[] args) {
        Circle c=new Circle();
        double result=c.area(5);
        System.out.println(result);
    }
}
