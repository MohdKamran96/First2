package string;

public class Student0 {
    int roll_no;
    String name;
    float fee;
    Student0(int r,String n,float f){
        roll_no=r;
        name=n;
        fee=f;
    }
    void display(){
        System.out.println(roll_no+" "+name+" "+fee);
    }
    static class test{
        public static void main(String[] args) {
            Student0 s1=new Student0(111,"kamran",56458);
            Student0 s2= new Student0(112,"Atif Malik",79845);
            s1.display();
            s2.display();

        }
    }

}