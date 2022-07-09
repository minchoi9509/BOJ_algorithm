package com.inflearn.hash.학급회장;


import com.inflearn.hash.학급회장.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertTrue(main.solution(15, "BACBACCACCBDEDE") == 'C');
    }
}