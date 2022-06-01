import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(main.solution(str));
    }

    // 메소드가 있다는 걸 몰라서 isAlphabet이라는 메소드를 만들었는데
    // Character.isAlphabetic()을 사용하면 그냥 바로 알 수 있다.
    public String solution(String text) {
        char[] chars = text.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;
        while (lt < rt) {
            if(!isAlphabet(chars[lt]))
            {
                lt++;
            }
            else if (!isAlphabet(chars[rt]))
            {
                rt--;
            }
            else
            {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(chars);
    }

    private boolean isAlphabet(char c) {
        return (c >= 65 && c <=90) || (c >=97 && c <=122);
    }
}