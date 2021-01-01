package com.nt.first;

public class StirngLib {

    public  String reverseIndividualWord(String str){
        String finalStr="";
        String tempStr="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (c==' '){
                finalStr=finalStr+tempStr+"";
                tempStr="";
            } else {
                tempStr=c+tempStr;
            }
        }
        finalStr=finalStr+tempStr;

        return finalStr;
    }
    public String reverseIndividualWordStringBuilder(String str){
   return str;
    }


    public static void main(String[] args) {
        StirngLib obj=new StirngLib();
        String str="coding simplified nice";
        System.out.println(obj.reverseIndividualWord(str));
        System.out.println(obj.reverseIndividualWordStringBuilder(str));

    }

}
