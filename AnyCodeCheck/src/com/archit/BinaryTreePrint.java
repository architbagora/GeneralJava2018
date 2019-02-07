package com.archit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
 
public class BinaryTreePrint {

	public void printLineByLine() {
		printLineByLine(root);
	}
 
	private void printLineByLine(Node root) {
		if (root == null) {
			return;
		}
		final Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			final int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node x = queue.remove();
				System.out.print(x.data + " ");
				if (x.left != null) {
					queue.add(x.left);
				}
				if (x.right != null) {
					queue.add(x.right);
				}
			}
			// new level
			System.out.println();
		}
	}
 
	public static void main(String[] args) {
		final Random random = new Random();
		final int N = 6;
		final BinaryTreePrint tree = new BinaryTreePrint();
		tree.insert(3);
		tree.insert(2);
		tree.insert(1);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		
		
		tree.printLineByLine();
	}
	
	private Node root;
	 
	public void insert(int data) {
		root = insert(root, data);
	}

	private class Node {
		int data;
		Node left;
		Node right;
 
		Node(int data) {
			this.data = data;
		}
	}
	private Node insert(Node x, int data) {
		if (x == null) {
			return new Node(data);
		}
		if (data < x.data) {
			x.left = insert(x.left, data);
		} else {
			x.right = insert(x.right, data);
		}
		return x;
	}
}