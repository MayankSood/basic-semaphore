package com.mayank.linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class LinkedList<T> implements List<T>{
	
	private final Node head = new Node();
	private int size;
	
	public boolean add(T value) {
		assert value != null : "Value cannot be null";
		
		if (head.getData() == null) {
			head.setDate(value);
		} else {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			
			Node newNode = new Node();
			newNode.setDate(value);
			currentNode.setNext(newNode);
		}
		
		size++;
		return true;
		
	}
	
	public T get(int index) {
		assert index < size : "Index out of bounds. Size:"+size;

		Node currenNode = head;
		for (int i = 0; i<index; i++) {
			currenNode = currenNode.getNext();
		}
		return currenNode.getData();
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (head.getNext() == null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o) {
		Node currenNode = head;
		for (int i = 0; i<size; i++) {
			if (o.equals(currenNode.getData())) {
				return true;
			}
			currenNode = currenNode.getNext();
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		Node currenNode = head;
		Object[] arr = new Object[size];
		for (int i = 0; i<size; i++) {
			arr[i] = currenNode.getData();
			currenNode = currenNode.getNext();
		}
		return arr;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		assert index < size : "Index out of bounds. Size:"+size;
		
		Node deletingNode = head;
		Node prevNode = head;
		for (int i = 0; i<index; i++) {
			prevNode = deletingNode;
			deletingNode = deletingNode.getNext();
		}
		
		prevNode.setNext(deletingNode.getNext());
		deletingNode.setNext(null);
		
		size --;
		return deletingNode.getData();
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return null;
	}
	
	private class Node {
		private T data;
		private Node next;
		
		public void setDate(T t) {
			data = t;
		}
		
		public T getData() {
			return data;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public Node getNext() {
			return next;
		}
	}
	
}
