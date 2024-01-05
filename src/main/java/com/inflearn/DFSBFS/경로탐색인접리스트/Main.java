package com.inflearn.DFSBFS.경로탐색인접리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        check = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        main.solution(1);
        System.out.println(answer);
    }

    public int solution(int v) {
        if (v == n) {
            answer++;
        }
        else
        {
            for (int nextV : graph.get(v)) {
                if (check[nextV] == 0) {
                    check[nextV] = 1;
                    solution(nextV);
                    check[nextV] = 0;
                }
            }
        }
        return answer;
    }
}
