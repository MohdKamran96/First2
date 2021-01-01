package string;

public class Splitexp2 {
    public static void main(String[] args) {
        String s1 = "WELCOME TO SHADAN ENGINEERING COLLEGE";
        System.out.println("returning words");
        for (String w : s1.split("\\s", 0)) {
            System.out.println(w);
        }
        System.out.println("returning words");
        for (String w : s1.split("\\s", 2)) {
            System.out.println(w);
        }
        System.out.println("returning words");
        for (String w : s1.split("\\s", 1)) {
            System.out.println(w);
        }

}
}