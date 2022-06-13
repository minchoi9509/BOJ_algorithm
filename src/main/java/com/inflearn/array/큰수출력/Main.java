package com.inflearn.array.큰수출력;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = kb.nextInt();
        }
        ArrayList<Integer> answers = main.solution(count, numbers);
        for (Integer answer : answers) {
            System.out.print(answer + " ");
        }
    }

    // 런타임 에러 - 사실 잘 모르겠다. 도대체! 기준을.. 출력 방식을 바꿔주면 된다.
    public String solution(int count, String str) {
        StringBuilder sb = new StringBuilder();
        String[] numbers = str.split(" ");

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(numbers[i]);
            int preNumber;
            if (i == 0)
            {
                preNumber = 0;
            }
            else
            {
                preNumber = Integer.parseInt(numbers[i - 1]);
            }
            if (number > preNumber) {
                sb.append(number);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public ArrayList<Integer> solution(int count, int[] numbers) {
        ArrayList<Integer> answers = new ArrayList<Integer>();

        for (int i = 0; i < count; i++) {
            int number = numbers[i];
            int preNumber;
            if (i == 0)
            {
                preNumber = 0;
            }
            else
            {
                preNumber = numbers[i - 1];
            }
            if (number > preNumber) {
                answers.add(number);
            }
        }
        return answers;
    }
}
