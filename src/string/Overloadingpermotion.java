package string;

public class Overloadingpermotion {
    void sum (int a,long b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);

    }

    public static void main(String[] args) {
        Overloadingpermotion obj=new Overloadingpermotion();
        obj.sum(28,21);
        obj.sum(65,21,32);

    }


}
