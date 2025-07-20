//package Linkedlist;
//
//public class MyLinkedList {
//    ListNode head;
//    int size;
//    public MyLinkedList(){
//     head = null;
//     size = 0;
//    }
//
//    public void add(int data) {
//        add(size, data);
//    }
//
//    public void add(int index, int data) {
//        if(index < 0 || index > size){
//            throw new IndexOutOfBoundsException("at index " + index + ", for size: " + size());
//        }
//        if(index == 0){
//            addFirst(data);
//            return;
//        }
//        ListNode node = new ListNode(data);
//        ListNode temp = head;
//        index--;
//        while (index-- > 0){
//            temp = temp.next;
//        }
//       node.next = temp.next;
//        temp.next = node;
//        size++;
//    }
//
//    public int size() {
//        return  size;
//    }
//
//
//    public void addFirst(int data) {
//        ListNode node = new ListNode(data);
//        node.next = head;
//        head = node;
//        size++;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[ ");
//        ListNode temp = head;
//        while (temp != null){
//            sb.append(temp.val);
//            if(temp.next != null){
//                sb.append(", ");
//            }
//            temp = temp.next;
//        }
//        sb.append("] ");
//        return  sb.toString();
//    }
//}
