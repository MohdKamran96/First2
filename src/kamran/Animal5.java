package kamran;

public class Animal5 {
    Animal5(){
        System.out.println("dog is cresting");
    }
}
class dog extends Animal5{
    dog(){
        super();
        System.out.println("dog is creating..");

    }
}
class testAnimal5{
    public static void main(String[] args) {
        dog d1=new dog();

    }
}
