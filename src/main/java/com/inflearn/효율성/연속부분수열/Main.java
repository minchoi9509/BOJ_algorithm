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
        // System.out.println(main.solution(n, m, numbers));
        System.out.println(main.solution2(n, m, numbers));
    }

    public int solution2(int n, int m, int[] numbers) {
        int answer = 0;
        // 2포인트 알고리즘
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += numbers[rt];
            if (sum == m) {
                answer++;
            }
            while(sum >= m) {
                sum -= numbers[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
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
