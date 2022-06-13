package com.inflearn.array.보이는학생;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
//        String str = kb.nextLine();
//        System.out.println(main.solution(count, str));
        int[] highs = new int[count];
        for (int i = 0; i < count; i++) {
            highs[i] = kb.nextInt();
        }
        System.out.println(main.solution(count, highs));
    }
    public int solution(int count, int[] highs) {
        int answer = 1;
        int max = highs[0];
        for (int i = 0; i < count; i++) {
            int studentHigh = highs[i];
            if (studentHigh > max)
            {
                answer++;
                max = studentHigh;
            }
        }
        return answer;
    }

    // 런타임 에러
    public int solution(int count, String str) {
        String[] students = str.split(" ");
        int answer = 1;
        int max = Integer.parseInt(students[0]);
        for (int i = 0; i < count; i++) {
            int studentHigh = Integer.parseInt(students[i]);
            if (studentHigh > max)
            {
                answer++;
                max = studentHigh;
            }
        }
        return answer;
    }
}
