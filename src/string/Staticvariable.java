package string;

public class Staticvariable {
    int roll_no;
    String name;
   static String college= "Shadan Engineering college";
    static String company= "Value labs";
    //constructor
    Staticvariable(int r ,String n,String c){
        roll_no=r;
        name=n;
       // company=c1;

       // college=c;

    }
   /* Staticvariable(String n ,String c1){
        company=c1;
        name=n;

    }*/
    void display(){
        //display method
        System.out.println(roll_no+" "+name+" ");
    }
    void display1(){
        System.out.println(roll_no+" "+name+" "+company);
    }
}
  class TestShadab{
     public static void main(String[] args) {
         // object create
         Staticvariable s1=new Staticvariable(786,"Kamran","Shadan Engineering college ");
         Staticvariable s2=new Staticvariable(456,"Amzad Khan","value labs");
         //Staticvariable s3 =new Staticvariable("Amzad"," ValueLab");
         s1.display();
         s2.display();
        // s3.display1();

     }
 }



