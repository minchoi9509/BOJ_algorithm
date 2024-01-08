package com.inflearn.DFSBFS활용.합같은부분집합;

import java.util.Scanner;

public class Main {

    static String YES = "YES";
    static String NO = "NO";

    static String answer = YES;

    static int n, total = 0;
    boolean flag = false;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr =  new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        main.solution(0, 0, arr);
        System.out.println(answer);
    }

    public void solution(int L, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if (sum > total / 2) {
            return;
        }
        if (L == n) {
            if ((total-sum) == sum) {
                answer = YES;
                flag = true;
            }
            else
            {
                solution(L + 1, sum + arr[L], arr);
                solution(L + 1, sum, arr);
            }
        }
    }
}
