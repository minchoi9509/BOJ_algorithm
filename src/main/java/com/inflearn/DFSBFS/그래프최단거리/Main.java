package com.inflearn.DFSBFS.그래프최단거리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, dis;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        main.solution(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }

    public void solution(int v) {
        Queue<Integer> queue = new LinkedList<>();
        check[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int checkV = queue.poll();
            for (int nv : graph.get(checkV)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[checkV] + 1;
                }
            }
        }
    }
}
