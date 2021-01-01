package kamran;

public class Animal4 {
    void eat(){
        System.out.println("eating...");
    }
}
    abstract class Dog1 extends Animal4{

        void eat(){
            System.out.println("dog is eating bread..");
        }
        void bark(){
            System.out.println("dog is barking");
        }

        void work(){
            super.eat();
            bark();
        }
}
class TestSuper2{
    public static void main(String[] args) {
        Dog r=new Dog();

    }
}

