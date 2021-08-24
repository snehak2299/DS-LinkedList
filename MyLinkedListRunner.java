package com.bridglab.linkedlist;

public class MyLinkedListRunner {

	public static void main(String[] args) {
		MyNode<Integer> firstNode=new MyNode<>(56);
        MyNode<Integer> secondNode=new MyNode<>(30);
        MyNode<Integer> thirdNode=new MyNode<>(70);
        MyNode<Integer> fourthNode=new MyNode<>(40);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(thirdNode);
        myLinkedList.addNodeInBetween(firstNode,secondNode);
       // myLinkedList.popLast();
        myLinkedList.search(secondNode);
        myLinkedList.insertNodeAfter(secondNode,fourthNode);
        myLinkedList.printMyNodes();
	}

}
