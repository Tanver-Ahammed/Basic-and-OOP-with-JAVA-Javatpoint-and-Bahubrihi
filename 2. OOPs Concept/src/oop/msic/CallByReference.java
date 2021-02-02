package oop.msic;

public class CallByReference {
    int data=50;
    void change(CallByReference obj){
        obj.data=obj.data+100;
    }
    public static void main(String[] args) {
        CallByReference obj = new CallByReference();
        System.out.println("Before change Value: "+obj.data);
        obj.change(obj);
        System.out.println("After change Value: "+obj.data);
        System.out.println("But don't change the value!!!");
    }
}
