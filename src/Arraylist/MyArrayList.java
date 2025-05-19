//package Arraylist;

//import java.util.Arrays;
//
//public class MyArrayList {
//    int[] data;
//    int p;
//
//    public MyArrayList() {
//        data = new int[7];
//        p = -1;
//    }


//Given by user
//    public MyArrayList(int initialCapacity) {
//        data = new int[initialCapacity];
//        p = -1;
//    }
//
//    // 2x the privious capacity
//    private void ensureCapacity() {
//        if (p + 1 == data.length) {
//            data = Arrays.copyOf(data, data.length * 2);
//        }
//    }
//
//    //  Add at end
//    public void add(int val) {
//        ensureCapacity();
//        data[++p] = val;
//    }
//
//    //  Add at index
//    public void add(int index, int val) {
//        if (index < 0 || index > p + 1){
//            throw new IndexOutOfBoundsException( "at index " + index + ", for size: " + size());
//        }
//        ensureCapacity();
//
//        for (int i = p + 1; i > index; i--) {
//            data[i] = data[i - 1];
//        }
//        data[index] = val;
//        p++;
//    }
//
//    //  Size of list
//    public int size() {
//        return p + 1;
//    }
//
//    //  Get element
//    public int get(int index) {
//        if (index < 0 || index > p) throw new IndexOutOfBoundsException("at index " + index + ", for size: " + size());
//        return data[index];
//    }
//
//    //  Remove at index
//    public int remove(int index) {
//        if (index < 0 || index > p){
//            throw new IndexOutOfBoundsException("at index " + index + ", for size: " + size());
//        }
//
//        int remValue = data[index];
//
//        for (int i = index; i < p; i++) {
//            data[i] = data[i + 1];
//        }
//        p--;
//        return remValue;
//
//    }
//
//
//
//    //  toString for printing
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        for (int i = 0; i <= p; i++) {
//            sb.append(data[i]);
//            if (i < p){
//                sb.append(", ");
//            }
//        }
//        sb.append("]");
//        return sb.toString();
//    }
//}
