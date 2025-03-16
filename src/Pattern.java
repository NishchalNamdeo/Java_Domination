//public class Pattern {
//    public static void main(String[] args) {
//        int n = 3;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if (j == 1 || j == i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}



//public class Pattern {
//    public static void main(String[] args) {
//        Pattern obj = new  Pattern();
//        System.out.println(obj.printHello());
//    }
//
//    public String printHello() {
//        return  "hello Golu";
//
//    }
//}



//      A Strong number is a number where the sum of the factorial of each digit is equal to the original number. Write a program to determine if a given number is a Strong number.
//      Input Format:
//      T: Number of test cases
//      N: Number to be checked

//    class Solution {
//    public int factorial(int n) {
//        if (n == 0 || n == 1) return 1;
//        return n * factorial(n - 1);
//    }
//
//    public boolean isStrongNumber(int n) {
//        int originalNumber = n;
//        int sum = 0;
//
//        while (n > 0) {
//            int digit = n % 10;
//            sum += factorial(digit);
//            n /= 10;
//        }
//
//        return sum == originalNumber;
//    }
//}




//class Solution {
//    public boolean isPrime(int n) {
//        if (n <= 1) return false;
//        for (int i = 2; i * i <= n; i++)
//            if (n % i == 0) return false;
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Solution sol = new Solution();
//
//        for (int T = sc.nextInt(); T > 0; T--) {
//            System.out.println(sol.isPrime(sc.nextInt()) ? "Prime" : "Not Prime");
//        }
//
//        sc.close();
//    }
//}


