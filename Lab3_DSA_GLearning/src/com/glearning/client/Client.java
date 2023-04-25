package com.glearning.client;

import com.glearning.service.BST;
import com.glearning.service.Service;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the braces");
        String String_Input = sc.next();
        Service obj = new Service();
        boolean result =  obj.ValidBraces(String_Input);
        if(result){
            System.out.println("The braces are valid");
        }
        else{
            System.out.println("The braces are invalid");
        }
        System.out.println("Enter a sum for the BST");
        int num = sc.nextInt();
        BST tree = new BST();
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);
        tree.insert(4);
        tree.insert(7);
        tree.insert(13);
        tree.findSumPair(num);
    }
}
