package com.inflearn.stackQueue.후위식연산;

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
        Stack<Integer> stacks = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stacks.push(Character.getNumericValue(c));
            }
            else {
                stacks.push(calculate(c, stacks.pop(), stacks.pop()));
            }
        }
        return stacks.peek();
    }

    public int calculate(char c, int a, int b) {
        if (c == '+') {
            return b + a;
        } else if (c == '-') {
            return b - a;
        } else if (c == '*') {
            return b * a;
        } else {
            return b / a;
        }
    }
}
