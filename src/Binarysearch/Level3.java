//package Binarysearch;

//Ques1 -> book allocation
//public class Level3 {
//    private static int minimize(int[] arr, int m){
//        if(m>arr.length){
//            return -1;
//        }
//        int max = arr[0], sum =0;
//        for(int e:arr){
//            sum += e;
//            max = Math.max(max, e);
//        }
//        int start = max, end = sum;
//        int ans = -1;
//        while(start<=end){
//            int mid = (start + end)/2;
//            if(isVaild(arr, m, mid)){
//                ans = mid;
//                end = mid -1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return  ans;
//    }
//
//    private static boolean isVaild(int pages[], int students, int capacity){
//        int curPages = 0;
//        int curStudents = 1;
//        for(int page : pages){
//            if(curPages + page > capacity){
//                curStudents++;
//                curPages = page;
//                if(curStudents > students)
//                    return false;
//            }else {
//                curPages += page;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {2, 6, 5, 7};
//        int m = 3;
//        System.out.println(minimize(arr, m));
//    }
//}


//Ques2 -> Capacity To Ship Packages Within D Days
//public class Level3 {
//    public int shipWithinDays(int[] weights, int days){
//        int max = 0, sum = 0;
//        for(int w : weights){
//            max = Math.max(max, w);
//            sum += w;
//        }
//        int low = max, high = sum;
//        while(low<high){
//            int mid = (low+high)/2;
//            if(canShip(weights, days, mid)){
//                high = mid;
//            }
//            else{
//                low = mid + 1;
//            }
//        }
//        return  low;
//    }
//
//    private boolean canShip(int[] weights, int days, int capacity){
//        int currentWeight = 0, requireDays = 1;
//        for(int w : weights){
//            if(currentWeight + w > capacity){
//                requireDays++;
//                currentWeight = 0;
//            }
//            currentWeight += w;
//        }
//        return  requireDays <= days;
//    }
//}


//Ques 3. ->  Koko Eating Bananas
//public class Level3 {
//    public int minEatingSpeed(int[] piles, int h){
//        int low = 1, high = getMax(piles);
//
//        while(low < high){
//            int mid = (low + high)/2;
//            if(canEatAll(piles, h , mid)){
//                high = mid;
//            }else
//                low = mid + 1;
//        }
//        return low;
//    }
//    private boolean canEatAll(int[] piles, int h, int speed){
//        int time = 0;
//        for(int pile : piles){
//            time += (pile + speed - 1)/ speed;
//        }
//        return  time <= h;
//    }
//
//    private int getMax(int[] piles) {
//        int max = 0;
//        for (int p : piles)
//            max = Math.max(max, p);
//        return max;
//    }
//}