package string;
// constructor overloading
public class Student5overloading {
    int id;
    String name;
    int age;
    //create two argument constructor
    Student5overloading(int i, String n){
        id=i;
        name=n;

    }
    //creating three arg constructor
    Student5overloading(int i,String n,int a){
        id=i;
        name=n;
        age=a;

    }
    void display(){
        System.out.println(id+" "+name+" "+age);

    }

    public static void main(String[] args) {
        //creating object
        Student5overloading s1=new Student5overloading(456,"Mohd Imran",25);
        Student5overloading s2=new Student5overloading(786,"Mohd rizwan",30);
        s1.display();
        s2.display();

    }


}

