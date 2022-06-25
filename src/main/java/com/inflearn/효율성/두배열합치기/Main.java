package com.inflearn.효율성.두배열합치기;

import java.util.*;
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
        // List<Integer> answers = main.solution(firstArray, secondArray);
        List<Integer> answers = main.solution(firstArray, secondArray, firstSize, secondSize);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    private List<Integer> solution(int[] firstArray, int[] secondArray, int firstSize, int secondSize) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < firstSize && p2 < secondSize) {
            if (firstArray[p1] < secondArray[p2]) {
                // p1++ 이므로 add 이후에 값이 증가 됨;
                answer.add(firstArray[p1++]);
            } else {
                answer.add(secondArray[p2++]);
            }
        }
        while (p1 < firstSize) {
            answer.add(firstArray[p1++]);
        }

        while (p2 < secondSize) {
            answer.add(secondArray[p2++]);
        }
        return answer;
    }

    public List<Integer> solution(int[] firstArray, int[] secondArray) {
        List<Integer> answer = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        answer.addAll(Arrays.stream(secondArray).boxed().collect(Collectors.toList()));
        Collections.sort(answer);
        return answer;
    }
}
