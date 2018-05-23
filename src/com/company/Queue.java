package com.company;

public class Queue {
    Node head;
    Node tail;

    boolean isEmpty(){
        return head == null;
    }

    int peek(){
        if(head == null){
            System.out.println("HEAD IS NULL");
            return 1;
        }
        return head.data;
    }

    //delete from head
    int remove(){
        //check null
        if(head == null){
            System.out.println("HEAD IS NULL");
            return 1;
        }
        int data = head.data;
        head = head.next;
        if(head == null)
            tail = null;
        return data;
    }

    //add to tail
    void add(int data){
        Node newNode = new Node(data);
        //check tail null
        if(tail != null)
            tail.next = newNode;
        tail = newNode;
    }
}
