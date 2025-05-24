package Arraylist;
import java.util.Arrays;

//Ques -> reverse array k time
//  public class List {
//    public static void LeftRotation(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//
//        int[] temp = new int[n];
//        int j = 0;
//
//        for (int i = k; i < n; i++) {
//            temp[j++] = arr[i];
//        }
//
//        for (int i = 0; i < k; i++) {
//            temp[j++] = arr[i];
//        }
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = temp[i];
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args){
//        int arr[] = {1,2,3,4,5};
//        int k = 2;
//        LeftRotation(arr, k);
//    }
//}



//Ques -> Consecutive ones in array
//public class List{
//    public static int Consecutive(int[] nums){
//       int maxCount = 0;
//       int count = 0;
//
//       for(int num :nums){
//           if(num == 1){
//               count++;
//               maxCount = Math.max(maxCount, count);
//           }
//           else{
//               count = 0;
//           }
//       }
//        return maxCount;
//    }
//}


//Ques -> Remove Duplicates from Sorted Array
//public class List{
//    public static int removeDuplicates(int[] nums){
//        if(nums.length == 0) return 0;
//
//        int i = 0;
//        for (int j = 1; j < nums.length ; j++) {
//             if(nums[i] != nums[j]){
//                 i++;
//                 nums[i] = nums[j];
//             }
//        }
//        return  i+1;
//    }
//}



//Ques -> Marge Two sorted array
//public class List {
//    public static int[] merge(int[] a, int[] b) {
//        Arrays.sort(a);
//        Arrays.sort(b);
//        int i = 0, j = 0, k = 0;
//        int[] res = new int[a.length + b.length];
//        while (i < a.length && j < b.length) {
//            res[k++] = a[i] < b[j] ? a[i++] : b[j++];
//        }
//
//        while (i<a.length) res[k++] = a[i++];
//        while (j<b.length) res[k++] = b[j++];
//
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[] merged = merge(new int[]{5, 1, 9}, new int[]{3, 6, 2});
//        System.out.println(Arrays.toString(merged));
//    }
//}



// ---> Another MEthod Merge sorted array
//class List {
//    public void mergeSortedArrays(int arr1[],int m, int arr2[], int n) {
//
//        int i = m - 1;           // Pointer for last valid element in arr1
//        int j = n - 1;           // Pointer for last element in arr2
//        int k = m + n - 1;       // Pointer for last position in arr1
//
//        while (i >= 0 && j >= 0) {
//            if (arr1[i] > arr2[j]) {
//                arr1[k--] = arr1[i--];
//            } else {
//                arr1[k--] = arr2[j--];
//            }
//        }
//
//        // If any elements left in arr2
//        while (j >= 0) {
//            arr1[k--] = arr2[j--];
//        }
//
//    }
//}

// Ques -> Duplicate zeros
//class List {
//    public void duplicateZeros(int[] arr) {
//
//        int n = arr.length;
//        int[] res = new int[n];
//        int j = 0;
//
//        for (int i = 0; i <n && j<n ; i++) {
//            if(arr[i] == 0){
//                res[j++] = 0;
//                if(j<n) res[j++] = 0;
//            }
//            else{
//                res[j++] = arr[i];
//            }
//        }
//
//        for (int i = 0; i < n; i++) arr[i] = res[i];
//
//    }
//}


//Ques -> Best Time to Buy and Sell Stock
//class List {
//    public int maxProfit(int[] prices) {
//        int min = prices[0], ans = 0;
//        for(int price : prices){
//            ans = Math.max(ans, price-min);
//            min = Math.min(min, price);
//        }
//        return ans;
//    }
//}


//Ques -> Sort Colors
//class List {
//    public void sortColors(int[] nums) {
//        int s = 0 , m = 0 , e = nums.length-1;
//        while(m <= e){
//            if(nums[m] == 0){
//                swap(nums, s++, m++);
//            }
//           else if(nums[m] == 2){
//               swap(nums, m, e--);
//            }
//           else {
//                m++;
//            }
//        }
//    }
//
//    public void swap(int[] nums, int i, int j){
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//}