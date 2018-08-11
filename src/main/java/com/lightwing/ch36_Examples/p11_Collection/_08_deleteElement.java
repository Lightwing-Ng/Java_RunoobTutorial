package com.lightwing.ch36_Examples.p11_Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName _08_deleteElement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 15:22
 * @Version 1.0
 **/
public class _08_deleteElement {
    public static void main(String[] args) {
        System.out.println("集合实例!\n");
        int size;
        HashSet collection = new HashSet();
        String str1 = "Yellow", str2 = "White", str3 =
                "Green", str4 = "Blue";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.print("集合数据: ");
        iterator = collection.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();
        collection.remove(str2);
        System.out.println("删除之后 [" + str2 + "]\n");
        System.out.print("现在集合的数据是: ");
        iterator = collection.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();
        size = collection.size();
        System.out.println("集合大小: " + size + "\n");
    }
}
