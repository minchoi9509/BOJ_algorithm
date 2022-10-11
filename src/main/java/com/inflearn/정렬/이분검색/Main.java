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
        System.out.println(main.solution(n, m, numbers));
    }

    private int solution(int n, int m, int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int lt = 0;
        int rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (numbers[mid] == m) {
                answer = mid + 1;
                break;
            }

            if (numbers[mid] > m) {
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    // 시간 초과 - 접근 자체는 괜찮았는데 lt, rt 개념을 사용하지 못했다.
    public int solution2(int m, int[] numbers) {
        int answer = 0;
        int standard = numbers.length / 2;
        Arrays.sort(numbers);
        while (standard > 1) {
            if (m == numbers[standard - 1])
            {
                answer = standard;
                break;
            }

            if (m > numbers[standard - 1]) {
                standard = (numbers.length - standard) / 2;
            }
            else
            {
                standard = standard / 2;
            }
        }
        return answer;
    }
}
