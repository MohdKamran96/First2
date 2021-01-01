package string;

public class Student8 {
    int roll_no;
    String name;
    static String college="Shadan Engineering College";
    // static method to change the variable
    static void change(){
        college="IIT KHADAKPUR";

    }
    // constructor the initilize
    Student8(int r, String n){
        roll_no=r;
        name=n;


    }
    void display(){
        System.out.println(roll_no+" "+name+" "+college);
    }

    static class TestStaticmethod{
        public static void main(String[] args) {
            Student8.change(); //calling.. change method
            // creating object
            Student8 s1=new Student8(860,"kamran");
            Student8 s2 = new Student8(123,"Atif Malik");
            Student8 s3 =new Student8(89756,"Shadab Khan");
            s1.display();
            s2.display();
            s3.display();



        }

    }
}
