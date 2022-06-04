import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(main.solution(str));
        System.out.println(main.solution2(str));
    }


    // 너무 심각한 if-else
    // string의 charAt을 사용 할 생각을 하지 못하고 또 Array를 이용했다. 굳이 할 필요 없는 짓 같다.
    // 굳이 builder를 사용하지 않아도 되긴하지만 그래도 추가하는거니까 builder를 쓰는게 좋을 것 같다는 생각.
    // String.valueOf(count) 요걸 사용해서 count를 string으로 추가 할 수 있다는 포인트 
    public String solution(String text) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            if (i == chars.length - 1)
            {
                sb.append(chars[i]);
                if (count != 1)
                {
                    sb.append(count);
                }
                break;
            }

            if (chars[i] == chars[i+1])
            {
                count++;
            }
            else
            {
                if (count == 1)
                {
                    sb.append(chars[i]);
                }
                else
                {
                    sb.append(chars[i]);
                    sb.append(count);
                    count = 1;
                }
            }
        }
        return sb.toString();
    }

    public String solution2(String text) {
        String answer = "";
        text = text + " ";
        int count = 1;
        for (int i = 0; i < text.length() - 1; i++)
        {
            if (text.charAt(i) == text.charAt(i+1))
            {
                count++;
            }
            else
            {
                answer += text.charAt(i);
                if (count > 1)
                {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }
        return answer;
    }
}
