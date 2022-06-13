package com.inflearn.string.특정문자뒤집기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution()
    {
        Main main = new Main();
        Assertions.assertEquals("S#T!EG*b@a", main.solution("a#b!GE*T@S"));
        Assertions.assertEquals("kdd#@kkgj%$#dkgjd@kj$dk", main.solution("kdj#@kdjg%$#kdjgk@kd$dk"));
    }
}