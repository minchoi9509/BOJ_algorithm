package com.inflearn.DFSBFS.피보나치수열;

import java.util.Scanner;

public class Main {

    // 메모이제이션 > 이전에 구해놨던 값을 사용함
    static int[] fibo;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        fibo = new int[n + 1]; // 1번 인덱스부터 사용할 것임
        main.solution(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    // 피보나치
    public int solution(int n) {
        // 있는 값을 사용하는 것이 포인트
        if (fibo[n] > 0) {
            return fibo[n];
        }

        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = solution(n - 2) + solution(n - 1);
        }
    }
}
