public class Java_loops {
    public static void main(String[] args) {

        // qus1. Using a for loop to print numbers from 1 to 10
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(i + " "); // Printing numbers in a single line
//            };

//     qus2. Find the sum of the first N natural numbers.
//            int n = 10, sum = 0;
//            for (int i = 1; i <= n; i++) {
//            sum += i;
//            }
//            System.out.println("Sum of first " + n + " numbers: " + sum);


//    qus3.    Print the Fibonacci series using a for loop.
//        int n = 10, a = 0, b = 1;
//        System.out.print(a + " " + b + " ");
//        for (int i = 2; i < n; i++) {
//            int next = a + b;
//            System.out.print(next + " ");
//            a = b;
//            b = next;
//        }


//       qus4. Print the multiplication table of a number.
//        int n = 5;
//        for(int i = 0; i<=10; i++){
//            System.out.println(i + (n * i));
//        }


//        Qus5. Reverse an array using a for loop.
//        int [] num = {1,2,3,4,5,6};
//        for(int i = num.length-1; i>=0; i--){
//            System.out.print(num[i] + " ");
//        }


//        qus6. Find the factorial of a number using a for loop
//         int n = 5;
//         int fact = 1;
//         for( int i =1; i<=n; i++){
//             fact *= i;
//         }
//         System.out.println("Factorial of " + n + " is " + fact);

//  qus7. Check if a number is prime using a for loop.(not solve)
//        int count = 0; // Count of prime numbers found
//        System.out.println("First 10 prime numbers:");
//        for (int num = 2; count < 10; num++) { // Start from 2, keep going until 10 primes are found
//            if (isPrime(num)) {
//                System.out.print(num + " ");
//                count++;
//            }
//        }
//    }

        // Function to check if a number is prime
//        public static boolean isPrime(int num) {
//        if (num < 2) return false; // Numbers less than 2 are not prime
//        for (int i = 2; i * i <= num; i++) { // Check divisibility only up to sqrt(num)
//            if (num % i == 0) return false;
//        }
//        return true;


// qus9. check number is a prime or not
//        int n = 31;
//        int c= 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                c++;
//            }
//
//        }
//        System.out.println(c==2 ? "prime " :"not");


//       qus10 Print all even numbers from 1 to 50.
//        for (int i = 1; i <=50 ; i++) {
//           if(i% 2 == 0){
//               System.out.println(i);
//           }
//        }

//        qus11. Count the number of digits in a number.
//        int num = 12345, count = 0;
//        for (; num > 0; num /= 10) {
//            count++;
//        }
//        System.out.println(count);


//        While Loop Question

//        qus1. Print numbers from 1 to 10 using a while loop.
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }

//        qus2. Find the sum of digits of a number.
//        int n = 55, sum = 0;
//        while(n>0){
//            sum += n % 10;
//            n /= 10;
//        }
//        System.out.println(sum);

//       qus3.  Reverse a number using a while loop.
//       int n = 123456, rev = 0;
//       while(n>0){
//           rev = rev * 10 + n % 10;
//           n /= 10;
//       }
//        System.out.println(rev);

//      qus4. Find the GCD of two numbers.  (sbse bada commman factor)
//         int a = 30, b=50;
//         while(b != 0){
//             int temp = b;
//             b = a% b;
//             a = temp;
//         }
//        System.out.println(a);









    };
};
