package com.inflearn.string.가장짧은문자거리;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        String c = kb.next();
        int[] answer = main.solution(str, c);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public int[] solution(String str, String c) {
        char[] chars = str.toCharArray();
        int[] answers = new int[chars.length];
        int position = 100;
        for (int i = 0; i < chars.length; i++)
        {
            answers[i] = position;
            if (c.equals(Character.toString(chars[i])))
            {
                position = 0;
                answers[i] = 0;
            }
            position++;
        }
        position = 100;
        for (int i = chars.length - 1; i >= 0; i--)
        {
            if (c.equals(Character.toString(chars[i])))
            {
                position = 0;
            }
            else
            {
                position++;
                answers[i] = Math.min(answers[i], position);
            }
        }
        return answers;
    }
}
