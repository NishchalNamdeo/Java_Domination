//package Binarysearch;
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


//second way  ->
//class Solution {
//    public int search(int[] nums, int target) {
//        int low = 0, high = nums.length - 1;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if (nums[mid] == target) return mid;
//
//            // Left half is sorted
//            if (nums[low] <= nums[mid]) {
//                if (nums[low] <= target && target < nums[mid])
//                    high = mid - 1;  // target in left half
//                else
//                    low = mid + 1;   // target in right half
//            }
//            // Right half is sorted
//            else {
//                if (nums[mid] < target && target <= nums[high])
//                    low = mid + 1;   // target in right half
//                else
//                    high = mid - 1;  // target in left half
//            }
//        }
//
//        return -1; // target not found
//    }
//}





//ques3. -> Median of Two Sorted Arrays
//public class Level2{
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int m = nums1.length;
//        int n = nums2.length;
//
//        int start = 0, end = m;
//        while( start <= end){
//          int mid1 = (start + end) /2;
//          int mid2 = (m+n+1)/2 - mid1;
//
//          int l1 = mid1 == 0 ? Integer.MIN_VALUE : nums1[mid1 - 1];
//          int r1 = mid1 == 0 ? Integer.MAX_VALUE : nums1[mid1];
//
//          int l2 = mid2 == 0 ? Integer.MIN_VALUE : nums2[mid2 - 1];
//          int r2 = mid2 == 0 ? Integer.MAX_VALUE : nums2[mid2];
//
//          if(l1 <= r2 && l2 <= r1){
//              if((m+n) % 2 == 0){
//                  return (Math.max(l1, l2)+ Math.min(r1, r2)) / 2.0;
//              }else{
//                  return  Math.max(l1, l2);
//              }
//          }
//          if(l2 > r1){
//              start = mid1 + 1;
//          }else{
//              end = mid1 - 1;
//          }
//        }
//        return  0.0;
//    }
//}