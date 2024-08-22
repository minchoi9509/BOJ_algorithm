package programmers.숫자문자열과영단어;

public class Solution {
    String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public int solution(String s) {
        String answer = s;

        for (int i = 0; i < numbers.length; i++) {
            String number = numbers[i];
            if (answer.contains(number)) {
                answer = answer.replace(number, String.valueOf(i));
            }
        }
        return Integer.valueOf(answer);
    }
}