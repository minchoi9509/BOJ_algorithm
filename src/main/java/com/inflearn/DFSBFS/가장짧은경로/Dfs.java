package com.inflearn.DFSBFS.가장짧은경로;

import com.inflearn.DFSBFS.이진트리순회.Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node lt, rt;
    public Node(int value) {
        data = value;
        lt = null;
        rt = null;
    }
}

public class Dfs {

    Node root;

    public static void main(String[] args) {
        Dfs tree = new Dfs();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.solution(0, tree.root));
    }

    public int solution(int level, Node root) {
        // 말단인지 확인 > 노드의 레벨을 리턴한다.
        if (root.lt == null && root.rt == null) {
            return level;
        }
        else
        {
            return Math.min(solution(level + 1, root.lt), solution(level + 1, root.rt));
        }
    }
}
