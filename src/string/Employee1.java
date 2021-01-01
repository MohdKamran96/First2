package string;

public class Employee1 {
    float salray=89157;
}
class programmer extends  Employee1 {
    int bonus = 15620;


    public static void main(String[] args) {
        programmer p1 = new programmer();
        System.out.println("programmer salery is " + p1.salray);
        System.out.println("programmer bonus is " + p1.bonus);

    }
}