package lr9.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();

        System.out.print("Двоичное представление: ");
        toBinary(n);
        System.out.println();
    }

    public static void toBinary(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            toBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}