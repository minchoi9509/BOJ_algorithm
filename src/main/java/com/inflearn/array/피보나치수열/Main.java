package com.inflearn.array.피보나치수열;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] answers = main.solution(count);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    public int[] solution(int count) {
        int[] answers = new int[count];
        answers[0] = 1;
        answers[1] = 1;
        for (int i = 2; i < count; i++) {
            answers[i] = answers[i - 2] + answers[i - 1];
        }
        return answers;
    }
}
