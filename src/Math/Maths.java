package Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Ques -> factorial of a number
//class Maths {
//    public void PrintFact(int n){
//        System.out.println("factorial of " + n);
//        for (int i = 1; i*i<= n; i++) {
//            if(n%i == 0){
//                System.out.print(i + " ");
//            }
//           if( n != n/i){
//               System.out.print(n/i + " ");
//           }
//        }
//    }
//
//    public static  void main(String[] agrs){
//        Maths sol = new Maths();
//        sol.PrintFact(36) ;
//    }
//}

// Ques -> Second tarika --->
//public class Maths {
//    public static void main(String[] agrs){
//       int n = 100;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if(n%i == 0){
//                list.add(i);
//            }
//        }
//        for (int i = (int)Math.sqrt(n); i >=1 ; i--) {
//            if(n%i == 0){
//                if(i*i != n){
//                    list.add(n/i);
//                }
//            }
//        }
//        System.out.println(list);
//    }
//}


//Ques -> check number is prime
//public class Maths {
//    public static boolean isPrime(int n){
//        if(n <= 1)
//            return  false;
//        if(n <= 3)
//            return true;
//        if(n%2 ==0 || n%3 ==0)
//            return false;
//        for(int i = 5; i * i <= n; i++){
//            if(n % i == 0)
//                return false;
//        }
//        return  true;
//
//    }
//    public static void main(String[] agrs){
//        for (int i = 1; i < 100; i++) {
//            if(isPrime(i))
//                System.out.println(i);
//        }
//
//    }
//}



//Ques -> math level - 2 --> sieve algor
//public class Maths {
//    public static void main(String[] agrs) {
//        int n = 100;
//        boolean prime[] = new boolean[n + 1];
//        Arrays.fill(prime, true);
//        prime[0] = prime[1] = false;
//        for (int i = 2; i * i <= n; i++) {
//            if (prime[i]) {
//                for (int j = i * i; j <= n; j = j + i) {
//                    prime[j] = false;
//
//                }
//            }
//        }
//        for (int i = 0; i <=n; i++) {
//            if(prime[i])
//                System.out.print(i + " ");
//        }
//
//    }
//}



//Ques -> k-th factor of n
//public class Maths {
//    public int kthFactor(int n, int k)  {
//        for (int i = 1; i <=n ; i++) {
//        if(n % i == 0)
//            return k--;
//        if (k == 0)
//            return i;
//        }
//        return -1;
//    }
//}


//ques -> sqrt niklan without using sqrt
//public class Maths {
//    public int kthFactor(int x) {
//        int ans = 0;
//        for (int i = 1; i <= x/i; i++)
//            ans = i;
//        return ans;
//    }
//}

//Pow (x,n)
//class Solution {
//    public double recPow(double x, int n) {
//        if(n == 0) return 1;
//        if(n == 1) return x;
//        double r = recPow(x, n/2);
//        return (n%2 == 0) ? r * r : r * r * x;
//
//    }
//    public double myPow(double x, int n) {
//        boolean isNeg = false;
//        if(n < 0){
//            isNeg = true;
//            n *= -1;
//        }
//        double ans = recPow(x, n);
//        return isNeg ? 1 / ans : ans;
//    }
//}