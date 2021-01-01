package string;

import java.util.ArrayList;

public class Equalsignoreexp2 {
    public static void main(String[] args) {
        String Str1="KAMRAN";
        ArrayList<String>list=new ArrayList<>();
        list.add("KAMran");
        list.add("SHADAB ");
        list.add("Kamran");
        list.add("amzab bhai");
        for(String Str : list){
            if(Str.equalsIgnoreCase(Str1)){
                System.out.println("kamran is present in the list");

            }


        }
    }
}
