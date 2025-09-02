package Linkedlist;

//Level 1

//Ques -> 707. Design Linked List
/* class NodeList {
    NodeList next;
    int val = 0;

    public NodeList(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    NodeList head;
    int size = 0;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            return -1;
        }
        NodeList temp = head;
        while (index-- > 0) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        NodeList node = new NodeList(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        index--;
        NodeList temp = head;
        NodeList node = new NodeList(val);
        while (index-- > 0) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deletAtIndex(int index){
        if(index >= 0 && index <= size - 1){
            if(index == 0){
                head = head.next;
                size--;
                return;
            }
            NodeList temp = head;
            index--;
            while (index-- > 0){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
}
*/

//Ques 2. -> Middle of the Linked List
/* class NodeList{
    public NodeList next;
    public NodeList middleNode(NodeList head){
        NodeList slow = head, fast= head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
}
*/


//Ques 3. -> Merge Two Sorted Lists
/* class NodeList{
    private NodeList next;

    public NodeList mergeTwoLists(NodeList list1, NodeList list2){
        NodeList ans = new NodeList(-1);
        NodeList temp = ans;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2.next = list2;
            }
            temp = temp.next;
        }
        temp.next = list1 != null ? list1:list2;
        return ans.next;
    }
}
*/


import java.util.HashSet;
import java.util.Set;

//Ques 4 -  Linked List Cycle
/* class NodeList{
    public boolean hasCycle(ListNode head){
        Set<ListNode> visited = new HashSet<>;
        while(head != null){
            if(visited.contains(head)){
                return  true;
            }
            visited.add(head);
            head = head.next;
        }
        return false;
    }
}
*/


//Level - 2

//Ques 5 Reverse Linked List
/* class NodeList{
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while(head != null){
      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }
    return prev;
}*/


//Ques 6  Remove Duplicates from Sorted List - 83 (recursive)
/* class NodeList{
    public ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null){
            return  head;
        }
        ListNode ans = deleteDuplicates(head.next);
        if(ans.val == head.val){
            return  ans;
        }
        else{
            head.next = ans;
            return  head;
        }
    }
} */


//Ques 7  Add Two Numbers
/* class NodeList{
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        ListNode ans = new ListNode(-1); // dummy head
        ListNode temp = ans;
        int carry = 0;

        while (h1 != null || h2 != null) {
            int sum = carry;

            if (h1 != null) {
                sum += h1.val;
                h1 = h1.next;
            }
            if (h2 != null) {
                sum += h2.val;
                h2 = h2.next;
            }

            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return ans.next;
    }
}*/

//Level - 3