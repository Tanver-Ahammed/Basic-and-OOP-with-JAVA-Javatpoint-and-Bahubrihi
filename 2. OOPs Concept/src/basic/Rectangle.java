package basic;

public class Rectangle {
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }
    void calculationArea(){
        System.out.println("Area of Rectangle: "+length*width);
    }
}
