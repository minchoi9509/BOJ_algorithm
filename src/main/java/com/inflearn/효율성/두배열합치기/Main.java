package com.inflearn.효율성.두배열합치기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int firstSize = kb.nextInt();
        int[] firstArray = new int[firstSize];
        for (int i = 0; i < firstSize; i++) {
            firstArray[i] = kb.nextInt();
        }
        int secondSize = kb.nextInt();
        int[] secondArray = new int[secondSize];
        for (int i = 0; i < secondSize; i++) {
            secondArray[i] = kb.nextInt();
        }
        List<Integer> answers = main.solution(firstArray, secondArray);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    public List<Integer> solution(int[] firstArray, int[] secondArray) {
        List<Integer> answer = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        answer.addAll(Arrays.stream(secondArray).boxed().collect(Collectors.toList()));
        Collections.sort(answer);
        return answer;
    }
}
