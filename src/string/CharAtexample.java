package string;

public class CharAtexample {
    public static void main(String[] args) {
        String str="Welcome to hyderabad";
        for(int i=0;i<=str.length()-1;i++){
            if(i%2!=0){
                System.out.println(" CharAt " + i + " place " + str.charAt(i));
                System.out.println(" "+ str.charAt(i));
            }
        }
    }
}
