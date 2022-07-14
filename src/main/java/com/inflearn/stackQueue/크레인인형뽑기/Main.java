package com.inflearn.stackQueue.크레인인형뽑기;

import java.util.ArrayList;
import java.util.List;
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
        ArrayList<Stack<Integer>> stacks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = n - 1; j <= 0; j--) {
                stack.push(board[i][j]);
            }
            stacks.add(stack);
        }

        for (int i = 0; i < m; i++) {
            Stack<Integer> stack = stacks.get(moves[i] - 1);

        }
        return answer;
    }
}
