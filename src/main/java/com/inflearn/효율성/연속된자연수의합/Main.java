package com.inflearn.효율성.연속된자연수의합;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        // System.out.println(main.solution(n));
        System.out.println(main.solution2(n));
    }

    private int solution2(int n) {
        // 15 -> 2개 이상의 연속된 자연수 합
        // 2개의 숫자로 생각해보면 -> 1, 2 --> 15-3=12 12/2(숫자개수) = 6 --> 1+6, 2+6 --> 7, 8이 답
        // 3개인 경우 -> 1, 2, 3 --> 15-6=9 --> 9/3 = 3 --> 4, 5, 6
        // 이런식으로 생각해본다.....
        int answer = 0;
        int count = 1;
        n--;
        while (n > 0) {
            count++;
            n = n - count;
            if (n % count == 0) {
                answer++;
            }
        }
        return answer;
    }

    public int solution(int n) {
        int answer = 0;
        int m = n /2 + 1;
        int[] numbers = new int[m];
        for (int i = 0; i < m; i++) {
            numbers[i] = i+1;
        }

        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < m; rt++) {
            sum += numbers[rt];
            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= numbers[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
