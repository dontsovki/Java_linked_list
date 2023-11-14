package org.example.Package;

public class Class_singly_inked_linked_list {
    private Node head; //Первыйузелсвязногосписка
    private Node tail; //Последнийэлемент
    public class Node{
        private int value;
        private Node next;

    }
    public void push_back(int value){
        Node node = new Node();
        node.value = value;

        if(head == null){
            head = node;
        }else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }


    public static void main(String[] args) {

    }
}
