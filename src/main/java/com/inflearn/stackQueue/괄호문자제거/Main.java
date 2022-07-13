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
        StringBuffer sb = new StringBuffer();
        Stack<Character> characters = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (!")".equals(c.toString())) {
                characters.push(c);
            } else {
                // 이 조건식이 너무 말도 안되게 맘에 안듬..
                while (!"(".equals(characters.pop().toString())) {

                }
            }
        }

        for (Character c : characters) {
            sb.append(c);
        }
        return sb.toString();
    }
}
