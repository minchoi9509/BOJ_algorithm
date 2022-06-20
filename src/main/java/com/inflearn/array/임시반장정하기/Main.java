package com.inflearn.array.임시반장정하기;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int numbers = kb.nextInt();
        int[][] lists = new int[numbers+1][6];
        for (int i = 1; i <= numbers; i++) {
            for (int j = 1; j <= 5; j++) {
                lists[i][j] = kb.nextInt();
            }
        }
        System.out.println(main.solution(numbers, lists));
    }

    private int solution(int numbers, int[][] lists) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <=numbers; i++) {
            int count = 0;
            for (int j = 1; j <= numbers; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (lists[i][k] == lists[j][k]) {
                        count++;
                        break;
                    }
                }
            }

            if (count > max) {
                max = count;
                answer = i;
            }
        }
        return answer;
    }
}
