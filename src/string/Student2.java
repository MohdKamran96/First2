package string;
//initialize object through the refrence
public class Student2 {
    int id;
    String name;

}
class TestStudent2{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.id=19081;
        s1.name="Amzad";
        s2.id=8601;
        s2.name="Shadab";


        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);

    }
}
