package com.list.demo;

/**
 * 复制操作
 */
public class WriteListTestTwo {

    public static void main(String[] args) {
        Object[] objects = new Object[] { 0, 1, 2, 3, 4, 5, 6 };
        System.out.println(objects.length);
        // Object[] newObjects = Arrays.copyOf(objects, 10);
        // System.out.println(newObjects.length);
        // 参数1起始位置赋值 参数2:赋值数据源 参数3:目的地数据源 参数4:目的的起始位置(长度) 参数五 赋值长度
        // 把1，2，3 赋值给了 4，5，6
        System.arraycopy(objects, 1, objects, 4, 3);
        for (Object object : objects) {
            System.out.print(object + ",");
        }
    }
}
