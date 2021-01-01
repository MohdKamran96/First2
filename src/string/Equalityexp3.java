package string;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Equalityexp3 {
    public static void main(String[] args) {
        String str1="HI";
        ArrayList<String>list=new ArrayList<>();
          list.add("shadab");
          list.add("kamran");
          list.add("Amzad bhai");
          list.add("atif");
          for(String str : list){
              if(str.equals(str1)){
                  System.out.println("kamran is present in the list");
              }else
                  System.out.println("MOBILE");

          }


 }
}
