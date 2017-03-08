package stack;

import java.util.NoSuchElementException;


public class StackImplUsingArrayList<T> implements Stack<T> {
	
	private T[] array;
	
	private int total;
	
	public StackImplUsingArrayList() {
		array = (T[]) new Object[2];
	}
	
	private void resize(int capacity) {
		T[] tmp = (T[]) new Object[capacity];
		System.arraycopy(array, 0, tmp, 0, total);
		array = tmp;
	}

	@Override
	public StackImplUsingArrayList<T> push(T ele) {
		if(array.length == total) {
			resize(array.length * 2);
		}
		array[++total] = ele;
		return this;
	}

	@Override
	public T pop() {
		if(total == 0 ) {
			throw new NoSuchElementException();
		}
		T ele = array[--total];
		array[total] = null;
		if(total > 0 && total == array.length/2) {
			resize(array.length/2);
		}
		return ele;
	}
	
	public String toString() {
		return java.util.Arrays.toString(array);
	}
}