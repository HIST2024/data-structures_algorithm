package com.codermao.dsl.linear_dsl.stack;

import java.util.Stack;

/**
 * @author codermao
 * @date 2023/2/6 16:03
 */
public class Demo01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        stack.push(1); // 元素 1 入栈
        stack.push(2); // 元素 2 入栈
        stack.pop();   // 出栈 -> 元素 2
        stack.pop();   // 出栈 -> 元素 1
    }
}
