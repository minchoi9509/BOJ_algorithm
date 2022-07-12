package com.inflearn.hash.매출액의종류;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = kb.nextInt();
        }
        ArrayList<Integer> answers = main.solution(n, k, numbers);
        for (Integer answer : answers) {
            System.out.print(answer + " ");
        }
    }

    // Hash + sliding window
    public ArrayList<Integer> solution(int n, int k, int[] numbers) {
        ArrayList<Integer> answers = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            hashMap.put(numbers[i], hashMap.getOrDefault(numbers[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            hashMap.put(numbers[rt], hashMap.getOrDefault(numbers[rt], 0) + 1);
            answers.add(hashMap.size());
            hashMap.put(numbers[lt], hashMap.get(lt) - 1);
            if (hashMap.get(lt) == 0) {
                hashMap.remove(lt);
            }
            lt++;
        }
        return answers;
    }

    // 시간 초과
    public ArrayList<Integer> solution2(int n, int k, int[] numbers) {
        ArrayList<Integer> answers = new ArrayList<>();
        int lt = 0;
        while (lt + k <= n) {
            Set<Integer> set = new HashSet<>();
            for (int i = lt; i < lt + k; i++) {
                set.add(numbers[i]);
            }
            answers.add(set.size());
            lt++;
        }
        return answers;
    }
}
