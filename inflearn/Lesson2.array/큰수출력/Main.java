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
    public String solution(int count, String str) {
        StringBuilder sb = new StringBuilder();
        String[] numbers = str.split(" ");

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(numbers[i]);
            int preNumber;
            if (i == 0)
            {
                preNumber = 0;
            }
            else
            {
                preNumber = Integer.parseInt(numbers[i - 1]);
            }
            if (number > preNumber) {
                sb.append(number);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
