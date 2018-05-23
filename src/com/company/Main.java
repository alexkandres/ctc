package com.company;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(1);
        queue.add(46);
        queue.add(8);
        queue.printQueue();
//        testLinkedList();
    }

    private static void testLinkedList() {
        //1. create LinkedList
        LinkedList linkedList = new LinkedList();
        //2. linkedLst.append data(multiple data)
        linkedList.append(45);
        linkedList.append(55);
        linkedList.append(7);
        //3. printout linkelist
        linkedList.printList();
        //4. prepend
        linkedList.prepend(88);
        linkedList.printList();
        //5. deletewithvalue
        linkedList.deleteNode(55);
        linkedList.printList();

        linkedList.deleteNode(88);
        linkedList.printList();
    }
}
