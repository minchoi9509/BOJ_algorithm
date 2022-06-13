package com.inflearn.array.뒤집은소수;

import java.util.ArrayList;
import java.util.List;
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

        for (int answer : main.solution(numbers)) {
            System.out.print(answer + " ");
        }
    }

    public List<Integer> solution(int[] numbers) {
        ArrayList<Integer> answers = new ArrayList<>();
        for (int number : numbers) {
            int tmp = number;
            int reverseNumber = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                reverseNumber = reverseNumber * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrimeNumber(reverseNumber)) {
                answers.add(reverseNumber);
            }
        }
        return answers;
    }

    public boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        int end = (int) Math.sqrt(number);
        for (int i = 2; i <= end; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
