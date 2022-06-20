package com.inflearn.array.봉우리;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[][] board = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        // System.out.println(main.solution(count, board));
        System.out.println(main.solution2(count, board));
    }

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution2(int count, int[][] board) {
        int answer = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = board[i][j] + dx[k];
                    int ny = board[i][j] + dy[k];
                    if (nx >= 0 && nx < count && ny >= 0 && ny < count && board[nx][ny] >= board[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    // runtime error Time: 228ms Memory: 31MB -- 음?
    public int solution(int count, int[][] board) {
        int answer = 0;
        for (int i = 1; i < count; i++) {
            for (int j = 1; j < count; j++) {
                int up = board[i - 1][j];
                int left = board[i][j - 1];
                int right = board[i][j + 1];
                int down = board[i + 1][j + 1];
                int target = board[i][j];

                if (up == -1 || left == -1 || right == -1 || down == -1 || target == -1) {
                    continue;
                }

                if (target > up && target > left && target > right && target > down) {
                    answer++;
                    board[i - 1][j] = -1;
                    board[i][j - 1] = -1;
                    board[i][j + 1] = -1;
                    board[i + 1][j + 1] = -1;
                    board[i][j] = -1;
                }
            }
        }
        return answer;
    }
}
