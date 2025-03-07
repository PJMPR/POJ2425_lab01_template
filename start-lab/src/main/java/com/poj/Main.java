package com.poj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Zadanie 1.1 - Sprawdzenie, czy liczba jest doskonała
         **/
//        System.out.println("Zadanie 1.1 - Sprawdzenie, czy liczba jest doskonała");
//        System.out.print("Podaj liczbę: ");
//        int number = scanner.nextInt();
//        System.out.println("Czy liczba doskonała? " + isPerfectNumber(number));

        /**
         * Zadanie 1.2 - Kalkulator
         **/
//        System.out.println("\nZadanie 1.2 - Kalkulator");
//        System.out.print("Podaj pierwszą liczbę: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Podaj drugą liczbę: ");
//        double num2 = scanner.nextDouble();
//        System.out.print("Podaj operację (+, -, *, /): ");
//        char operation = scanner.next().charAt(0);
//        System.out.println("Wynik: " + calculator(num1, num2, operation));

        /**
         * Zadanie 2.1 - Liczby pierwsze w zakresie
         **/
//        System.out.println("\nZadanie 2.1 - Liczby pierwsze w zakresie");
//        System.out.print("Podaj początek zakresu: ");
//        int start = scanner.nextInt();
//        System.out.print("Podaj koniec zakresu: ");
//        int end = scanner.nextInt();
//        printPrimeNumbers(start, end);

        /**
         * Zadanie 2.2 - Odwracanie liczby
         **/
//        System.out.println("\nZadanie 2.2 - Odwracanie liczby");
//        System.out.print("Podaj liczbę: ");
//        int reverseNumber = scanner.nextInt();
//        System.out.println("Odwrócona liczba: " + reverseNumber(reverseNumber));

        /**
         * Zadanie 3.1 - Suma liczb w tablicy
         **/
//        System.out.println("\nZadanie 3.1 - Suma liczb w tablicy");
//        System.out.print("Podaj liczbę elementów tablicy: ");
//        int n = scanner.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Podaj liczbę: ");
//            numbers[i] = scanner.nextInt();
//        }
//        System.out.println("Suma elementów: " + sumArray(numbers));

        /**
         * Zadanie 3.2 - Najczęściej występujący znak w Stringu
         **/
//        System.out.println("\nZadanie 3.2 - Najczęściej występujący znak w Stringu");
//        System.out.print("Podaj tekst: ");
//        scanner.nextLine();
//        String inputText = scanner.nextLine();
//        System.out.println("Najczęściej występujący znak: " + mostFrequentCharacter(inputText));

        /**
         * Zadanie 4.1 - Silnia
         **/
//        System.out.println("\nZadanie 4.1 - Silnia");
//        System.out.print("Podaj liczbę: ");
//        int factorialNum = scanner.nextInt();
//        System.out.println("Silnia: " + factorial(factorialNum));


        /**
         *  Zadanie 4.2 - Koty Ali
         **/
//        System.out.println("\nZadanie 4.2 - koty Ali");
//        System.out.print("Podaj ilosc kotów: ");
//        int kitties = scanner.nextInt();
//        System.out.println(cats(kitties));
    }

    public static boolean isPerfectNumber(int num) {
        return false;
    }

    public static double calculator(double a, double b, char op) {
        return -1;
    }

    public static void printPrimeNumbers(int start, int end) {

    }

    public static boolean isPrime(int num) {

        return false;
    }

    public static int reverseNumber(int num) {
        return 0;
    }

    public static int sumArray(int[] arr) {
        return 0;
    }

    public static char mostFrequentCharacter(String str) {

        return ' ';
    }

    public static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    public static String cats(int n) {
        return null;
    }
}
