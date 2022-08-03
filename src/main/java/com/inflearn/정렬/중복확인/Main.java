package com.inflearn.정렬.중복확인;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    final static String DUPLICATION = "D";
    final static String UNIQUE = "U";

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println(main.solution(numbers));
    }

    public String solution(int[] numbers) {
        String answer = UNIQUE;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                answer = DUPLICATION;
                break;
            }
        }
        return answer;
    }
}
