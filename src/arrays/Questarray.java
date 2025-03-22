package arrays;

import java.util.Arrays;
//import java.util.Scanner;


public class Questarray {
    public static void main(String[] args) {
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


//reverse array in java
//        int [] arr = {1, 2, 3, 4, 5};
//        int n = arr.length;
//        int[] temp = new int[n];
//        for (int i = n-1; i >=0 ;) {
//            temp[n-i-1] = arr[i--];
//        }
//        System.out.println(Arrays.toString(temp));

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        





















    }
}


