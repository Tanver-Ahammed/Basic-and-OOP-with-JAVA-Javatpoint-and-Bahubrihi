package basic;

public class Account {
    int acc_no;
    String name;
    float amount;
    void insertData(int a,String n,float am){
        acc_no = a;
        name=n;
        amount=am;
    }
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amount);
    }
    void withdraw(float amt){
        if (amount>amt){
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }
        else
            System.out.println("Insufficient Balance!!");
    }
    void checkBalance(){
        System.out.println("Now your balance is: "+amount);
    }
    void details(){
        System.out.println(acc_no+" "+name+" "+amount);
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.insertData(19016,"Tanver",100000);
        a.deposit(12345);
        a.withdraw(123456);
        a.checkBalance();
        a.details();

    }
}
