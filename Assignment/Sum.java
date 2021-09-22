import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[][] arr1 ={{1,12,5},{3,-2,6}};
        //int[][] arr2 ={{1,12,5},{3,-2,6}};
        int[][] arr2 ={{1,2,2},{3,-2,5}};
        int[][] arr3 = new int[arr1.length][arr1[0].length];
        int c=0;

        for (int i=0;i< arr1.length;i++)
        {
            for (int j=0;j<arr1[0].length;j++)
            {

                    arr3[i][j]=arr1[i][j]+arr2[i][j];


            }

        }
            for (int[] a: arr3)
            {
                System.out.print("[");
                for(int n: a) {
                    System.out.print(n+" ");
                }
                System.out.print("]");
                System.out.println("");

            }


    }
}