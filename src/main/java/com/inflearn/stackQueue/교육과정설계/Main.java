package com.inflearn.stackQueue.교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String classes = kb.nextLine();
        System.out.println(main.solution(str, classes));
    }

    public String solution(String str, String classes) {
        String answer = YES;
        Queue<Character> essential = new LinkedList<>();

        for (char c : str.toCharArray()) {
            essential.offer(c);
        }

        for (char c : classes.toCharArray()) {
            if (essential.contains(c) && essential.peek() == c) {
                essential.poll();
            }
        }

        if (!essential.isEmpty()) {
            answer = NO;
        }

        return answer;
    }
}
