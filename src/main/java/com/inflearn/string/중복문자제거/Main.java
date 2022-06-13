package com.inflearn.string.중복문자제거;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(main.solution(str));
    }

    // 갑자기 중복제거 때문에 Set이 생각나서 이렇게 하기는 했지만 LinkedHashSet까지 쓸 일인가 싶긴 했다..
    public String solution(String text) {

        StringBuilder sb = new StringBuilder();
        Set<Character> characters = new LinkedHashSet<>();
        char[] chars = text.toCharArray();
        for (char c : chars)
        {
            characters.add(c);
        }
        for (Character c : characters)
        {
            sb.append(c);
        }
        return sb.toString();
    }

    // indexOf와 index(i)가 동일하면 중복되지 않은 상태임을 알 수 있다.
    public String solution2(String text) {
        String answer = "";
        for (int i = 0; i < text.length(); i++) {
            int textIndex = text.indexOf(text.charAt(i));
            System.out.println(textIndex + " " + text.charAt(i) + " " + text.indexOf(i) + " " + i);
            if (textIndex == i)
            {
                answer += text.charAt(i);
            }
        }
        return answer;
    }
}
