package Assignment;
import java.util.Scanner;
import java.util.Random;
public class Question2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Random rand =new Random();
        //Write a program that prompts the user to enter the length of a square matrix,
        // randomly fills in 0s and 1s into the matrix,
        // prints the matrix, and finds the rows, columns, and diagonals (including sub-diagonal) with all 0s or 1s.
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Fill randomly with 0s and 1s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        // Print the matrix
        System.out.println("Generated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Find rows with all same values
        for (int i = 0; i < n; i++) {
            boolean allSame = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i][0]) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("Row " + i + " has all " + matrix[i][0] + "s");
            }
        }

        // Find columns with all same values
        for (int j = 0; j < n; j++) {
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (matrix[i][j] != matrix[0][j]) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("Column " + j + " has all " + matrix[0][j] + "s");
            }
        }

        // Find main diagonal
        boolean mainDiagSame = true;
        for (int i = 1; i < n; i++) {
            if (matrix[i][i] != matrix[0][0]) {
                mainDiagSame = false;
                break;
            }
        }
        if (mainDiagSame) {
            System.out.println("Main diagonal has all " + matrix[0][0] + "s");
        }

        // Find sub-diagonal
        boolean subDiagSame = true;
        for (int i = 1; i < n; i++) {
            if (matrix[i][n - 1 - i] != matrix[0][n - 1]) {
                subDiagSame = false;
                break;
            }
        }
        if (subDiagSame) {
            System.out.println("Sub-diagonal has all " + matrix[0][n - 1] + "s");
        }



    }

}
