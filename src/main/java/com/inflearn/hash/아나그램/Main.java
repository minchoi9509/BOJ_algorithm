package com.inflearn.hash.아나그램;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    final static String YES = "YES";
    final static String NO = "NO";

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.nextLine();
        String str2 = kb.nextLine();
        System.out.println(main.solution(str1, str2));
    }

    public String solution(String str1, String str2) {
        String answer = YES;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Character c : map1.keySet()) {
            if (map1.get(c) != map2.get(c)) {
                answer = NO;
                break;
            }
        }
        return answer;
    }
}
