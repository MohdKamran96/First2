package string;

public class ToCharArray {
    public static void main(String[] args) {
        String s1 ="hello kamran how are you";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
