package com.inflearn.DFSBFS.재귀함수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        main.solution(n);
    }

    // 재귀함수
    public void solution(int n) {
        if (n == 0) {
            return;
        }
        else
        {
            solution(n-1);
            // stack을 사용하기 때문에 프린트를 뒤에서 해야 함.
            // solution(3) -> solution(2) -> solution(1) 호출되니까 진행 후 sout.
            System.out.print(n+" ");
        }
    }
}
