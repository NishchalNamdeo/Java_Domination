package Sorting;
import java.util.Arrays;

//Ques1. -> merge two sorted array ---> [part 1]


//public class Merging {
//    private static void merge1 (int[] arr, int left, int mid, int right){
//        int n = mid - left + 1;
//        int m = right - mid;
//
//        int[] nums1 = new int[n];
//        int[] nums2 = new int[m];
//
//        for (int i = 0; i < n; i++) {
//            nums1[i] = arr[left + 1];
//        }
//        for (int i = 0; i < m; i++) {
//            nums2[i] = arr[mid + 1 + i];
//        }
//
//        int i = 0, j=0, k = left;
//        while (i<n && j<m){
//            if (nums1[i] <= nums2[j]){
//                arr[k++] = nums1[i++];
//            }else{
//                arr[k++] = nums2[j++];
//            }
//        }
//
//        while(j<n){
//            arr[k++] = nums1[i++];
//        }
//        while(j<m){
//            arr[k++] = nums2[j++];
//        }
//    }
//
//    private static void merge2(int[] arr, int left, int mid, int right){
//        int[] temp = new int[right - left + 1];
//        int i = left, j = mid+1, k= 0;
//
//        while (i<= mid && j<= right){
//            if(arr[i] <= arr[j]){
//                temp [k++] = arr[i++];
//            }
//            else{
//                temp[k++] = arr[j++];
//            }
//        }
//        while (i<= mid){
//            temp[k++] = arr[i++];
//        }
//        while (j<= right){
//            temp[k++] = arr[j++];
//        }
//        for(i = left; i<= right; i++){
//            arr[i] = temp[i - left];
//        }
//    }
//
//    private static void merge3(int[] arr, int left, int mid, int right){
//        int i = left , j = mid+1;
//        while (i<=mid && j<=right){
//          if(arr[i] <= arr[j]){
//              i++;
//          }else{
//              int idx = 1;
//              int temp = arr[i];
//
//              while (idx != i){
//                  arr[idx] = arr[idx - 1];
//                  idx--;
//              }
//              arr[idx] = temp;
//
//              i++;
//              j++;
//              mid++;
//          }
//        }
//    }
//
//    private static void mergeSort(int[] arr, int left, int right){
//        if(left<right){
//            int mid = (left + right) /2;
//            mergeSort(arr, left, right);
//            mergeSort(arr, mid+1, right);
//            merge3(arr, left,  mid, right);
//        }
//    }
//
//    public static void main(String[] args){
//        int[] arr = {8, 4,6,90, 54, 34, -89, -45, 23, 0};
//        mergeSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//}



//Ques2. -> Given an array of integers, implement the Merge Sort algorithm
//          to sort the array in ascending order.

//public class Merging{
//    public  void mergeSort (int[] arr, int low, int high){
//        if(low < high){
//            int mid = low + (high - low)/2;
//            mergeSort(arr, low, mid);
//            mergeSort(arr, mid+1, high);
//
//            merge(arr, low, mid, high);
//        }
//    }
//    private void merge(int[] arr, int low, int mid, int high){
//        int[] temp = new int [high- low+1];
//        int i = low;
//        int j = mid +1;
//        int k =0;
//
//        while (i<= mid && j<=high){
//            if(arr[i] < arr[i]){
//                temp [k++] = arr[i++];
//            }else{
//                temp[k++] = arr[j++];
//            }
//        }
//        while (i<=mid) temp[k++] = arr[i++];
//        while (j<=high) temp[k++] = arr[j++];
//
//        for(int x = 0; x<temp.length; x++){
//            arr[low +x] = temp[x];
//        }
//    }
//
//    public static void main(String[] args) {
//        Merging s = new Merging();
//        int[] arr = {5, 2, 9, 1, 5, 6};
//        s.mergeSort(arr, 0, arr.length - 1);
//        System.out.println("Sorted Array: " + Arrays.toString(arr));
//    }
//
//
//}