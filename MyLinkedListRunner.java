package com.bridglab.linkedlist;

public class MyLinkedListRunner {

	public static void main(String[] args) {
		MyNode<Integer> firstNode=new MyNode<>(56);
        MyNode<Integer> secondNode=new MyNode<>(30);
        MyNode<Integer> thirdNode=new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(thirdNode);
        myLinkedList.addNodeInBetween(firstNode,secondNode);
        myLinkedList.popFirst();
        myLinkedList.printMyNodes();
	}

}
