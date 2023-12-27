package com.inflearn.정렬.마구간정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 결정 알고리즘은 이분 검색을 기반으로 함.
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();

        int[] horses = new int[n];
        for (int i = 0; i < n; i++) {
            horses[i] = kb.nextInt();
        }

        System.out.println(main.solution(n, c, horses));
    }

    public int solution(int n, int c, int[] horses) {
        int answer = 0;

        Arrays.sort(horses);
        int lt = 1;
        int rt = horses[n - 1];

        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            if (count(horses, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            }
            else
            {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public int count(int[] horses, int mid) {
        int count = 1;
        int endPoint = horses[0];

        for (int i = 1; i < horses.length; i++) {
            if (horses[i] - endPoint >= mid) {
                count++;
                endPoint = horses[i];
            }
        }
        return count;
    }
}
