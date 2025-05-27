package Arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Ques1 ->  Find Pivot Index
//public class Levelthree {
//    public int pivotIndex(int[] nums) {
//       int total = 0;
//       for(int i :nums) total += i;
//       int lSum = 0;
//       for (int i=0; i<nums.length; i++){
//           if(lSum == total - nums[i]-lSum){
//               return i;
//           }
//           lSum += nums[i];
//       }
//        return -1;
//    }
//}


//Ques2. -> Product of Array Except Self
//public class Levelthree {
//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int arr[] = new int[n];
//        int res = 1;
//        for (int i = 0; i < n; i++) {
//            arr[i] = res;
//            res = nums[i] * res;
//        }
//        res = 1;
//        for (int i = n - 1; i >= 0; i--) {
//             arr[i] = res * arr[i];
//             res = nums[i] * res;
//        }
//        return arr;
//    }
//}



//Ques3. -> Maximum Subarray
//public class Levelthree {
//    public int maxSubArray(int[] nums) {
//        int maxSum = nums[0];
//        int currSum = 0;
//        for(int a: nums ){
//            currSum += a;
//            maxSum = Math.max(maxSum, currSum);
//            if(currSum<0) currSum = 0;
//        }
//        return maxSum;
//    }
//}


//Ques4. -> Majority Element
//public class Levelthree {
//    public int majorityElement(int[] nums) {
//        int ans = nums[0] , c=0;
//        for(int i=1; i<nums.length; i++){
//            if(nums[0] == ans)c++;
//            else c--;
//            if(c==0){
//                ans = nums[i];
//                c=1;
//            }
//        }
//        return ans ;
//    }
//}




//Ques5. Marge intervals
//class Levelthree{
//    public int[][] merge(int[][] intervals){
//       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//       if(intervals.length == 1){
//           return intervals;
//       }
//       List <int[]> list = new ArrayList<>();
//       for(int[] interval : intervals){
//           int size = list.size();
//           if(size == 0 || list.get(size-1)[1] < interval[0]){
//               list.add(interval);
//           }else{
//               list.get(size-1)[1] = Math.max(list.get(size-1)[1], interval[1]);
//           }
//       }
//
//        int[][] ans = new int[list.size()][];
//        for(int i=0; i<list.size(); i++){
//            ans[i] = list.get(i);
//        }
//        return ans;
//    }
//}


//Ques6. -> 3Sum
//public class Levelthree {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 2; i++) {
//            if (i != 0 && nums[i] == nums[i - 1]) continue;
//            int j = i + 1;
//            int k = nums.length - 1;
//            while (j < k) {
//                int sum = nums[i] + nums[j] + nums[k];
//                if (sum == 0) {
//                    ans.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
//                    while (j < k && nums[j] == nums[j - 1]) j++;
//                    while (j < k && nums[k] == nums[k + 1]) k--;
//                } else if (sum < 0) {
//                    j++;
//                } else {
//                    k--;
//                }
//            }
//        }
//        return ans;
//    }
//}


//Ques7. -> Trapping Rain Water
//public class Levelthree {
//    public int trap(int[] height) {
//        int maxR[] = new int[height.length];
//        int max = height[height.length - 1];
//        maxR[maxR.length - 1] = height[height.length - 1];
//
//        for (int i = maxR.length - 2; i >= 0; i--) {
//            maxR[i] = max;
//            max = Math.min(height[i], max);
//        }
//
//        int maxL = height[0];
//        int water = 0;
//        for (int i = 0; i < height.length; i++) {
//            if ((Math.min(maxL, maxR[i]) - height[i]) > 0)
//                water += Math.min(maxL, maxR[i] - height[i]);
//            water += Math.max(maxL, height[i]);
//        }
//        return water;
//    }
//}