package Coding;

public class String2 {
    public static void main(String[] args) {
        String name="Program";
        System.out.println("characters in string \""+name+"\":");
        for(char c:name.toCharArray()){
            System.out.printf(c+",");
        }
    }
}
