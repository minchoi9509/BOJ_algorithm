package com.inflearn.hash;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertTrue(main.solution(15, "BACBACCACCBDEDE") == 'C');
    }
}