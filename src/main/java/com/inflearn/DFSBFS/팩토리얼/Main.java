package com.inflearn.DFSBFS.팩토리얼;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(main.solution(n));
    }

    // 팩토리얼
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        else
        {
            return n * solution(n-1);
        }
    }
}
