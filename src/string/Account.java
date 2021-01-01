package string;

import com.sun.source.tree.LambdaExpressionTree;

public class Account {
    int acc_no;
    String name;
    float amount;
    char ifsc ;
    String name2;
    public char BARBHANFAI;
    char branch;
    int mobile_no;

    void insert(int a, String n, float amt){
       acc_no=a;
       name=n;
       name=name2;
       amount=amt;
        char c1 = 0;
        ifsc=BARBHANFAI;
        branch=c1;
        int m;
        mobile_no=mobile_no;


    }
    void setBranch(){
        System.out.println(branch+" ");
    }

    void ministatement(){


        System.out.println(acc_no+""+ifsc+" "+amount);
    }
    void setMobile_no(){
        System.out.println(mobile_no+" ");

    }
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
    void diposit(float amt){
     amount=amount+amt;
        System.out.println(amt+"diposite");

    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("insuficent balance");
        }else{
            amount=amount-amt;
            System.out.println(amt+"withdraw");
        }
    }

    void checkBalance(){
        System.out.println("Balance is: "+amount);
    }

    public void deposit(int i) {
    }
}



class  Test{
    public static void main(String[] args) {
        Account ac=new Account();
         ac.insert(112,"kamran",102 );
        ac.display();
        ac.checkBalance();
        ac.diposit(40000);
        ac.checkBalance();
        ac.withdraw(15000);
        ac.checkBalance();
        ac.display();
        ac.setBranch();


        ac.ministatement();
    }
}
