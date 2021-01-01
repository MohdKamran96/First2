package string;

public class Stringcount {
    public static void main(String[] args) {
        String str = "welcome to hyderbad " ;
        int count =0;
        for(int i=0; i<=str.length()-1; i++)
        {
            if(str.charAt(i) =='e')
            count++;

        }
        System.out.println("frequency of e is:" +count);
    }

}
