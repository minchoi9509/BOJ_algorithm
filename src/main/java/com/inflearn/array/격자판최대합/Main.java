package com.inflearn.array.격자판최대합;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[][] arrays = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                arrays[i][j] = kb.nextInt();
            }
        }
        System.out.println(main.solution(number, arrays));
    }
 
    // 비효율.. 끝판왕
    public int solution(int number, int[][] arrays) {
        // 행
        int rowMax = 0;
        for (int i = 0; i < number; i++) {
            int rowSum = 0;
            for (int j = 0; j < number; j++) {
                rowSum += arrays[i][j];
            }
            if (rowSum > rowMax) {
                rowMax = rowSum;
            }
        }
        // 열
        int colMax = 0;
        for (int i = 0; i < number; i++) {
            int colSum = 0;
            for (int j = 0; j < number; j++) {
                colSum += arrays[j][i];
            }
            if (colSum > colMax) {
                colMax = colSum;
            }
        }
        // 대각선 [0,0] [1,1]
        int diagonalSum = 0;
        for (int i = 0; i < number; i++) {
            diagonalSum += arrays[i][i];
        }
        int reverseDiagonalSum = 0;
        // 대각선 반대 [0,4] [1,3]
        for (int i = 0; i < number; i++) {
            reverseDiagonalSum += arrays[i][number - i - 1];
        }

        return max(rowMax, colMax, diagonalSum, reverseDiagonalSum);
    }

    public int max(int rowMax, int colMax, int diagonalSum, int reverseDiagonalSum) {
        int max = rowMax;
        if (colMax > max) {
            max = colMax;
        }
        if (diagonalSum > max) {
            max = diagonalSum;
        }
        if (reverseDiagonalSum > max) {
            max = diagonalSum;
        }
        return max;
    }
}
