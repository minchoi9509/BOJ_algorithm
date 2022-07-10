package com.inflearn.hash.k번째큰수;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = kb.nextInt();
        }
        System.out.println(main.solution(n, k, cards));
    }

    public int solution(int n, int k, int[] cards) {
        int answer = 0;
        return answer;
    }
}
