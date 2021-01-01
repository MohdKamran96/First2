package string;

public class Animal4 {
    void eat(){
        System.out.println("eating.......");
    }

}
class Dog1 extends Animal4{
    void bark1(){
        System.out.println("barking........");
    }
}
class Cat1 extends Dog1{
    void meow(){
        System.out.println("meowing.........");
    }
}
class TestInheritance2{
    public static void main(String[] args) {
        Cat1 c=new Cat1();
         c.eat();
         c.bark1();
         c.meow();
    }
}
