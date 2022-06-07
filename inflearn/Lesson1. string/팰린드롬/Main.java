
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(main.solution(str));
    }

    // 이런식으로 푸는게 맞는거 같은데 채점 결과가 안 통과되서 (1문제에 대해서) 질문 댓글 확인 필요 -> kb.nextLine();
    // 문제 이해를 제대로 못해서 정규식을 [^A-Z0-9] 이런식으로 했어서 약간 해맸다.
    public String solution(String text) {
        String answer = "YES";
        text = text.toUpperCase();
        text = text.replaceAll("[^A-Z]", "");
        char[] chars = text.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;
        while (lt < rt)
        {
            if (chars[lt] != chars[rt])
            {
                answer = "NO";
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public String solution2(String text) {
        String answer = "NO";
        text = text.toUpperCase();
        text = text.replaceAll("[^A-Z]", "");
        StringBuilder sb = new StringBuilder(text).reverse();
        String tmp = sb.toString();
        if (text.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }
}
