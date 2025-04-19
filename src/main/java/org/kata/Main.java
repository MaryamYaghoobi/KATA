package org.kata;

import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumberIdentifier checker = new PrimeNumberIdentifier();

        while (true) {
            System.out.print("لطفاً یک عدد وارد کنید : ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (checker.isPrime(number)) {
                    System.out.println(number + " یک عدد اول است.");
                } else {
                    System.out.println(number + " عدد اول نیست.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ورودی نامعتبر! لطفاً یک عدد صحیح وارد کنید.");
            }

            System.out.println(); // خط خالی برای جداسازی
        }

    }
}