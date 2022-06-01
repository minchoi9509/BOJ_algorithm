
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(main.solution(str));
    }

    public String solution(String text) {
        String answer = "YES";
        // 이 두번 . 하는 과정이 마음에 들지 않는다.. 쪼개자.
        // char[] chars = text.toUpperCase().toCharArray();
        text = text.toUpperCase();
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

    // 뒤집었을 때! 같다! 라는 포인트가 흥미롭다. 생각하지 못했다.
    public String solution2(String text) {
        String answer = "NO";
        StringBuilder sb = new StringBuilder(text).reverse();
        String tmp = sb.toString();
        if (text.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }
        return answer;
    }
}
