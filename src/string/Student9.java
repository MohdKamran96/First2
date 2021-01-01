package string;

public class Student9 {
    int roll_no;
    String name;
    static String college="Shadan Engineering College";
    // static method to change the variable
    static void change(){
        college="IIT KHADAKPUR";

    }
    // constructor the initilize
    Student9(int r, String n){
        roll_no=r;
        name=n;


    }
    void display(){
        System.out.println(roll_no+""+name+""+college);
    }

    static class TestStaticmethod{
        public static void main(String[] args) {
            Student8.change(); //calling.. change method
            // creating object
            Student9 s1=new Student9(860,"kamran");
            Student9 s2 = new Student9(123,"Atif Malik");
            Student9 s3 =new Student9(89756,"Shadab Khan");



        }

    }
}

