package com.codermao.dsl.linear_dsl.linked_list;

/**
 * @author codermao
 * @date 2023/2/6 16:00
 */
public class Demo01 {
    public static void main(String[] args) {
        //实例化结点
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);

        //构建引用指向
        n1.next = n2;
        n2.next = n3;
    }
}

class ListNode {
    int val;// 节点值
    ListNode next;// 后继节点引用

    ListNode(int x) {
        val = x;
    }
}
