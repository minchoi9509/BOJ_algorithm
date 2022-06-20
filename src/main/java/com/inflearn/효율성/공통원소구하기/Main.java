package com.inflearn.효율성.공통원소구하기;

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
        List<Integer> answers = main.solution(firstSize, firstArray, secondSize, secondArray);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    private List<Integer> solution(int firstSize, int[] firstArray, int secondSize, int[] secondArray) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> firstList = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());

        Collections.sort(firstList);
        Collections.sort(secondList);

        int min = firstSize;
        if (firstSize > secondSize) {
            min = secondSize;
        }
// 풀고 생각해보니 말이 안된다.
//        for (int i = 0; i < min; i++) {
//            if (firstList.get(i) == secondList.get(i)) {
//                answer.add(firstList.get(i));
//            }
//        }
        return answer;
    }
}
