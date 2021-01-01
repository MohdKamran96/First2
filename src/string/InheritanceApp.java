package string;
class Product{
    int pid;
    String name;
    int price;
    //constructor
    Product(){
        System.out.println(">>product object constructed");

    }
    //method(behavior)
    void setproductDetails(int pid,String name,int price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    void showproductDe(){
        System.out.println("------Product ID:"+pid+"-----+");
        System.out.println("name\t"+name);
        System.out.println("price\t"+price);
        System.out.println("---------------------");
    }

}

public class InheritanceApp {
    public static void main(String[] args) {
        Product Product=new Product();
        System.out.println("product is :"+ Product);
        //writing data in object
        Product.setproductDetails(860,"iphonex",140000);
        Product.showproductDe();


    }

}
