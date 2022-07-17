package com.inflearn.stackQueue.공주구하기;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(main.solution(n, k));
    }

    public int solution(int n, int k) {
        int answer = 0;
        LinkedList<Integer> princes = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            princes.add(i);
        }

        while (princes.size() != 1) {

        }
        return 0;
    }
}
