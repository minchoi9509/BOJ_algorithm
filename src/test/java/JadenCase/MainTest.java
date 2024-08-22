package JadenCase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmers.JadenCase.Solution;

public class MainTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        Assertions.assertEquals(solution.solution("3people unFollowed me"), "3people Unfollowed Me");
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        Assertions.assertEquals(solution.solution("for the last week"	), "For The Last Week");
    }

    @Test
    /**
     * 공백이 앞뒤로 있는 경우, 공백이 2개 이상인 경우 > 다양한 경우에 대한 테스트 케이스를 작성하는 것이 필요함.
     */
    void solution3() {
        Solution solution = new Solution();
        Assertions.assertEquals(solution.solution("  For The What 1what  "), "  for the what 1what  ");
    }
}
