package com.inflearn.효율성.연속된자연수의합;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(main.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i+1;
        }

        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += numbers[rt];
            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= numbers[lt];
                lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
