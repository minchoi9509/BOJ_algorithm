package com.inflearn.정렬.이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println(main.solution(m, numbers));
    }

    public int solution(int m, int[] numbers) {
        int answer = 0;
        int standard = numbers.length / 2;
        Arrays.sort(numbers);
        while (standard > 1) {
            if (m > numbers[standard - 1]) {
                standard = (numbers.length - standard) / 2;
            }
            else if (m == numbers[standard - 1])
            {
                answer = standard - 1;
                break;
            }
            else
            {
                standard = standard / 2;
            }
        }
        return answer;
    }
}
