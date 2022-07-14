package com.inflearn.stackQueue.괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(main.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }
        return null;
    }

    public String solution2(String str) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> characters = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (')' == c ) {
                characters.push(c);
            } else {
                // 이 조건식이 너무 말도 안되게 맘에 안듬..
                while ('(' != characters.pop()) {

                }
            }
        }

        for (Character c : characters) {
            sb.append(c);
        }
        return sb.toString();
    }
}
