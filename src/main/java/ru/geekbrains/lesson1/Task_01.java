package ru.geekbrains.lesson1;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please,enter you N number: ");
        int N = scanner.nextInt();
         int res = showTotalAmount(N);
        System.out.printf("Sum from 1 to your number: %d\n",res);
    }
    public static int showTotalAmount(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            result = result + i;
         ;
        }
        return result;
    }
}
