package Assignment;
import java.util.Scanner;
public class Question1 {
    public static void main(String[]args){
        Scanner sc  =new Scanner(System.in);
        //create matrix A
        System.out.println("Enter a row of matrix A:");
        int rowA=sc.nextInt();
        System.out.println("Enter a column of matrix A:");
        int colA=sc.nextInt();
        int [][]MatrixA=new int[rowA][colA];
        System.out.println("Enter elements of Matrix A:");
        for(int i =0; i<rowA; i++){
            for(int  j =0; j<colA;j++){
                MatrixA[i][j]=sc.nextInt();
            }
        }
        //create matrix B
        System.out.println("Enter a row of matrix B:");
        int rowB=sc.nextInt();
        System.out.println("Enter a column of matrix B:");
        int colB=sc.nextInt();
        int [][] MatrixB=new int[rowB][colB];
        System.out.println("Enter elements of Matrix B:");
        for(int i =0; i<rowB;i++){
            for(int j =0; j<colB;j++){
                MatrixB[i][j]=sc.nextInt();
            }
        }
        //check matrix multiplication
       if (colA!=rowB){
           System.out.println("Matrix Multiplication is not possible");
       }
           int [][] Multiplication=new int[rowA][colB];
           for(int i =0 ;i<rowA;i++){
               for(int j =0; j<colB;j++){
                for   ( int k =0; k<colA;k++){
                    Multiplication[i][j]+=MatrixA[i][k]*MatrixB[k][j];

                   }
               }
           }

       //Display result
        System.out.println("----------Matrix Multiplication of two matrix A & Matrix B----------");
       for(int i =0; i<rowA;i++){
           for(int j =0; j<colB;j++){
               System.out.println(Multiplication[i][j]+"");
           }
           System.out.println();
       }
    }
}
