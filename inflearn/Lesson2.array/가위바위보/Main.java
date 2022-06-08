
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = kb.nextInt();
        }
        int[] b = new int[count];
        for (int i = 0; i < count; i++) {
            b[i] = kb.nextInt();
        }
        String[] answers = main.solution(count, a, b);
        for (String answer : answers) {
            System.out.println(answer);
        }
    }

    // 생각이 안나서 냅다 이렇게 풀어버렸다.. 로직 변경 필수. 
    public String[] solution(int count, int[] a, int[] b) {
        String[] answers = new String[count];
        for (int i = 0; i < count; i++) {
            if (a[i] == b[i]) {
                answers[i] = "D";
            } else if (a[i] == 1 && b[i] == 3) {
                answers[i] = "A";
            } else if (a[i] == 2 && b[i] == 1) {
                answers[i] = "A";
            } else if (a[i] == 3 && b[i] == 2) {
                answers[i] = "A";
            } else if (a[i] == 2 && b[i] == 3) {
                answers[i] = "B";
            } else if (a[i] == 3 && b[i] == 1) {
                answers[i] = "B";
            } else if (a[i] == 1 && b[i] == 2) {
                answers[i] = "B";
            }
        }
        return answers;
    }
}
