package Linkedlist;
//package Linkedlist;
//
//public class demo {
//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(10);
//        ListNode l2 = new ListNode(20);
//        ListNode l3 = new ListNode(30);
//        ListNode l4 = new ListNode(40);
//        ListNode l5 = new ListNode(50);
//
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//
//        ListNode temp = l1;
//        while (temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
//
//}


import java.util.LinkedList;

// -> example 2 question
public class demo{
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
//        LinkedList<Integer> list = new LinkedList<>();
        list.add(89);
        list.add(45);
        list.add(23);
        System.out.println(list);
        list.addFirst(76);
        System.out.println(list);
        list.add(2,100);
        System.out.println(list);
    }


}