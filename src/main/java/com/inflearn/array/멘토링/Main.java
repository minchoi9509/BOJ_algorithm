package com.inflearn.array.멘토링;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] scores = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                scores[i][j] = kb.nextInt();
            }
        }
        System.out.println(main.solution(n, m, scores));
    }

    public int solution(int n, int m, int[][] scores) {
        return 0;
    }
}
