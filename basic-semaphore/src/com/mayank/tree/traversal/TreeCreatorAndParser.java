package com.mayank.tree.traversal;

public class TreeCreatorAndParser {
	
	public static void main(String[] args) {
		Node rootNode = new Node(1);
		System.out.println();
		
		inorderTraversal(rootNode);
		System.out.println();
		reverseInorderTraversal(rootNode);
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
			System.out.print(node.getId());
			if (node.getRight() != null) {
				inorderTraversal(node.getRight());
			}
		}
	}
	
	public static void reverseInorderTraversal(Node node) {
		if (node != null) {
			if (node.getRight() != null) {
				reverseInorderTraversal(node.getRight());
			}
			System.out.print(node.getId());
			if (node.getLeft() != null) {
				reverseInorderTraversal(node.getLeft());
			}
		}
	}
	
}
