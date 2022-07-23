package com.inflearn.정렬.삽입정렬;

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
        for (int i = 1; i < n; i++) {
            int temp = numbers[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp < numbers[j]) {
                    numbers[j + 1] = numbers[j];
                }
                else {
                    break;
                }
            }
            numbers[j + 1] = temp;
        }
        return numbers;
    }
}
