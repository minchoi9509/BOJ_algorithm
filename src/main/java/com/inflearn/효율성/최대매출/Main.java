package com.inflearn.효율성.최대매출;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int day = kb.nextInt();
        int continuousDay = kb.nextInt();
        int[] sales = new int[day];
        for (int i = 0; i < day; i++) {
            sales[i] = kb.nextInt();
        }
        System.out.println(main.solution(day, continuousDay,sales));
    }

    // 생각하지도 못한 방법
    public int solution(int day, int continuousDay, int[] sales) {
        int max;
        int sum = 0;
        for (int i = 0; i < continuousDay; i++) {
            sum += sales[i];
        }

        max = sum;

        for (int i = continuousDay; i < day; i++) {
            sum += sales[i];
            sum -= sales[i - continuousDay];
            max = Math.max(max, sum);
        }
        
        return max;
    }
}
