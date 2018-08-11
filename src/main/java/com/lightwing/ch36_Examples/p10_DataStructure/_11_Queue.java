package com.lightwing.ch36_Examples.p10_DataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName _11_Queue
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:54
 * @Version 1.0
 **/
public class _11_Queue {
    public static void main(String[] args) {
        // add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<>();
        // 添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (String q : queue)
            System.out.println(q);

        System.out.println("===");
        // 返回第一个元素，并在队列中删除
        System.out.println("poll=" + queue.poll());
        for (String q : queue)
            System.out.println(q);

        System.out.println("===");
        // 返回第一个元素
        System.out.println("element=" + queue.element());
        for (String q : queue)
            System.out.println(q);

        System.out.println("===");
        // 返回第一个元素
        System.out.println("peek=" + queue.peek());
        for (String q : queue)
            System.out.println(q);
    }
}