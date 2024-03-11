package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     * @param n the number of prime numbers to multiply
     * @return the product of the first n prime numbers
     */
    public static long getPrimeProduct(int n) {
        int count = 0;
        long product = 1;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                product *= number;
                count++;
            }
            number++;
        }
        return product;
    }

    /**
     * This method checks whether a number is prime or not
     * @param number the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(10));
        int m = readfromConsoleInt();
        int n = readfromConsoleInt();
        System.out.println("The product of prime numbers between " + m + " and " + n + " is: " + getPrimeProduct(n - m + 1));
    }

}
