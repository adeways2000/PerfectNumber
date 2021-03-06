/*
 * A simple For Loop to determine whether a number was a Perfect Number. A Perfect Number is a number that is equal to its divisors
 * ex. 6 is a perfect number because mod 1, 2 and 3 equals 6 and 1+2+3 = 6.
 */

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number == 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }

    }
}