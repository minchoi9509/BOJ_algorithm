
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = kb.nextInt();
        }
        System.out.println(main.solution(count, numbers));
    }

    public int solution(int count, int[] numbers) {
        int answer = 0;
        int score = 1;
        for (int i = 0; i < count; i++) {
            if (numbers[i] == 1) {
                answer += score;
                score++;
            } else {
                score = 1;
            }
        }
        return answer;
    }
}
