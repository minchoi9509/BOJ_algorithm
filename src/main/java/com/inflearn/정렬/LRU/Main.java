package com.inflearn.정렬.LRU;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] jobs = new int[s];
        for (int i = 0; i < s; i++) {
            jobs[i] = kb.nextInt();
        }
        int[] answers = main.solution(s, jobs);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    // 삽입정렬
    public int[] solution(int s, int[] jobs) {
        int[] answer = new int[s];
        for (int job : jobs) {
            int position = -1;
            for (int i = 0; i < s; i++) {
                if (job == answer[i]) {
                    position = i;
                }
            }
            if (position == -1) {
                for (int i = s - 1; i >= 1 ; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            else {
                for (int i = position; i >= 1 ; i--) {
                    answer[i] = answer[i - 1];
                }
            }

            answer[0] = job;
        }
        return answer;
    }
}
