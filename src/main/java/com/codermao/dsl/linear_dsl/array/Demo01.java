package com.codermao.dsl.linear_dsl.array;

import java.util.ArrayList;

/**
 * @author codermao
 * @date 2023/2/6 15:50
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
        * 基本类型一维数组如下
        *   此外还有：对象数组和二维或多维数组
        * */
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 3;
        array[2] = 1;
        array[3] = 0;
        array[4] = 2;

        int[] arr = {2, 3, 1, 0, 2};

        /*
        * 集合-可变数组：是经常使用的数据结构，其基于数组和扩容机制实现，相比普通数组更加灵活。常用操作有：访问元素、添加元素、删除元素。
        * */
        ArrayList<Integer> arraylist = new ArrayList<>();
        // 向尾部添加元素
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(1);
        arraylist.add(0);
        arraylist.add(2);

    }
}
