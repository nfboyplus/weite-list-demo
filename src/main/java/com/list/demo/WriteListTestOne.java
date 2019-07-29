package com.list.demo;

import com.list.demo.ext.ExtArrayList;
import com.list.demo.ext.ExtList;

/**
 * 纯手写JDK不同版本下的List接口( ArrayList和Vector集合)
 */
public class WriteListTestOne {

    /**
     * 1.ArrayList集合底层使用数组实现
     * 2.怎么保证集合中存放无限大小：数组扩容技术
     */
    public static void main(String[] args) {
        ExtList<String> extArrayList = new ExtArrayList<String>();
        extArrayList.add("张三");
        extArrayList.add("李四");
        extArrayList.add("王武");
        //胜军将插在张三的后面，李四的前面
        extArrayList.add(1, "胜军");
        System.out.println(extArrayList.getSize());
        for (int i = 0; i < extArrayList.getSize(); i++) {
            Object object = extArrayList.get(i);
            System.out.println(object);
        }
        System.out.println("获取第一个元素值:" + extArrayList.get(0));
        System.out.println("获取第二个元素值:" + extArrayList.get(1));
        System.out.println("获取第三个元素值:" + extArrayList.get(2));
        System.out.println("获取第四个元素值:" + extArrayList.get(3));
        //数组越界
        System.out.println("获取第五个元素值:" + extArrayList.get(4));

    }

    /**
     * List:
     * 0.List接口继承于Collection接口
     * 1.List集合代表一个有序集合，集合中每个元素都有其对应的顺序索引
     * 2.List集合允许使用重复元素，可以通过索引来访问指定位置的集合元素
     * 3.实现List接口的集合主要有：ArrayList、LinkedList、Vector、Stack
     */

    /**
     * Vector:
     * 1.Vector是线程安全的，但是性能比ArrayList要低
     * 2.Vector是线程安全的，源码中有很多的synchronized可以看出，而ArrayList不是,导致Vector效率无法和ArrayList相比
     * 3.ArrayList和Vector都采用线性连续存储空间，当存储空间不足的时候，ArrayList默认增加为原来的50%，Vector默认增加为原来的一倍
     * 4.Vector可以设置capacityIncrement，而ArrayList不可以，从字面理解就是capacity容量，Increment增加，容量增长的参数
     */

    /**
     * <<      :     左移运算符，num << 1,相当于num乘以2
     *
     * >>      :     右移运算符，num >> 1,相当于num除以2
     *
     * >>>    :     无符号右移，忽略符号位，空位都以0补齐
     */

}
