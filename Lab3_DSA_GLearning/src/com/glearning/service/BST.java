package com.glearning.service;

import java.util.HashSet;
import java.util.Set;

public class BST{

    private Node root;
    public class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public BST() {
            root = null;
        }

        public void insert(int val) {
            root = insert(root, val);
        }

        private Node insert(Node node, int val) {
            if(node == null) {
                //root node
                return new Node(val);
            }
            if(val < node.data) {
                node.left = insert(node.left, val);
            }
            if(val > node.data) {
                node.right = insert(node.right, val);
            }
            return node;
        }
        public boolean findSumPair(int sum){
            Set<Integer> set = new HashSet<>();
            return findSumPair(root,sum,set);
        }
    private boolean findSumPair(Node node, int sum, Set<Integer> set) {
        if(node == null) {
            return false;
        }
        if(findSumPair(node.left, sum, set)) {
            return true;
        }
        if(set.contains(sum - node.data)) {
            System.out.println("Pair found :: "+ (sum - node.data) + " , "+ node.data);
            return true;
        }
        set.add(node.data);
        return findSumPair(node.right, sum, set);
    }

}
