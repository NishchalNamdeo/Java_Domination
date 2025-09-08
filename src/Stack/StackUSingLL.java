package Stack;

//Stack using LinkeList -->

/* public class StackUSingLL {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
        private ListNode head;

        public StackUSingLL() {
            head = null;
        }

        public void push(int val) {
            ListNode node = new ListNode(val);
            node.next = head;
            head = node;
        }

        public Integer pop() {
            if (head == null)
                return null;
            int val = head.val;
            head = head.next;
            return val;
        }

        public Integer peek() {
            if (head == null)
                return null;
            return head.val;
        }

     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        ListNode temp = head;
        while (temp != null){
            sb.append(temp.val);
            if(temp.next != null){
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append("] ");
        return  sb.toString();
    }
 }
*/


//Check Stack using ArrayList -->

public class StackUSingLL{
    private int top, capacity;
    private int data[];

    public StackUSingLL(int capacity){
        top = -1;
        this.capacity = capacity;
        data = new int[capacity];
    }

    public void push(int val){
        if(top + 1 == capacity){
            System.out.println("overflow");
            return;
        }
        data[++top] = val;
    }
    public Integer pop(){
        if(top == -1){
            System.out.println("underflow");
            return null;
        }
        return data[top--];
    }
    public Integer peek(){
        if(top == -1){
            System.out.println("underflow");
            return null;
        }
        return data[top];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(data[i]);
            if (i < top){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}



