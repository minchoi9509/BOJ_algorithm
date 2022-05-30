import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(main.solution(str));
    }

    // 풀었는데 정답으로 인정되지 않음. 확인 필요.
    public String solution(String str) {
        String answer = "";
        String[] arrays = str.split(" ");
        for (String s : arrays)
        {
            if (s.length() > answer.length()) {
                answer = s;
            }
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] arrays = str.split(" ");
        for (String s : arrays)
        {
            int len = s.length();
            if (len > max)
            {
                max = len;
                answer = s;
            }
        }
        return answer;
    }

    public String solution3(String str) {
        String anwser = "";
        int m = Integer.MIN_VALUE, position;
        while ((position = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, position);
            int len = tmp.length();
            if (len > m) {
                m = len;
                anwser = tmp;
            }
            str = str.substring(position + 1);
        }
        if (str.length() > m) {
            anwser = str;
        }
        return anwser;
    }
}
