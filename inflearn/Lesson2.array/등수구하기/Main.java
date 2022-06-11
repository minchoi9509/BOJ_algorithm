
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        Integer[] scores = new Integer[count];
        for (int i = 0; i < count; i++) {
            scores[i] = kb.nextInt();
        }
        List<Integer> answers = main.solution(count, scores);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    public List<Integer> solution(int count, Integer[] scores) {
        List<Integer> answers = new ArrayList<>();
        // 아이디어가 안떠오른다.
        // 정렬하기 .. 비효율적으로도 생각해보자.
        // 뭔가 동점 있을 때 처리가 잘 안된 느낌.
        Integer[] temp = scores.clone();
        Arrays.sort(scores, Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            answers.add(position(temp[i], scores));
        }
        return answers;
    }

    private int position(int score, Integer[] scores) {
        int answer = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == score) {
                answer = i;
                scores[i] = 0;
            }
        }
        return answer + 1;
    }
}
