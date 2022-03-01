package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split(" ");
        int n = Integer.parseInt(split[0]);
        int[][]matrix = new int[n][n];

        for (int i =0;i<n;i++){
            string =scanner.nextLine();
            for (int j =0;j<n;j++){
                split =string.split(" ");
                matrix[i][j] = Integer.parseInt(split[j]);
            }
        }
        scanner.close();

        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j){
                    matrix[i][j]= Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);
                }

        for(int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                if(j!=(n-1)) {
                    System.out.print(matrix[i][j]+" ");
                }
                else {
                    System.out.print(matrix[i][j]);
                    System.out.println();
                }
            }
        }

    }
}
