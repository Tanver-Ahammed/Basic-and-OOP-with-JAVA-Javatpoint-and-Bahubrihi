package control.array;

public class CloningArray {
    public static void main(String[] args) {
        int arr[]={33,3,4,5};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        int []cArr = arr.clone();
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
