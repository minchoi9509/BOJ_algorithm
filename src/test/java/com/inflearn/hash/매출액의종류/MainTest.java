package com.inflearn.hash.매출액의종류;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        ArrayList<Object> answers = new ArrayList<>();
        answers.add(3);
        answers.add(4);
        answers.add(4);
        answers.add(3);
        Assertions.assertEquals(main.solution(7, 4, new int[] {20, 12, 20, 10, 23, 17, 10}), answers);
    }
}