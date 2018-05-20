package com.company;

public class LinkedList {
    Node head;

    //todo append to end
    public void append(int data){

        //check special case
        if(head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);

    }
    //todo prepend to beginning
    //todo delete
    //todo print linkedlist
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
    }
}
