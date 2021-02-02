package control.array;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int arr[] = {33, 3, 4, 5}; //declaration, instantiation and initialization
        //printing array
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}