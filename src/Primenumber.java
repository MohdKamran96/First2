public class Primenumber {
    public static void main(String[] args) {
        int i,j ,temp=0,flag;
        for(i=1;i<=100;i++)
            for(j=2;j<=i-1;j++){
                if(i%2==0){
                  temp=temp+1;
                    System.out.println(i-j);
                }
            }
        if(i%2==0){
            temp=temp-1;
        }

                //System.out.println(temp+1);

                }
    }

