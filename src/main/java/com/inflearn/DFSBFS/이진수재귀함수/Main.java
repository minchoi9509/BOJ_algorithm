package com.inflearn.DFSBFS.이진수재귀함수;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        main.solution(n);
    }

    // 재귀함수
    public void solution(int n) {
        System.out.print(n % 2);

        if (n / 2 == 0) {
            return;
        }
        else
        {
            solution(n / 2);
        }
    }
}
