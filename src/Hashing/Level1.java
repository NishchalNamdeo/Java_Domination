package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//ques 1. -> Longest Palindrome
//public class Level1 {
//    public int longestPalindrome(String s){
//        Map<Character, Integer> map = new HashMap<>();
//        for(char ch : s.toCharArray()){
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//        int ans = 0;
//        boolean isOdd = false;
//        for(int v:map.values()){
//            if(v%2 == 0){
//                ans += v;
//            }else{
//                ans += v-1;
//                isOdd = true;
//            }
//        }
//        return isOdd ? ans + 1 : ans;
//    }
//}


//Ques 2. ->Intersection of Two Arrays
//public class Level1 {
//    public int[] intersection(int[] nums1, int[] nums2){
//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();
//
//        for (int i = 0; i < nums1.length; i++) {
//          set1.add(nums1[i]);
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            set2.add(nums2[i]);
//        }
//        set1.retainAll(set2);
//        return  set1.stream().mapToInt(Integer :: intValue).toArray();
//    }
//}
