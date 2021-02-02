package oop.msic;

public class CallByValue {
    int data=50;
    void change(int data){
        data=data+100;
    }
    public static void main(String[] args) {
        CallByValue obj = new CallByValue();
        System.out.println("Before change Value: "+obj.data);
        obj.change(500);
        System.out.println("After change Value: "+obj.data);
        System.out.println("But don't change the value!!!");
    }
}
