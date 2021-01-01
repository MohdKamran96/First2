package kamran;

import java.util.Scanner;

//import static com.sun.tools.javac.jvm.ByteCodes.pop;

public class Stack {
    static Scanner sc=new Scanner(System.in);
    static int stack[],top=-1;
    static {
        Stack.create();

    }
    public static void main(String[] args) {
        int ch,item;
        while(true){
            System.out.print("1.Push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.traverse");
            System.out.println("5.quit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Enter element");
                    item=sc.nextInt();
                    stack.clone();
                    break;
                case 2:
                    System.out.println("Enter element:");
                    item =sc.nextInt();
                    stack.clone();
                    break;
                case 3:
                    System.out.println("Enter element");
                    item=sc.nextInt();
                    stack.clone();
                    peek();
                    break;
                case 4: traverse();
                break;
                default:

            }
        }
    }

    private static void traverse() {
    }

    private static void peek() {
    }

    private static void pop() {
    }

//    private static void Push() {
//    }

    static void create(){
        int size;
        System.out.println("Enter size of stack:");
        size=Stack.sc.nextInt();
        Stack.stack=new int[size];
        System.out.println("stack is created with size:"+size);
    }
    static void push(int item){
        if (isFull()) {
            System.out.println("stack os overflow");

        } else {
            Stack.stack[++top] = item;
        }
    }
    static boolean isFull() {
        return true;


    }


        }
    