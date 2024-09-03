package project_33;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of rows of matrix");
        int row = input.nextInt();
        System.out.println("Enter no of rows of matrix");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];
        System.out.println("Enter elements of the matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j< column; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Printing the 2D array");
        for(int i=0; i<row; i++){
            for(int j=0; j< column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}