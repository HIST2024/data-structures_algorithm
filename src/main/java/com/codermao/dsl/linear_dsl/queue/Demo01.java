package com.codermao.dsl.linear_dsl.queue;

import java.util.LinkedList;

/**
 * @author codermao
 * @date 2023/2/6 16:05
 */
public class Demo01 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        queue.offer(1); // 元素 1 入队
        queue.offer(2); // 元素 2 入队
        queue.poll();   // 出队 -> 元素 1
        queue.poll();   // 出队 -> 元素 2

        System.out.println(replaceSpace2("We are happy."));

    }

    public static String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == ' ') {
                sb.replace(i, i + 1, "%20");
            }
        }
        return sb.toString();
    }

    public static String replaceSpace2(String s) {
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
