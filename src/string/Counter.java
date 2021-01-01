package string;

public class Counter {
    //java program to demonstrate the use of an instance variable
     int count=7;

    Counter(){
        count++; // increament value
        System.out.println(count);


    }

    public static void main(String[] args) {
        // creating object
        Counter c1 =new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
