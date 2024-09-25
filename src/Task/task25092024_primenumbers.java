package Task;
//Prime Number from 1 to 100. (for loop)
public class task25092024_primenumbers {
   public static void main(String[] args) {
       int num=2;
       System.out.println("Prime numbers between 1 and 100 are:");

       for (num=2; num <= 100; num++) {
           boolean isPrime = true;

           for (int i = 2; i <= num / 2; i++) {
               if (num % i == 0) {
                   isPrime = false;
                   break;
               }
           }
           if (isPrime) {
               System.out.print(num + " ");
//       int limit = 100;

//        // Loop through each number from 2 to 100
//        for (int num = 2; num <= limit; num++) {
//            boolean isPrime = true;
//
//            // Check if num is divisible by any number between 2 and num-1
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
////                    break;  // No need to check further if it's already not prime
//                }
//            }
//
//            // If the number is prime, print it
//            if (isPrime) {
//                System.out.println(num);
//            }

    }
}}}
