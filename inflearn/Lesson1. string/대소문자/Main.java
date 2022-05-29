import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(main.solution(str));
    }

    // 방법 1.
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray())
        {
            if (x >= 65 && x <=90)
            {
                x += 32;
            }
            else if (x >=97 && x <=122)
            {
                x -= 32;
            }

            answer += x;
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray())
        {
            if (Character.isLowerCase(x))
            {
                answer += Character.toUpperCase(x);
            }
            else
            {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }
}
