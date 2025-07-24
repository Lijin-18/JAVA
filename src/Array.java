public class Array {
    public static void main(String[] args) {
        int[] myArr = new int [10];
        int[][] myArr2 = new int[5][5];
        

        // 2D array

        myArr2[2][4] = 7;
        myArr2[4][2] = 9;

        // 1D array

        myArr[0] = 10;
        myArr[5] = 78;

        for(int i=0; i<myArr2.length ; i++){
            for(int j=0 ; j<myArr2.length ; j++){
                System.out.print(myArr2[i][j]);
            }
            System.out.println();
        }
    }
}
