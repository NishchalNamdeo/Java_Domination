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


Ques 3. ->