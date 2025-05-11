package DSA;
import java.util.*;


//ArrayList - print kr de raha dublicate
//public class Collection {
//    public static void main(String[] args){
//        ArrayList<Integer> List = new ArrayList<>();
//        List.add(34);
//        List.add(89);
//        List.add(77);
//        List.add(34);
//        System.out.println(List);
//
//        for (int a : List){
//            System.out.println(a);
//        }
//        for (int i = 0; i <List.size(); i++) {
//            System.out.println(List.get(i));
//        }
//    }
//}

//Set - dublicate print ni kr rha
//public class Collection {
//    public static void main(String[] args){
//        Set<Integer> set = new HashSet<>();
//        set.add(23);
//        set.add(34);
//        set.add(34);
//        System.out.println(set);
//    }
//}

//set - me hi treeset for sorted array
//public class Collection {
//    public static void main(String[] args) {
//        int arr[] = {1, 1, 3, 4, 5, 4, 5, 5, 3, 4, 7, 8, 26};
//        Set<Integer> set = new TreeSet<>();
//        for (int a : arr) set.add(a);
//        System.out.println(set);
//    }
//}



//Map - value renew kr ke add karega
//public class Collection {
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("lachi", 28);
//        map.put("lovely", 98);
//        map.put("prachi", 99);
//        System.out.println(map);
//        map.put("prachi", 100);
//        System.out.println(map);
//
////      generic function
//        for (Map.Entry<String, Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//        }
//
////      lambda function
//        map.forEach((k, v) -> System.out.println(v) );
//    }
//}



//map - frequecy check karega
//public class Collection {
//    public static void main(String[] args) {
//        int arr[] = {1,1,2,3,4,5,6,6,66,4,44,56};
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int a : arr){
//            map.put(a , map.getOrDefault(a, 0)+1);
//
//        }
//
////        for printing
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
//        }
//
//    }
//}



//Leetcode Question
//1. two sum
//class Collection {
//        public int[] twoSum(int[] nums, int target) {
//            for(int i=0; i<nums.length-1; i++){
//                for(int j= i+1; j<nums.length; j++){
//                    if(nums[i] + nums[j] == target){
//                        return new int[] {i, j};
//                    }
//                }
//
//            }
//            return null;
//        }
//}

//second solution two sum ka
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<nums.length; i++){
//        int comp = target - nums[i];
//        if(map.containsKey(comp)){
//            return new int[]{i, map.get(comp)};
//        }else{
//            map.put(nums[i], i);
//        }
//            }
//        return null;



//Ques2. Jewels and Stones = jewel ="aA" , stone="AaAAbb" ,  total output = 3 (jo match kr rha)
//class Solution {
//    public int numJewelsInStones(String jewels, String stones) {
//        Set<Character> set = new HashSet<>();
//        for (char j : jewels.toCharArray()){
//          set.add(j);
//        }
//        int ans = 0;
//        for (char s : stones.toCharArray()){
//            if(set.contains(s)){
//             ans++;
//            }
//        }
//        return ans;
//    }
//}

//second solution
//  int ans = 0;
//  for(char s: stones.toCharArray()){
//    for(char j : jewels.toCharArrays()){
//        if( s == j ){
//            ans++;
//        }
//    }
//    return ans;
//}


//checked the sentense is a pangram
//class Solution {
//    public boolean isPangram(String s) {
//        s = s.toLowerCase();
//        Set<Character> ch = new HashSet<>();
//        for(char c: s.toCharArray()){
//            if(c >= 'a' && c <= 'z'){
//                ch.add(c);
//            }
//        }
//        return ch.size() == 26;
//    }
//}