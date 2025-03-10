import java.util.Scanner;

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

//      qus4. Find the GCD of two numbers.(sbse bada commman factor)
//         int a = 30, b=50;
//         while(b != 0){
//             int temp = b;
//             b = a% b;
//             a = temp;
//         }
//        System.out.println(a);


//      qus5. check strong number ( factorial nikal ke)
//        int num = sc.nextInt();
//
//        int sum = 0;
//        int temp = num;
//
//        while (temp != 0) {
//            int lastDigit = temp % 10; // Extract last digit
//            int fact = 1;
//
//            // Calculate factorial of the digit
//            for (int i = 1; i <= lastDigit; i++) {
//                fact *= i;
//            }
//
//            sum += fact; // Add factorial to sum
//            temp /= 10;  // Remove last digit
//        }
//
//        // Check if sum of factorials is equal to the original number
//        if (sum == num) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }


//     qus6 check HCF means (12, 15 = 3)
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        while (a != b) {
//            if (a > b) a -= b;
//            else b -= a;
//        }
//        System.out.println(a);

//        qus 7 check number is perfect square
        // Input integer
//        int num = sc.nextInt();
//        boolean isPerfectSquare = false;
//        int i = 1;
//        while (i * i <= num) {
//            if (i * i == num) {// If square of i equals num, it's a perfect square
//                isPerfectSquare = true;
//                break;
//            }
//            i++;
//        }
//        // Check if the number is a perfect square
//        if (isPerfectSquare) System.out.println("Yes");
//        else System.out.println("No");


//     qus8  Abundant Number ( Sum = 1 + 2 + 3 + 4 + 6 = 16 (> 12) ✅ Abundant )
//        int n = sc.nextInt();
//        int sum = 0;
//        int i = 1;
//
//        while (i <= n/2){
//            if(num % i == 0){
//                sum += i;
//            }
//            i++;
//        }
//        if (sum > num) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

//        qus 9 Check if a Number is a Neon Number ( 9 ^ 2 = 81, 8+1 = 9 if we got that will we neon number)
//        int n = sc.nextInt();
//        int sq = n * n;
//        int sum = 0;
//
//        while(sq > 0){
//            int digit = sq % 10;
//            sum += digit;
//            sq /= 10;
//        }
//
//        if(sum == n){
//            System.out.print("Yes");
//        }else{
//            System.out.print("No");
//        }


//        qus 10  Validate ISBN Number ( if digit is 10 then isbn number if digit is < 10 then not isbn)
//        long n = sc.nextLong();
//        long origNumber = n;
//        long c=0;
//
//        while (n!=0){
//            c++;
//            n /= 10;
//        }
//        if (c!=10) System.out.println(false);
//        else{
//            long sum =0;
//            while (origNumber>0){
//                sum += (origNumber%10) * c--;
//                origNumber/=10;
//            }
//            if (sum%11==0) System.out.println(true);
//            else System.out.println(false);
//        }


//        qus 11. Write a Java program that calculates the area of a circle, rectangle, or triangle based on user input using a switch statement. The program should ask the user to choose the shape and provide the required inputs accordingly.
//        Scanner sc = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println( "enter your choice");
//            choice = sc.nextInt();
//
//            switch (choice){
//                case 1 -> {
//                    System.out.println("radius");
//                    double r = sc.nextDouble();
//                    System.out.println("area " + (Math.PI * r * r));
//                }
//                case 2 -> {
//                    System.out.println("Length :");
//                    double l = sc.nextDouble();
//                    System.out.println("Width :");
//                    double w = sc.nextDouble();
//                    System.out.println("area " + (l * w));
//                }
//                case 3 -> {
//                    System.out.println("Base:");
//                    double b = sc.nextDouble();
//                    System.out.println("Height :");
//                    double h = sc.nextDouble();
//                    System.out.println("Area: " + (0.5 * b * h));
//                }
//                case 4 -> System.out.println("Exiting...");
//                default -> System.out.println("Invalid choice!");
//
//            }
//            System.out.println();
//        }while (choice != 4);


//        qus 12 day question
//                Scanner sc = new Scanner(System.in);
//                int dayNumber;
//                do {
//
//                    dayNumber = sc.nextInt();
//
//                    switch (dayNumber) {
//                        case 1:
//                            System.out.println("Monday");
//                            break;
//                        case 2:
//                            System.out.println("Tuesday");
//                            break;
//                        case 3:
//                            System.out.println("Wednesday");
//                            break;
//                        case 4:
//                            System.out.println("Thursday");
//                            break;
//                        case 5:
//                            System.out.println("Friday");
//                            break;
//                        case 6:
//                            System.out.println("Saturday");
//                            break;
//                        case 7:
//                            System.out.println("Sunday");
//                            break;
//                        case 0:
//                            System.out.println("Exiting program...");
//                            break;
//                        default:
//                            System.out.println("Invalid day");
//                    }
//                } while (dayNumber != 0);

//qus 13   check vowel and consonant
//        Scanner sc = new Scanner(System.in);
//
//        // Read a single character input from the user
//        char ch = sc.next().charAt(0);
//
//        // Convert the character to lowercase to handle both uppercase and lowercase inputs
//        ch = Character.toLowerCase(ch);
//
//        // Initialize a variable to hold the result
//        String result;
//
//        // Use a switch statement to determine if the character is a vowel or consonant
//        switch (ch) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                result = "Vowel";  // Case for vowels
//                break;
//            default:
//                result = Character.isLetter(ch) ? "Consonant" : "Not a letter";
//                break;
//        }
//
//        // Print the result
//        System.out.println(result);



    };
};
