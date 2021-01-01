package string;

public class Containscasesensitive {
    public static void main(String[] args) {
        String str="welcome to hyderabad";
        boolean isContains=str.contains("hyderabad");
        System.out.println(isContains);
        //case sensitive
        System.out.println(str.contains("Hyderabad")); //false
    }
}
