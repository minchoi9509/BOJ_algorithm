package com.inflearn.정렬.장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = kb.nextInt();
        }
        List<Integer> answers = main.solution(n, heights);
        for (int i = 0; i < answers.size(); i++) {
            System.out.print(answers.get(i) + " ");
        }
    }

    public List<Integer> solution(int n, int[] heights) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] temp = heights.clone();
        Arrays.sort(heights);

        for (int i = 0; i < n; i++) {
            if (temp[i] != heights[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }
}
