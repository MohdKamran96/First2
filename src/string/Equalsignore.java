package string;

public class Equalsignore {
    public static void main(String[] args) {
        String s1="kamran";
        String s2="amzad bhai";
        String s3="KAMRAN";
        String s4="hadees";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

    }
}
