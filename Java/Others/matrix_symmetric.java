/** Q3 Java program to check whether a matrix is symmetric or not. */

import java.util.Scanner;

public class matrix_symmetric {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter elements: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the input matrix: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        if(rows != cols) {
            System.out.println("The given matrix is not a square matrix, so it is not symmetric.");
        }
        else {
            boolean symmetric = true;
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    if(matrix[i][j] != matrix[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
            }

            if(symmetric) {
                System.out.println("The given matrix is symmetric...");
            }
            else {
                System.out.println("The given matrix is not symmetric...");
            }
        }
        sc.close();
    }  
} 
