package com.inflearn.정렬.선택정렬;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = kb.nextInt();
        }
        int[] answers = main.solution(n, numbers);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    public int[] solution(int n, int[] numbers) {
        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = i; j < n; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }
        return numbers;
    }
}
