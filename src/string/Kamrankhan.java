package string;

public class Kamrankhan {
    int roll_no;
    float fee;
    String name, course;
    Kamrankhan(int roll_no,String name ,String course){
        this.roll_no=roll_no;
        this.course=course;
        this.name=name;

    }
    // constructor
    Kamrankhan(int roll_no,String name,String course,float fee){
        this(roll_no,name,course);
        this.fee=fee;

    }
    void display(){
        System.out.println(roll_no+" "+name+" "+course+" "+fee);
    }
   static class test{
        public static void main(String[] args) {
            Kamrankhan k1=new Kamrankhan(1112,"kamran","mathmatics",198700) ;
            Kamrankhan k2 = new Kamrankhan(133236,"Amzad khan","physics",789465);
            k1.display();
            k2.display();
        }
    }
}
