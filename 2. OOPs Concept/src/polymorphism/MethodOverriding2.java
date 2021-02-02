package polymorphism;

class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
class RKDB extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class Prime extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class IFIC extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        RKDB rkdbObj = new RKDB();
        Prime primeObj = new Prime();
        IFIC ificObj = new IFIC();

        System.out.println("RKDB Rate of Interest: "+rkdbObj.getRateOfInterest());
        System.out.println("Prime Rate of Interest: "+primeObj.getRateOfInterest());
        System.out.println("IFIC Rate of Interest: "+ificObj.getRateOfInterest());
    }
}
