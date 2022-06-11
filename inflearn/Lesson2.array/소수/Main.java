import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        System.out.println(main.solution(count));
    }

    public int solution(int count) {
        int answer = 0;
        int[] arrays = new int[count + 1];
        for (int i = 2; i < count; i++) {
            if (arrays[i] == 0) {
                answer++;
                for (int j = i; j <= count; j = j + i) {
                    arrays[j] = 1;
                }
            }
        }
        return answer;
    }
}
