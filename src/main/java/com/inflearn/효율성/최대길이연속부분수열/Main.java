package com.inflearn.효율성.최대길이연속부분수열;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println(main.solution(n, k, numbers));
    }

    public int solution(int n, int k, int[] numbers) {
        // 연속 길이: rt - lt + 1
        int answer = 0;
        int count = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (numbers[rt] == 0) {
                count++;
                while (count > k) {
                    if (numbers[lt] == 0) {
                        count--;
                    }
                    lt++;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }
}
