package com.mayank.tree.traversal;

public class Node {
	
	public static final int TREE_LEVELS = 2;
	private static int counter = 0;
	
	private int id;
	private Node left;
	private Node right;
	
	public Node(int nodeLevel) {
		counter ++;
		this.id = counter;
		if (nodeLevel <= TREE_LEVELS) {
			nodeLevel++;
			left = new Node(nodeLevel);
			right = new Node(nodeLevel);
		}
	}
	
	public Node getRight() {
		return right;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public int getId() {
		return id;
	}

}
