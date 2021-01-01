package Coding;

public class Singleton {
    public String str;
    private static Singleton instance=null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());

    }
}
