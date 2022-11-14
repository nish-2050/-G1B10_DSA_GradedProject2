package com.question2.model;

public class BST_To_Skewed {
	private Node startNode = null;
	private Node prevNode = null;

    private class Node {

		int data;

		Node left;

		Node right;

	}

    private Node createNode(int ele) 
	{

		Node temp = new Node();

		temp.data = ele;

		return temp;

	}

    private void rightSkew(Node root)
	{

		if (root == null) {

			return;

		}

		rightSkew(root.left);

		if (startNode == null) {

			startNode = root;

			startNode.left = null;

			prevNode = startNode;

		}
        else {

			prevNode.right = root;

			prevNode = root;

			prevNode.left = null;

		}

		rightSkew(root.right);

	}
    public void displayRightTree()
	{
		if (startNode == null) {

			return;

		}
		System.out.print(startNode.data + " ");

		startNode = startNode.right;

		displayRightTree();

	}
    public BST_To_Skewed()
	{

		Node newNode = createNode(50);

		newNode.left = createNode(30);

		newNode.right = createNode(60);

		newNode.left.left = createNode(10);

		newNode.right.left = createNode(55);

		rightSkew(newNode);

	}

}
	
	   