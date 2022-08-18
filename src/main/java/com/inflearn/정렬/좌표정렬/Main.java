package com.inflearn.정렬.좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            points.add(new Point(x, y));
        }

        Collections.sort(points);

        for (Point point : points) {
            System.out.print(point.x + " " + point.y);
            System.out.println();
        }
    }
}

class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            // 오름차순
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}
