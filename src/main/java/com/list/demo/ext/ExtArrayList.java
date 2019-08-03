package com.list.demo.ext;

import java.util.Arrays;

/**
 * 纯手写 ArrayList
 */
public class ExtArrayList<E> implements ExtList<E> {

    // 保存ArrayList中数据的数组
    private transient Object[] elementData;

    // ArrayList实际数量
    private int size;

    public ExtArrayList() {
        // 默认初始容量为10
        this(10);
    }

    public ExtArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        // 初始化数组容量
        elementData = new Object[initialCapacity];
    }

    // 添加方法实现
    public void add(Object object) {
        ensureExplicitCapacity(size + 1);
        elementData[size++] = object;
    }

    public void add(int index, Object object) {
        rangeCheck(index);
        ensureExplicitCapacity(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = object;
        size++;
    }

    private void ensureExplicitCapacity(int minCapacity) {
        // 如果存入的数据,超出了默认数组初始容量 就开始实现扩容
        if (size == elementData.length) {
            // 获取原来数组的长度 2
            int oldCapacity = elementData.length;
            // oldCapacity >> 1 理解成 oldCapacity/2 新数组的长度是原来长度1.5倍
            int newCapacity = oldCapacity + (oldCapacity >> 1); // 3
            if (newCapacity < minCapacity) {
                // 最小容量比新容量要小的,则采用初始容量minCapacity
                newCapacity = minCapacity;
            }
            System.out.println("oldCapacity:" + oldCapacity + ",newCapacity:" + newCapacity);
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    /**
     * 删除数据
     */
    public Object remove(int index) {
        //使用下标查询该值是否存在
        Object object = get(index);
        //计算删除元素后面的长度
        int numMoved = elementData.length - index - 1;
        //删除原理分析
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        //将最后一个元素变为空
        elementData[--size] = null;
        return object;
    }

    @Override
    public boolean remove(E object) {
        for (int i = 0; i < elementData.length; i++) {
            Object element = elementData[i];
            if (element.equals(object)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * 获取数据
     */
    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    private void rangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("数组越界啦!");
        }
    }

    public int getSize() {
        return size;
    }

}


