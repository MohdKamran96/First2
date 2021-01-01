package string;

public class Defaultcon {
    int id;
    String name;

    Defaultcon(int i,String n){
        id=i;
        name=n;

    }
    void display(){

        System.out.println(id+" "+name);
        //System.out.println(123,"kamran");
    }

    public static void main(String[] args) {
        Defaultcon c1=new Defaultcon(123,"Kamran");
        Defaultcon c2=new Defaultcon(321,"Amzad");
        c1.display();
        c2.display();
    }
}
