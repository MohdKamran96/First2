package string;
// object and class intilizing to method
public class Student4 {
    int rollno;
    String name;
    void insertRecord(int r,String n){
        rollno=r;
        name=n;

    }
    void displsyInformation(){
        System.out.println(rollno+""+name);
    }
    static class Student5{
        public static void main(String[] args) {
            Student s1 =new Student();
            Student s2=new Student();
            s1.insertRecord(121,"kamran");
            s2.insertRecord(120,"kamrran");



        }
    }

}
