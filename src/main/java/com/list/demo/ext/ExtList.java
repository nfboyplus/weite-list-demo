package com.list.demo.ext;

/**
 * 自定List接口
 */
public interface ExtList<E> {

    public void add(E object);

    public void add(int index, E object);

    public Object remove(int index);

    public boolean remove(E object);

    public int getSize();

    public Object get(int index);

}
