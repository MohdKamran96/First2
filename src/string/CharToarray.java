package string;

public class CharToarray {
    public static void main(String[] args) {
        String s1="welcome to javatpoint";
        char []ch =s1.toCharArray();
        int len=ch.length;
        System.out.println("char array length:" +len );
        System.out.println("char array element:");
        for(int i=0;i<len;i++){
            System.out.println(ch[i]);
        }
    }
}
