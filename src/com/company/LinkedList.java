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
    public void prepend(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //todo delete, walked through from head
    public void deleteNode(int data){
        if(head.data == data){
            head = head.next;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    //todo print linkedlist
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println();
    }
}
