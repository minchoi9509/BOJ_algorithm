package com.inflearn.정렬.LRU;

import java.util.LinkedList;
import java.util.Queue;
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
        Queue<Integer> answers = main.solution(n, jobs);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    public Queue<Integer> solution(int n, int[] jobs) {
        Queue<Integer> answer = new LinkedList<>();
        for (int i = 0; i < jobs.length; i++) {
            if (answer.contains(jobs[i])) {
                answer.remove(jobs[i]);
            } else if (answer.size() < n) {
                answer.offer(jobs[i]);
            } else if (answer.size() == n) {
                answer.poll();
            }
        }
        return answer;
    }
}
