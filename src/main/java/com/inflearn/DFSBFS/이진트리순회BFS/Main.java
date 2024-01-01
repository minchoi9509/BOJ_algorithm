package com.inflearn.DFSBFS.이진트리순회BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;
    public Node(int value) {
        data = value;
        lt = null;
        rt = null;
    }
}

public class Main {

    Node root;

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.solution(tree.root);
    }

    // 이진 탐색이지만 레벨탐색(BFS)
    public void solution(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            System.out.print(level + " : ");
            // 해당 레벨의 원소 출력
            for (int i = 0; i < length; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");
                if (current.lt != null) {
                    queue.offer(current.lt);
                }
                if (current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            level++;
            System.out.println();
        }
    }
}
