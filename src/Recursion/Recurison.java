package Recursion;

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


public class Recurison {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

}