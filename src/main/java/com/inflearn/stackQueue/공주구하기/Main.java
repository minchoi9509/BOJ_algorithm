package com.inflearn.stackQueue.공주구하기;

import java.util.LinkedList;
import java.util.Queue;
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
        Queue<Integer> princes = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            princes.add(i);
        }

        int count = 1;
        while (princes.size() != 1) {
            if (count % k != 0) {
                int temp = princes.peek();
                princes.poll();
                princes.offer(temp);
            }
            else {
                princes.poll();
            }
            count++;
        }
        return princes.peek();
    }
}
