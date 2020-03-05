package com.epam.CustomList;

import java.util.*;

public @SuppressWarnings("serial") class CustomList<T> extends AbstractList<T>implements java.io.Serializable{
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object [] a;

	    CustomList() {
	        a = new Object[DEFAULT_CAPACITY];
	    }
	    public boolean add(T t) {
	        if (size == a.length) {
	            ensureCapacity();
	        }
	        a[size++] = t;
			return true;
	    }
	    
	    @SuppressWarnings("unchecked")
		public T get(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (T) a[i];
	    }
	    @SuppressWarnings("unchecked")
		public T remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = a[i];
	        int numofele = a.length - ( i + 1 ) ;
	        System.arraycopy( a, i + 1, a, i, numofele ) ;
	        size--;
	        return (T) item;
	    }
	    public int size() {
	        return size;
	    }
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(a[i].toString());
	             if(i<size-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	    private void ensureCapacity() {
	        int newSize = a.length * 2;
	        a = Arrays.copyOf(a, newSize);
	    }
}