public class Diagonalsum {
  
    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        // brout force approch with time complexity O(n^2)
        // for (int i = 0; i < matrix.length; i++) {    //TC = n
        //     for(int j = 0; j<matrix[0].length;j++){ //TC = n

        //         // primary diagonal
        //         if (i==j) {
        //             sum = sum + matrix[i][j];
        //         }else if(i+j==matrix.length-1){ //secondary diagonal
        //             sum = sum + matrix[i][j];
        //         }
        //     }
        // }


  

        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
}
