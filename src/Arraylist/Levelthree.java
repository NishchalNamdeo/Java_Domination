package Arraylist;


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


