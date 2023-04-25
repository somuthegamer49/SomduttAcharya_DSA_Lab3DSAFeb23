package com.glearning.service;
import java.io.*;
import java.util.*;

public class Service {
    public boolean ValidBraces(String braces){
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < braces.length(); i++) {
            String st = "";
            st += braces.charAt(i);
            if (st.equals("(") || st.equals("{") || st.equals("[")) {
                stack.push(st);
            }

            if (stack.empty()) {
                return false;
            }
            if (st.equals(")")) {
                String pop = stack.pop();
                if (pop.equals("{") || pop.equals("[")) {
                    return false;
                }
            }
            if (st.equals("}")) {
                String pop = stack.pop();
                if (pop.equals("(") || pop.equals("[")) {
                    return false;
                }
            }
            if (st.equals("]")) {
                String pop = stack.pop();
                if (pop.equals("(") || pop.equals("{")) {
                    return false;
                }
            }
        }
        return true;
    }
}
