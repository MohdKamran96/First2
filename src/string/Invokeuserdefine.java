package string;

import java.util.Scanner;

public class Invokeuserdefine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        //reding value from the user
        int num=scan.nextInt();
        //method calling
        
        findEvenOdd(num);


    }

    private static void findEvenOdd(int num) {
        System.out.println("enter the a number");
    }
}
