package programmers.JadenCase;

public class Solution {
    public String solution(String s) {
        s = s.toLowerCase();

        String answer = "";

        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.length() == 0) {
                answer += " ";
                continue;
            }
            answer += word.substring(0, 1).toUpperCase();
            answer += word.substring(1, word.length());

            if (i != words.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}
