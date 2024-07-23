package TWODMARIX;

import java.util.*;

public class TransposeMatrix {
    static void printmatrix(int[][] matrix)
    {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; i<matrix.length; j++){
                System.out.println(matrix[i][j]+ "  ");
            }
            System.out.println( );
        }
    }
    // Transpose
    
    static int[][] findTranpose(int[][] matrix,int r,int c){
        int[][] ans = new int[c][r];
        for(int i=0; i < c; i++){
            for(int j=i; j < r; j++){
                //swap
          
            }
        }
        return  ans; 

    }
    static void transposePlace(int[][] matrix,int r,int c){
       for(int i=0; i<c; i++){
        for(int j=0; j<r; j++){
            int temp = matrix[i][j];
            matrix[i][j]=matrix[j][j];
            matrix[j][i]=temp; 
        }
       } 

    }





    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of row and colums of numbwr");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
       int totelelement = r*c;
       System.out.println("Enter" + totelelement+"values");
       for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            matrix[i][j]=sc.nextInt();

        }
       }
       System.out.println("Input Martix");
       printmatrix(matrix);
       System.out.println("Transpose OF MArtix");
       int[][]ans = findTranpose(matrix, r, c);
       printmatrix(ans);



    }

     
    
}
