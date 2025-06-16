package Binarysearch;
import java.util.Arrays;

//Ques1. -> Peak Index in a Mountain Array
//public class Level2 {
//    public int peakIndexInMountainArray(int[] arr){
//        int start =0, end = arr.length-1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(arr[mid] < arr[mid+1]){
//                start = mid+1;
//            }
//            else{
//                end = mid-1;
//            }
//        }
//        return start;
//    }
//}


//ques2. -> Search in Rotated Sorted Array
//public class Level2{
//    public int search(int[] nums, int target){
//        int start = 0;
//        int end = nums.length-1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(nums[mid] == target ){
//                return  mid;
//            }
//            if (nums[mid] >= nums[start]) {
//                if(target >= nums[start] && target < nums[mid]){
//                    end = mid-1;
//                }
//                else{
//                    start = mid+1;
//                }
//            }
//            else if(target > nums[start] && target <= nums[end])
//                start = mid+1;
//            else
//                end = mid-1;
//        }
//        return -1;
//    }
//}




//ques3. -> Median of Two Sorted Arrays
//public class Level2{
//
//}