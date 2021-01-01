package string;

public class Student5copy {
    int id;
    String name;
    // constructor initilize two argument
    Student5copy(int i,String n){
        id=i;
        name=n;

    }
    //constructor initilize the another object
    Student5copy(Student5copy s){
        id=s.id;
        name=s.name;


    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student5copy s1=new Student5copy(456,"kamran");
        Student5copy s2=new Student5copy(s1);
        s1.display();
        s2.display();
    }
}
