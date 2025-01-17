package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("Число находится в диапазоне от 5 до 10 включительно.");
        } else {
            System.out.println("Число не находится в диапазоне от 5 до 10 включительно.");
        }

        scanner.close();
    }
}