package com.inflearn.hash.k번째큰수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

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

    // Set에다가 넣어 버리면 중복 제거를 통해서 k번째도 찾고 정렬까지 찾고.. 오..
    public int solution(int n, int k, int[] cards) {
        int answer = -1;
        TreeSet<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    numbers.add(cards[i] + cards[j] + cards[l]);
                }
            }
        }

        int count = 0;
        for (Integer number : numbers) {
            count++;
            if (count == k) {
                return number;
            }
        }
        return answer;
    }
}
