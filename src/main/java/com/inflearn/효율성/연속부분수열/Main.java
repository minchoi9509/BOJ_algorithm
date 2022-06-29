package com.inflearn.효율성.연속부분수열;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println(main.solution(n, m, numbers));
    }

    // 시간 초과
    public int solution(int n, int m, int[] numbers) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = numbers[i];
            for (int j = i+1; j < n; j++) {
                sum += numbers[j];
                if (sum == m) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
