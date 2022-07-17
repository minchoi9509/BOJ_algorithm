package com.inflearn.stackQueue.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(main.solution(str));
    }

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stacks = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stacks.push('(');
            }
            else {
                stacks.pop();
                // 이 부분을 생각하지 못함. 문제를 더 잘 읽자!
                if (str.charAt(i - 1) == '(') {
                    answer += stacks.size();
                }
                else {
                    answer++;
                }
            }
        }
        return answer;
    }
}
