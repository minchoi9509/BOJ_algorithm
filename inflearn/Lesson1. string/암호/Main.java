
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        String str = kb.next();
        System.out.println(main.solution(count, str));
        // System.out.println(main.solution2(count, str));
    }

    // 나의 코드
    // 문제였던 부분: substring을 원래 i랑 i+7로 하고 있어서 값이 의도한바와 달랐다. i는 count의 증가값이니까 말이 안됨.
    // 또 원래는 Integer.parseInt의 2진수로 만들어주는 기능을 몰라서 Math.pow로 거듭 제곱 직접해가면서 값을 구하고 있었는데 그 부분에서 오류 나고 있었다.
    public String solution(int count, String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
        {
            int start = i * 7;
            String sub = text.substring(start, start + 7);
            sub = sub.replace("#", "1");
            sub = sub.replace("*", "0");
            int code = Integer.parseInt(sub, 2);
            sb.append((char) code);
        }
        return sb.toString();
    }

    // 강사님
    public String solution2(int count, String text) {
        String answer = "";
        for (int i = 0; i < count; i++) {
            String sub = text.substring(0, 7);
            sub = sub.replace("#", "1");
            sub = sub.replace("*", "0");
            // 해당 문자열을 2진수로 변경 해주는 메소드
            int number = Integer.parseInt(sub, 2);
            answer += (char) number;
            text = text.substring(7);
        }
        return answer;
    }
}
