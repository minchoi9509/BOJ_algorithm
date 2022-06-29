package com.inflearn.효율성.연속된자연수의합;

import com.inflearn.효율성.연속된자연수의합.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(main.solution(15), 3);
    }

}