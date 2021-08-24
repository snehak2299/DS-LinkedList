package com.bridglab.linkedlist;

public class MyLinkedListRunner {

	public static void main(String[] args) {
		MyNode<Integer> firstNode=new MyNode<Integer>(56);
        MyNode<Integer> secondNode=new MyNode<Integer>(30);
        MyNode<Integer> thirdNode=new MyNode<Integer>(70);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode)&& secondNode.getNext().equals(thirdNode);
        System.out.println(result);

	}

}
