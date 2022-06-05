package hackerank;

import java.util.*;
import java.io.*;

class Node2 {
	Node2 left, right;
	int data;

	Node2(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BSTCase {

	public static int getHeight(Node2 root) {
		// Write your code here
		if (root == null) {
			return -1;
		}
		int heightLeft = 0;
	    int heightRight = 0;

	    if (root.left != null) {
	        heightLeft = getHeight(root.left) + 1;
	    }
	    if (root.right != null) {
	        heightRight = getHeight(root.right) + 1;
	    }

	  return (heightLeft > heightRight ? heightLeft : heightRight);
	}

	public static Node2 insert(Node2 root, int data) {
		if (root == null) {
			return new Node2(data);
		} else {
			Node2 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node2 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}