package Recursion;

// Ques-> sum of two
//public class Recurison {
//    public static int sum(int n) {
//        if (n == 1)
//            return 1;
//        return n + sum(n - 1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(5));
//    }
//}

//  Ques-> fabonaci
//public class Recurison {
//    public static int fib(int n) {
//        if (n <= 1)
//            return n;
//        return fib(n - 1) + fib(n - 2);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fib(6));
//    }
//
//}


//ques-> Euclidean algo
//gcd(a, b) = gcd(b, a%b) ya gcd(a, b%a) - (72, 30 ) = 6
//public class Recurison {
//    public static int gcd(int a, int b) {
//        if (b == 0)
//            return a;
//        return gcd(b, a%b);
//
//    }
//    public static void main(String[] args) {
//        int a = 72,  b = 30;
//        System.out.println(gcd( a, b));
//    }
//
//}



// ques -> find the gcd of array -> largest and smallest
//public class Recurison {
//    public  int gcd(int[] nums) {
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//        for (int num : nums) {
//            min = Math.min(min, num);
//            max = Math.max(max, num);
//        }
//        return gcd(min, max);
//    }
//
//    private int gcd(int a, int b) {
//        return b == 0 ? a : gcd(b, a % b);
//    }

//    print krwana ho ----->
//    public static void main(String[] args) {
//        Recurison sol = new Recurison();
//        int[] arr = {8, 24, 16, 32};
//        int result = sol.gcd(arr);
//        System.out.println("GCD of min and max is: " + result);
//    }
//}



