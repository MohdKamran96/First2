package string;

public class Overriding {
    void run(){
        System.out.println("Vihcle is runnig.");
    }
    // create a child class
    static class bike extends Overriding{
        void run2(){
            System.out.println("bike is running seftly");
        }
        public static void main(String[] args) {
            bike b1=new bike();
            b1.run();

        }
        // objec create



    }
}
