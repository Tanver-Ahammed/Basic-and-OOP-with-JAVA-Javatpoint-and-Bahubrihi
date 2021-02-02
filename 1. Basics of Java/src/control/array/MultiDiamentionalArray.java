package control.array;

public class MultiDiamentionalArray {
    public static void main(String[] args) {
        int [][]arr1 = new int[3][3];
        arr1[0][0]=1;
        arr1[0][1]=2;
        arr1[0][2]=3;
        arr1[1][0]=4;
        arr1[1][1]=5;
        arr1[1][2]=6;
        arr1[2][0]=7;
        arr1[2][1]=8;
        arr1[2][2]=9;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");

        int arr2[][]={{1,2,3},{2,4,5},{4,4,5}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }


    }
}
