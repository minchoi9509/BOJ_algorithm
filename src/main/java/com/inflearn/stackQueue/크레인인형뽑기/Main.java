package com.inflearn.stackQueue.크레인인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < n; i++) {
            moves[i] = kb.nextInt();
        }
        System.out.println(main.solution(n, board, m, moves));
    }

    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int position : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][position - 1] != 0) {
                    int tmp = board[i][position - 1];
                    board[i][position - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }
                    else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
