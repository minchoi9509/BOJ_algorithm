package com.inflearn.stackQueue.올바른괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(main.solution(str));
    }

    // 런타임 에러. equals 확인하는 부분 마음에 안들음.
    public String solution(String str) {
        String answer = YES;
        Stack<Character> characters = new Stack<>();
        for (Character c : str.toCharArray()) {
            if ("(".equals(c.toString())) {
                characters.push(c);
            } else if (")".equals(c.toString())) {
                characters.pop();
            }
        }

        if (characters.size() != 0) {
            answer = NO;

        }
        return answer;
    }
}
