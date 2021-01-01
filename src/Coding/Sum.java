package Coding;

public class Sum {
    void add(int... numbers){
        StringBuffer sb=new StringBuffer();
        int sum=0;
        for(int num:numbers){
            sb.append(num+"+");
            sum+=num;
        }
        sb.setCharAt(sb.length()-1,'=');
        sb.append(sum);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Sum sum=new Sum();
         sum.add(2,3,4,5,6,7);
    }
}
