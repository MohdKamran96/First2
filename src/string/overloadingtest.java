package string;

public class overloadingtest {
    int max(int x,int y){
        return x>y ? x:y;
    }
    float max(float x,float y){
        return  x>y ? x:y;
    }
    int max(int x,int y,int z){
        return x>y && x>z?x :(y>z ? y:z);
    }
    

    public static void main(String[] args) {
        overloadingtest t =new overloadingtest();
        System.out.println(t.max(12,3));
        System.out.println(t.max(4.8f,8.0f));
        System.out.println(t.max(34,98,76));
    }
}
