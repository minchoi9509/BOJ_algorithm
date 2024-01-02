package com.inflearn.DFSBFS.송아지찾기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    int[] distance = {1, -1, 5};
    int[] check; // 체크했던 건 다시 체크하지 않겠다는 마음
    Queue<Integer> Q = new LinkedList<>();
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int E = kb.nextInt();

        System.out.println(main.solution(S, E));
    }

    // 레벨 탐색
    public int solution(int S, int E) {
        check = new int[10001];
        // S index를 시작점으로 함
        check[S] = 1;
        Q.offer(S);
        int level = 0;

        while (!Q.isEmpty()) {
            // 레벨에 있는 원소 개수
            int length = Q.size();
            for (int i = 0; i < length; i++) {
                int x = Q.poll();

                for (int j = 0; j < distance.length; j++) {
                    int nextX = x + distance[j];
                    // x 레벨이기 때문에 자식 노드의 레벨은 +1 해줘야함.
                    if (nextX == E) {
                        return level + 1;
                    }
                    if (nextX >= 1 && nextX <= 100000 && check[nextX] == 0) {
                        check[nextX] = 1;
                        Q.offer(nextX);
                    }
                }
            }
            level++;
        }

        return level;
    }
}
