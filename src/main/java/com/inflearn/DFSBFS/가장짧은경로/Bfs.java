package com.inflearn.DFSBFS.가장짧은경로;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    Node root;

    public static void main(String[] args) {
        Bfs tree = new Bfs();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.solution(tree.root));
    }
    public int solution(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        int level = 0;

        while (!Q.isEmpty()) {
            int length = Q.size();
            for (int i = 0; i < length; i++) {
                Node current = Q.poll();
                if (current.lt == null && current.rt == null) {
                    return level;
                }
                if (current.lt != null) {
                    Q.add(current.lt);
                }

                if (current.rt != null) {
                    Q.add(current.rt);
                }
                level++;
            }
        }

        return level;
    }
}
