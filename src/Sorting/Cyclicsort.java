//package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class Cyclicsort {
//    public static void sort(int [] arr){
//        int i = 0;
//        while (i<arr.length){
//            int ans = arr[i] - 1;
//            if(arr[i] != arr[ans]){
//                int temp = arr[i];
//                arr[i] = arr[ans];
//                arr[ans] = temp;
//            }else{
//                i++;
//            }
//        }
//    }
//
//    public static void main(String[] agrs){
//        int[] arr = {3, 1, 5, 4, 2};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}



//Ques1. -> Missing Number
//public class Cyclicsort{
//    public int missingNumber(int[] nums){
//     int i = 0;
//     while (i<nums.length){
//         int ans = nums[i];
//         if(ans < nums.length && nums[i] != nums[ans]){
//             int temp = nums[i];
//             nums[i] = nums[ans];
//             nums[ans] = temp;
//         }else{
//             i++;
//         }
//     }
//        for ( i = 0; i < nums.length; i++) {
//            if(nums[i] != 1) return i;
//        }
//        return nums.length;
//    }
//}



//Ques2. -> find duplicate number / Find All Numbers Disappeared in an Array
//public class Cyclicsort {
//    public List<Integer> findDisappearedNumbers(int[] nums){
//        List<Integer> list = new ArrayList<>();
//        int  i = 0;
//        while(i< nums.length){
//            if(nums[i] == nums[nums[i] - 1]){
//                i++;
//            }else if(nums[i]-1 != i){
//                swap(nums, i, nums[i-1]);
//            }else{
//                i++;
//            }
//        }
//        for(i=0; i<nums.length; i++){
//            if(nums[i]-1 != i)
//                list.add(i+1);
//        }
//        return list;
//    }
//    public void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}



//Ques3. ->  First Missing Positive
//public class Cyclicsort{
//    public int firstMissingPositive(int[] nums){
//        int i =0;
//        while(i<nums.length){
//            if(nums[i]>0 && nums[i]<=nums.length && i+1 != nums[i] && nums[i] != nums[nums[i]-1]){
//                swap(nums, i, nums[i]-1);
//            }else{
//                i++;
//            }
//        }
//        for (i = 0; i < nums.length; i++) {
//            if(i+1 != nums[i])
//                return i+1;
//        }
//        return i+1;
//    }
//    public  void swap(int[]arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}