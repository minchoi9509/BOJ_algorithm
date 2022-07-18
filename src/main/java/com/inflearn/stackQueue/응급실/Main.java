package com.inflearn.stackQueue.응급실;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] lists = new int[n];
        for (int i = 0; i < n; i++) {
            lists[i] = kb.nextInt();
        }
        System.out.println(main.solution(n, m, lists));
    }

    public int solution(int n, int m, int[] lists) {
        int answer = 0;
        // Queue<Person> patients = new ArrayList<>();
        Queue<Person> patients = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            patients.offer(new Person(i, lists[i]));
        }
        while (!patients.isEmpty()) {
            Person person = patients.poll();
            for (Person patient : patients) {
                if (patient.priority > person.priority) {
                    patients.offer(person);
                    person = null;
                    break;
                }
            }

            if (person != null) {
                if (person.number == m) {
                    return answer;
                }
                else {
                    answer++;
                }
            }
        }
        return answer;
    }

    class Person {
        int number;
        int priority;

        public Person(int number, int priority) {
            this.number = number;
            this.priority = priority;
        }
    }
}
