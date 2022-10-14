package com.inflearn.정렬.뮤직비디오;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 문제가 이해가 잘 안됨.
    // 결정 알고리즘
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] musics = new int[n];
        for (int i = 0; i < n; i++) {
            musics[i] = kb.nextInt();
        }
        System.out.println(main.solution(m, musics));
    }

    private int solution(int m, int[] musics) {
        int answer = 0;
        int lt = Arrays.stream(musics).max().getAsInt();
        int rt = Arrays.stream(musics).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(musics, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }

        }
        return 0;
    }

    private int count(int[] musics, int capacity) {
        int cnt = 1;
        int sum = 0;
        for (int music : musics) {
            if (sum + music > capacity) {
                cnt++;
                sum = music;
            }
            else
            {
                sum += music;
            }
        }
        return cnt;
    }
}
