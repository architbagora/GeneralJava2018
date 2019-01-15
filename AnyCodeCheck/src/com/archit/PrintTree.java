package com.archit;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {

	public static void main(String[] args) {
		Node start = new Node("1");
		Node start1 = new Node("2");
		Node start2 = new Node("3");
		start.setLeft(start1);
		start.setRight(start2);

		Node start3 = new Node("4");
		Node start4 = new Node("5");
		start1.setLeft(start3);
		start1.setRight(start4);

		Node start5 = new Node("6");
		Node start6 = new Node("7");
		start2.setLeft(start5);
		start2.setRight(start6);

		printMeTree(start);

	}

	private static void printMeTree(Node start) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(start);
		queue.add(null);
		Node current;

		while (!queue.isEmpty()) {
			current = queue.poll();
			if (current == null && queue.size() != 0) {
				queue.add(null);
				System.out.println();
			} else if (queue.size() == 0) {
				break;
			} else {
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
				System.out.print(current.data);
			}
		}

	}

}

class Node {

	Node(String data) {
		this.data = data;
	}

	String data;
	Node left;
	Node right;

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
