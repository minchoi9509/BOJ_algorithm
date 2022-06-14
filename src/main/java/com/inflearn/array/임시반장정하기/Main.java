package com.inflearn.array.임시반장정하기;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int numbers = kb.nextInt();
        int[] lists = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            for (int j = 0; j < 5; j++) {
                main.solution(numbers, lists);
            }
        }
        System.out.println();
    }

    private int solution(int numbers, int[] lists) {
        int answer = 0;
        int[] temp = new int[numbers];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numbers; j++) {

            }
        }
        return answer;
    }
}
