package com.inflearn.array.등수구하기;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        Integer[] scores = new Integer[count];
        for (int i = 0; i < count; i++) {
            scores[i] = kb.nextInt();
        }

//        List<Integer> answers = main.solution(count, scores);
        int[] answers = main.solution2(count, scores);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    public int[] solution2(int count, Integer[] scores) {
        int[] lists = new int[count];
        for (int i = 0; i < count; i++) {
            int grade = 1;
            for (int j = 0; j < count; j++) {
                if (scores[i] < scores[j]) {
                    grade++;
                }
            }
            lists[i] = grade;
        }
        return lists;
    }

    // 정답 아님
    public List<Integer> solution(int count, Integer[] scores) {
        List<Integer> answers = new ArrayList<>();
        Integer[] temp = scores.clone();
        Arrays.sort(scores, Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            answers.add(position(temp[i], scores));
        }
        return answers;
    }

    private int position(int score, Integer[] scores) {
        int answer = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == score) {
                answer = i;
                scores[i] = 0;
            }
        }
        return answer + 1;
    }
}
