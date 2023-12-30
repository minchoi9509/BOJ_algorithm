package com.inflearn.DFSBFS.이진트리순회;

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

    // 이진 탐색
    public void solution(Node root) {
        if (root == null) {
            return;
        }
        else
        {
            solution(root.lt);
            System.out.print(root.data + " ");
            solution(root.rt);
        }

    }
}
