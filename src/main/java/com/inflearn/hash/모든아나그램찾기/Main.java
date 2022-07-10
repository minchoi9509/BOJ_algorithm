package com.inflearn.hash.모든아나그램찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String word = kb.nextLine();
        System.out.println(main.solution(str, word));
    }

    public int solution(String str, String word) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = word.toCharArray();
        for (Character c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int lt = 0;
        char[] strChars = str.toCharArray();
        while (lt + chars.length <= strChars.length) {
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int i = lt; i < lt + chars.length; i++) {
                map2.put(strChars[i], map2.getOrDefault(strChars[i], 0) + 1);
            }

            boolean flag = true;
            for (Character c : map.keySet()) {
                if (map.get(c) != map2.get(c)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
            }
            lt++;
        }
        return answer;
    }
}
