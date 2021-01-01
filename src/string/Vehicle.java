package string;

public class Vehicle {
    void run(){
        System.out.println("bike is running...");
    }
   static class bike extends Vehicle{
        void run(){
            System.out.println("bike is running seftly");
        }

        public static void main(String[] args) {
            bike b1=new bike();
            b1.run();

        }
    }
}
