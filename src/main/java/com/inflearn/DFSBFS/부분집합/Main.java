package com.inflearn.DFSBFS.부분집합;

import java.util.Scanner;

public class Main {

    static int n;
    static int[] check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        check = new int[n + 1];
        main.solution(1);

    }

    public void solution(int L) {
        // 사용한다 or 사용하지 않는다
        if (L == n + 1) {
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i < n + 1; i++) {
                if (check[i] == 1) {
                    sb.append(i + " ");
                }
            }

            // 공집합 제거를 위함 *
            if (sb.length() > 0) {
                System.out.println(sb.toString());
            }
        }
        else
        {
            check[L] = 1; // 사용한다
            solution(L + 1); // 왼쪽 탐색
            check[L] = 0; // 사용하지 않는다
            solution(L + 1); // 오른쪽 탐색
        }
    }
}
