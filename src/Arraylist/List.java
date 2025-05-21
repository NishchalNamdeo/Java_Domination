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