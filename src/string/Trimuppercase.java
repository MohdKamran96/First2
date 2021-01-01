package string;

import java.util.Locale;

public class Trimuppercase {
    public static void main(String[] args) {
        String s1="hello kamran";
        String s2="hello string";
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);
        String tur=s2.toUpperCase(Locale.forLanguageTag("tr"));
        String russia=s2.toUpperCase(Locale.forLanguageTag("ru"));
        System.out.println(russia);
        System.out.println(tur);
    }
}
