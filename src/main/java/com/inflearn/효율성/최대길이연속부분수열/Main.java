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
        int answer = 0;
        for (int i = 0; i < n; i++) {

        }
        return answer;
    }
}
