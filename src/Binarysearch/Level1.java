package Binarysearch;


//Ques1. -> binary search
//public class Level1 {
//    public int search(int[] nums, int key){
//        int start = 0, end = nums.length-1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(nums[mid] == key){
//                return mid;
//            }
//            else if(nums[mid]<key){
//                start = mid+1;
//            }else{
//                end = mid-1;
//            }
//        }
//        return -1;
//    }
//}



//ques2. -> Search Insert Position
//public class Level1 {
//    public int searchInsert(int[] nums, int target) {
//        int start = 0, end= nums.length-1;
//        while(start<=end){
//            int mid = start +(end-start)/2;
//            if(nums[mid]==target){
//                return mid;
//            }
//            else if(nums[mid]<target){
//                start=mid+1;
//            }else{
//                end = mid-1;
//            }
//        }
//        return start;
//    }
//}


import javax.swing.text.Position;

//ques3 -> Find First and Last Position of Element in Sorted Array
//public class Level1{
//    public int[] searchRange(int[] nums, int target){
//        int start = 0;
//        int end = nums.length-1;
//        int first0 = -1, last0 = -1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if(nums[mid] == target){
//                first0 = mid;
//                end = mid-1;
//            }else if(target > nums[mid]){
//                start = mid +1;
//            }else{
//                end = mid -1;
//            }
//        }
//        start = 0;
//        end = nums.length-1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if(nums[mid] == target){
//                last0 = mid;
//                start = mid+1;
//            }else if(target > nums[mid]){
//                start = mid +1;
//            }else{
//                end = mid -1;
//            }
//        }
//        return new int[]{first0, last0};
//
//    }
//}
