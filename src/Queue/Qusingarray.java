package Queue;


//in array way-->

/* public class Qusingarray {
    private int data[];
    private int rare;

    public Qusingarray(int capacity){
        data = new int [capacity];
        rare = -1;
    };
    public void  offer (int val){
        if(rare + 1 == data.length){
            System.out.println("full");
            return;
        }
        data[++rare] = val;
    }
    public Integer poll(){
        if(rare == -1){
            System.out.println("Q is empty");
            return null;
        }
        int ans = data[0];
        for (int i = 0; i <rare ; i++) {
            data[i] = data[i+1];
        }
        rare--;
        return ans;
    }
    public Integer peek(){
        return  rare == -1 ? null : data[0];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= rare; i++) {
            sb.append(data[i]);
            if (i < rare){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}*/


//in circuler array way -->
/* public class Qusingarray {
    private int data[];
    private int rare, front, size, capacity;

    public Qusingarray(int capacity) {
        data = new int[capacity];
        rare = front = -1;
        size = 0;
        this.capacity = capacity;
    }
    public void offer(int val){
        if(isfull()){
            System.out.println("full ho gya");
            return;
        }
        if(rare == -1){
            front = 0;
        }
        rare = (rare + 1) % capacity;
        data[rare] = val;
        size++;
    }

    public Integer poll(){
        if(isempty()){
            return  null;
        }
        int ans = data[front];
        front = (front + 1) % capacity;
        size-- ;
        return  ans;
    }

    public Integer peek(){
        return isempty() ? null : data[front];
    }

    public  boolean isfull(){
        return size == capacity;
    }
    public boolean isempty(){
        return  size == 0;
    }

    public String toString() {
        if(size == 0){
            return  "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int j = size;
        for (int i = front; j-- > 0; i = (i + 1)% capacity) {
            sb.append(data[i]);
            if (i < rare){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
} */


