package programmers.숫자문자열과영단어;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void solution()
    {
        Solution solution = new Solution();
        Assertions.assertEquals(1478, solution.solution("one4seveneight"	));
    }
    @Test
    public void solution2()
    {
        Solution solution = new Solution();
        Assertions.assertEquals(234567, solution.solution("23four5six7"));
    }
    @Test
    public void solution3()
    {
        Solution solution = new Solution();
        Assertions.assertEquals(10203, solution.solution("1zerotwozero3"));
    }
}