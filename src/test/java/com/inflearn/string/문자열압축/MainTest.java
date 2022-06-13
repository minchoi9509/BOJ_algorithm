package com.inflearn.string.문자열압축;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("K2HS7E", main.solution("KKHSSSSSSSE"));
        Assertions.assertEquals("KST3SE2KFK3DJ2G2", main.solution("KSTTTSEEKFKKKDJJGG"));
    }

    @Test
    void solution2() {
        Main main = new Main();
        Assertions.assertEquals("K2HS7E", main.solution2("KKHSSSSSSSE"));
        Assertions.assertEquals("KST3SE2KFK3DJ2G2", main.solution2("KSTTTSEEKFKKKDJJGG"));
    }
}