//package Sorting;
//import java.util.Arrays;
//
//public class Quicksort {
//
//    private static void swap(int[] arr, int i, int j) {
//        int t = arr[i];
//        arr[i] = arr[j];
//        arr[j] = t;
//    }
//
//    private static int partition(int[] arr, int left, int right) {
//        int pivot = arr[left];
//        int i = left + 1, j = right;
//
//        while (i <= j) {
//            while (i <= j && arr[i] <= pivot) i++;
//            while (i <= j && arr[j] > pivot) j--;
//            if (i < j) swap(arr, i, j);
//        }
//
//        swap(arr, j, left);
//        return j;
//    }
//
//    public static void quickSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int pivot = partition(arr, left, right);
//            quickSort(arr, left, pivot - 1);
//            quickSort(arr, pivot + 1, right);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {8, 4, 6, 90, 34, 54, 12, -89, -45, 23, 0};
//        quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//    }
//}
