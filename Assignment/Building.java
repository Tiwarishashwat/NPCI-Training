public class Building {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            int t =(arr[0].length)+i+2 ;
            for (int j = 0; j < arr[0].length; j++) {
                if (i % 2 == 0)
                    System.out.print(j+1 +" ");
                else {

                    System.out.print(t+" ");
                    t--;
                }
            }
            System.out.println("");
        }
    }