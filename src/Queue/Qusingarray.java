package Queue;

public class Qusingarray {
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
}
