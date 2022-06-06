
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        String str = kb.next();
        System.out.println(main.solution(count, str));
    }

    // 런타임 에러
    public int solution(int count, String str) {
        String[] students = str.split(" ");
        int answer = 1;
        int max = Integer.parseInt(students[0]);
        for (int i = 0; i < count; i++) {
            int studentHigh = Integer.parseInt(students[i]);
            if (studentHigh > max)
            {
                answer++;
                max = studentHigh;
            }
        }
        return answer;
    }
}
