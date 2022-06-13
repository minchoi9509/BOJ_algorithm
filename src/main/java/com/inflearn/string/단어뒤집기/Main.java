package com.inflearn.string.단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // 나의 풀이법
    public String solution(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 1; i <= length; i++) {
            sb.append(text.charAt(length - i));
        }
        return sb.toString();
    }

    // StringBuilder 사용하기
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    // char[] 사용하기
    // 배열의 양 끝을 잡고 lt, rt로 잡아서 교환하는 방식
    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] chars = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(chars));
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
//        int times = kb.nextInt();
//        for (int i = 0; i < times; i++) {
//            System.out.println(main.solution(kb.next()));
//        }

        int n = kb.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = kb.next();
        }
        for (String x : main.solution2(n, strings)) {
            System.out.println(x);
        }
    }
}
