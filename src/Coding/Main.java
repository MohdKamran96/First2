package Coding;

class  Test1{

}
class  Test2{

}

public class Main {
    public static void main(String[] args) {
        Test1 test1=new Test1();
        Test2 test2=new Test2();
        System.out.println("one object is created :"+test1.getClass());
        System.out.println("second object is created:"+test2.getClass());
    }
}
