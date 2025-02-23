package lr7.Timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = sc.nextInt();

        // Определяем границы: если n меньше 1, суммируем от n до 1, иначе от 1 до n
        int low = Math.min(1, n);
        int high = Math.max(1, n);

        // Вычисляем количество чисел в промежутке [low, high]
        int count = high - low + 1;
        // Сумма арифметической прогрессии: count * (первый элемент + последний элемент) / 2
        long sum = (long) count * (low + high) / 2;

        System.out.println(sum);
    }
}