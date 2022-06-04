
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(main.solution(str));
    }

    public int solution(String text) {
        text = text.replaceAll("[^0-9]", "");
        return Integer.parseInt(text);
    }
}
