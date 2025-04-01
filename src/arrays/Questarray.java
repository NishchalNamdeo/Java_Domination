package arrays;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Scanner;


//public class Questarray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);



//      SUM of Array element
//        System.out.println("give me size of array");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int sum = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = sc.nextInt();
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//        System.out.println((double) sum/size);



//    Greatest in Array
//        int[] arr = {10, 5, 20, 38, 8};
//        int great = 0;
//        for (int i =1; i < arr.length; i++) {
//            if (arr[i] > arr[great]) {
//                great = i;
//            }
//            System.out.println("greates = " + arr[great] + " found at =" + great);
//        }


//    second greatest in array
//        int [] arr = {10, 30, 8, 80, 40};
//        int first = Math.max(arr[0], arr[1]);
//        int sec = Math.min(arr[0], arr[1]);
//        for (int i = 2; i <arr.length ; i++) {
//            if( arr[i] > first){
//                sec = first;
//                first = arr[i];
//            }else if(arr[i] > sec){
//                sec = arr[i];
//            }
//        }
//        System.out.println(sec);


//    Is array sorted ( line se sorted  ho)
//        int[] arr = {10, 16, 30};
//        boolean isSorted = true;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i-1] > arr[i]) {
//                isSorted = false;
//                break;
//            }
//        }
//        System.out.println(isSorted);
        //        System.out.println(isSorted);


//  Array deep copy
//        int arr[]  = {1,2,3,4};
//        int  copy[] = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            copy[i] = arr[i];
//        }
//        copy[0] = 1000;
//        System.out.println(Arrays.toString(copy));


//   left rotate array
//        int[] arr = {1, 2, 3, 4, 5};
//        int temp = arr[0];
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        arr[n - 1] = temp;
//        System.out.println(Arrays.toString(arr));


//  left rotate array by k
//        int[] arr = {1, 2, 3, 4, 5};
//        int n = arr.length;   (k = k % n = Limition lag jayga usse jada ni chalega);
//        int k = 3;
//        while( k-- > 0){
//            int temp = arr[0];
//            for (int i = 0; i < n - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[n - 1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));


//  reverse array in java
//        int [] arr = {1, 2, 3, 4, 5};
//        int n = arr.length;
//        int[] temp = new int[n];
//        for (int i = n-1; i >=0 ;) {
//            temp[n-i-1] = arr[i--];
//        }
//        System.out.println(Arrays.toString(temp));

//        int[] arr = {1, 2, 3, 4, 5};
//        int n = arr.length;
//        int i = 0, j = n - 1;
//        while (i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(arr));


//    }
//}


//liner search Question;
//public class Questarray {
//    public static int linearsearch(int arr[], int key){
//        for (int i = 0; i <arr.length ; i++) {
//            if (key == arr[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//
//   int arr[] = {29, 30, 59, 39};
//   int key = 59;
//        System.out.println(linearsearch(arr, key));
//
//
//
//    }
//}


//public class Questarray {
//    public static int binearsearch(int arr[], int key) {
//        int start = 0, end = arr.length - 1;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (arr[mid] == key) {
//                return mid;
//            }
//            if (arr[mid] > key) {
//                return end = mid - 1;
//            } else start = mid + 1;
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int arr[] = {29, 34, 59, 39, 30};
//        Arrays.sort(arr);
//        int key = 39;
//        System.out.println(binearsearch(arr, key));
//    }
//}

//bubble sort
//public class Questarray {
//    public static void main(String[] args) {
//        int arr[] = {29, 34, 59, 39, 30};
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}


//selection sort
//public class Questarray {
//    public static void main(String[] args) {
//        int arr[] = {22, 44, 1, 23, 12, 39};
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++) {
//            int smallest = i;
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[j] < arr[smallest]){
//                    smallest = j;
//                }
//            }
//            if( i != smallest){
//                int temp = arr[i];
//                arr[i] = arr[smallest];
//                arr[smallest] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}


//intsertion sort
//public class Questarray {
//    public static void main(String[] args) {
//        int arr[] = {22, 44, 1, 23, 12, 39};
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int j = i-1;
//            int key = arr[i];
//            while(j>=0 && arr[j]>key){
//                arr[j+1] = arr[j--];
//                arr[j+1] = key;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}


//subarray question
//public class Questarray {
//    public static void main(String[] args) {
//        int arr[] = {-1, 1, -1, 1, -1};
//        int target = 0;
//        int ans = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            int sum = 0;
//            for (int j = i; j <arr.length ; j++) {
//                sum += arr[j];
//                if (sum == target){
//                    ans++;
//                }
//            }
//
//        }
//        System.out.println(ans);
//    }
//}



//Linear search arrays
//class Solution {
//    public static int linearSearch(int arr[], int n, int m) {
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == m) {
//                return i;
//            }
//        }
//
//        return -1;
//    }
//}


//binary seacrh in array
//class Solution{
//    public int search(int arr[], int n, int m){
//        int s=0, e=n-1;
//        while(s <= e){
//            int mid = s+(e-s)/2;
//
//            if(arr[mid] == m){
//                return mid;
//            }else if(arr[mid] < m){
//                s = mid+1;
//            }else{
//                e = mid-1;
//            }
//        }
//
//        return -1;
//    }
//}


//move to zero in last index
//public class Questarray {
//    public static void moveZerosToEnd(int arr[], int n) {
//       int j = 0;
//        for (int i = 0; i < n ; i++) {
//            if (arr[i] != 0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        moveZerosToEnd(arr, n);
//
//        for (int num : arr){
//            System.out.print(num + "");
//        }
//    }
//}


//Bubble sort only by Method
//class Solution{
//    public void bubbleSort(int arr[], int n) {
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//}


//Concatenate arrays
//class Solution {
//    public int[] getConcatenate(int[] arr, int n) {
//        int[] ans = new int[2 * n];
//
//        for (int i = 0; i < n; i++) {
//            ans[i] = arr[i];
//            ans[i + n] = arr[i];
//        }
//        return ans;
//    }
//}

//build arryas
//class Solution {
//    public int[] buildArray(int[] nums, int n) {
//        int [] ans = new int[n];
//        for (int i = 0; i <n ; i++) {
//            ans[i] = nums[nums[i]];
//        }
//        return ans;
//    }
//}

//absolut
//class Solution {
//    public int absoluteDifference(int[] arr, int n) {
//        int totalSum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                totalSum += Math.abs(arr[i] - arr[j]);
//            }
//        }
//        return totalSum;
//    }
//}




//multi D and jagged arryas

/* qus ->  2d arrays question by index print
    public class Questarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][31];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }}
 */


/*  qus ->sum of digonal
public class Questarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = 0, right = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) left += arr[i][j];
                if (i + j == arr.length - 1) right += arr[i][j];
            }
        }
        System.out.println(left + right);
    }
}
*/

//zix - zax / jagged arrays ----------
/* public class Questarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2},{4},{7,8,9,10, 11}};
        int left = 0, right = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}
*/


/* what are the contents of arr after the following code has been exceuted
 public class Questarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{3,2,1}, {1,2,3}};
        int value = 0;
        for (int row = 1; row <arr.length ; row++) {
            for (int col = 1; col <arr[0].length ; col++) {
                if(arr[row][col] % 2 == 1){
                    arr[row][col] = arr[row][col] + 1;
                }
                else if( arr[row][col] % 2 == 0){
                    arr[row][col] = arr[row][col] * 2;
                }
            }

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col= 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
*/

