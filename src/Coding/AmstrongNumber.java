package Coding;

public class AmstrongNumber {

    public static void main(String[] args) {
        int num=370,number, temp, total=0;
        number=num;
        while (number!=0){
         temp=number%10;
         total=total+temp*temp*temp;
         num/=10;
        }
        if (total ==number){
            System.out.println("number is amstrong ");
        }
        else {
            System.out.printf("not amstrong");
        }
    }
}
