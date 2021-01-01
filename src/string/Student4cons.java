package string;
///paramiterized constructor
public class Student4cons {
    int id;
    String  name;
    //creating parametrized constructor
    Student4cons(int i,String n){
        id=i;
        name=n;

    }
    //display method
    void display(){
        System.out.println(id+"  "+name);
    }

    public static void main(String[] args) {
        //creating an object
        Student4cons s1=new Student4cons(231,"kamran");
        Student4cons s2=new Student4cons(321,"Atif");
        s1.display();
        s2.display();
    }
}
