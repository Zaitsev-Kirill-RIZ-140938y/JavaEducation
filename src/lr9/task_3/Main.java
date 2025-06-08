package lr9.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        inputArray(array, 0, scanner);

        System.out.println("Вывод массива:");
        outputArray(array, 0);
        System.out.println();
    }

    // Рекурсивный ввод
    public static void inputArray(int[] array, int index, Scanner scanner) {
        if (index < array.length) {
            array[index] = scanner.nextInt();
            inputArray(array, index + 1, scanner);
        }
    }

    // Рекурсивный вывод
    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            outputArray(array, index + 1);
        }
    }
}