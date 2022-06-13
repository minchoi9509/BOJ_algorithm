package com.inflearn.string.회문문자열;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution()
    {
        Main main = new Main();
        Assertions.assertEquals("YES", main.solution("gooG"));
        Assertions.assertEquals("YES", main.solution("TESTSET"));
        Assertions.assertEquals("NO", main.solution("cOFfee"));
    }

    @Test
    void solution2()
    {
        Main main = new Main();
        Assertions.assertEquals("YES", main.solution2("gooG"));
        Assertions.assertEquals("YES", main.solution2("TESTSET"));
        Assertions.assertEquals("NO", main.solution2("cOFfee"));
    }
}
