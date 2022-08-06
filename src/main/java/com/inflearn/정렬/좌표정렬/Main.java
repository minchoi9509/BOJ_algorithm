package com.inflearn.정렬.좌표정렬;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] numbers = new int[n][2];
        for (int i = 0; i < n; i++) {
            numbers[i][0] = kb.nextInt();
            numbers[i][1] = kb.nextInt();
        }
        System.out.println(main.solution(n, numbers));
    }

    public int[][] solution(int n, int[][] numbers) {
        for (int i = 0; i <n; i++) {

        }
        return numbers;

    }
}
