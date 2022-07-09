package com.inflearn.hash.매출액의종류;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        ArrayList<Integer> answers = main.solution(n, k, numbers);
        for (Integer answer : answers) {
            System.out.print(answer + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int k, int[] numbers) {
        ArrayList<Integer> answers = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i + k < n; i++) {
            for (int j = i; j < i + k; j++) {
                set.add(numbers[j]);
                if ((j + 1) % k == 0) {
                    answers.add(set.size());
                    set = new HashSet<>();
                }
            }
        }
        return answers;
    }
}
