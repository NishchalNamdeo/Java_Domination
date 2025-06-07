//package Binarysearch;
//
//public class Binary {
//    private static int binarySearch(int[] arr, int start, int end, int key) {
//      if(start <= end){
//          int mid = start + (end - start)/2;
//          if(arr[mid] == key){
//              return mid;
//          }
//          if(arr[mid]<key){
//              return binarySearch(arr, mid+1, end, key);
//          }
//          else
//              return binarySearch(arr, start, mid-1, key);
//      }
//      return -1;
//    }
//
//
//    public static void main(String[] args) {
//        int [] arr = {2, 4, 8, 13, 15, 34, 37, 56, 78, 98, 109};
//        int answer = binarySearch(arr, 0, arr.length-1, 13);
//        System.out.println(answer);
//    }
//
//}
