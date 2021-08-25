package com.bridglab.linkedlist;

public class MyLinkedList<K> {
	public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {

    }

    public void add(INode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        }
        else {
            INode tempNode = this.head;
            while (tempNode.getNext()!=null)
            {
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(newNode);
            newNode.setNext(null);
        }
    }


    public void addNodeInBetween(INode<K> myFirstNode,INode<K> mySecondNode)
    {
        INode tempNode = this.head;
       if(tempNode.getKey()!=myFirstNode) {
           mySecondNode.setNext(tempNode.getNext());
           tempNode.setNext(mySecondNode);
       }



    }
    public void popFirst(){     //delete first element
    	INode temp = head.getNext();
		head = temp;

    }
    
    public void popLast(){    // delete last element
        INode tempNode=this.head;
        do
        {
            tempNode=tempNode.getNext();
        }while (tempNode.getNext()==null);
        tempNode.setNext(null);
        

    }
    public void insertNodeAfter(INode<K> secondNode,INode<K> fourthNode) {
        INode tempNode = this.head;
        while (tempNode!= null) {
            if (tempNode.getKey().equals(secondNode.getKey())) {
                fourthNode.setNext(tempNode.getNext());
                tempNode.setNext(fourthNode);
                break;
            }
            tempNode=tempNode.getNext();
        }
    }
    public void search(INode<K> searchNode){ //search given element is present or not
        INode tempNode=this.head;
        while (tempNode.getNext()!=null)
        {

            if (tempNode==searchNode)
            {
                System.out.println(searchNode.getKey() +" is present in linked list");
            }
            tempNode=tempNode.getNext();

        }

    }
    public void deleteNode(K key) { //delete particular element in linked List
		INode temp = head;
		while (temp.getNext() != null) {
			if ((temp.getNext().getKey()).equals(key)) {
				INode tempLast = temp.getNext().getNext();
				temp.setNext(tempLast);
				break;
			}
			temp = temp.getNext();
		}
	}
    public int size() {
		int count = 0;
		INode temp = head;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}

    public void printMyNodes() {

        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode temp = this.head;
        while (temp.getNext()!=null) {
            myNodes.append(temp.getKey());
                myNodes.append("->");
            temp = temp.getNext();
        }
        myNodes.append(temp.getKey());
        System.out.print(myNodes);


        }
    }