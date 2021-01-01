package string;

public class Splitexample1 {
    public static void main(String[] args) {
        String s1 ="according to Heisenberg principle any moving particle alwaays assosiated with wave";
        String[] words=s1.split("\\s");
        for (String w:words){
            System.out.println(w);
        }
    }
}
