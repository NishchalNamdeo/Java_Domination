package Hashing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Ques 1. -> Contiguous Array
//public class Level2 {
//    public int findMaxLength(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, -1);
//        int sum = 0, longest = 0;
//        for(int i= 0; i<nums.length; i++){
//            sum += nums[i] == 0? -1: 1;
//            if(!map.containsKey(sum))
//                map.put(sum, i);
//            if(map.containsKey(sum))
//                longest = Math.max(longest, i-map.get(sum));
//        }
//        return longest;
//    }
//}


//Ques 2. ->count of distinct integers in each window.
//public class Level2{
//    public ArrayList<Integer> countDistinct(int arr[], int k){
//        ArrayList<Integer> ans = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i <arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//            if (i >= k) {
//                int out = arr[i - k];
//                map.put(out, map.get(out) - 1);
//                if (map.get(out) == 0) map.remove(out);
//            }
//            if (i >= k - 1) ans.add(map.size());
//        }
//        return ans;
//    }
//}