package com.inflearn.정렬.LRU;

import java.util.Scanner;

public class Main2 {

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

    public int[] solution(int s, int[] jobs) {
        int[] cache = new int[s];

        for (int i = 0; i < jobs.length; i++) {
            int pos = -1;
            int job = jobs[i];
            for (int j = 0; j < s; j++) {
                if (job == cache[j]) {
                    pos = j;
                }
            }

            if (pos == -1) {
                for (int k = s - 1; k >= 1; k--) {
                    cache[k] = cache[k - 1];
                }
            }
            else
            {
                for (int k = pos; k >= 1; k--) {
                    cache[k] = cache[k - 1];
                }
            }
        }

        return cache;
    }
}
