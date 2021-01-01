package kamran;

public class Animal2 {
    String color="white";
}
class Dog extends Animal2{
    public Object work;
    String color="black";
    void printcolor(){
        System.out.println(color); // print the colour of dog
        System.out.println(super.color);  // print color of class animal

    }
}
class testsuper{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.printcolor();
    }
}
