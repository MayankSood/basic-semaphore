package com.mayank.tree.traversal;

public class TreeCreatorAndParser {
	
	public static void main(String[] args) {
		Node rootNode = new Node(1);
		System.out.println();
		
		preorderTraversal(rootNode);
		
		System.out.println();
		System.out.println();
		
		postorderTraversal(rootNode);
		
		System.out.println();
		System.out.println();
		
		inorderTraversal(rootNode);
	}
	
	public static void preorderTraversal(Node node) {
		if (node != null) {
			System.out.println(node.getId());
			preorderTraversal(node.getLeft());
			preorderTraversal(node.getRight());
		}
	}
	
	public static void postorderTraversal(Node node) {
		if (node != null) {
			postorderTraversal(node.getLeft());
			postorderTraversal(node.getRight());
			System.out.println(node.getId());
		}
	}
	
	public static void inorderTraversal(Node node) {
		if (node != null) {
			if (node.getLeft() != null) {
				inorderTraversal(node.getLeft());
			}
			System.out.println(node.getId());
			if (node.getRight() != null) {
				inorderTraversal(node.getRight());
			}
		}
	}
	
}
