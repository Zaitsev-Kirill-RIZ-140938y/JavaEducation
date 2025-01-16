package lr4.Timus.task_1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите значения N и M через пробел: ");
        int n = scanner.nextInt(); // Количество элементов массива
        int m = scanner.nextInt(); // Максимальное значение элемента

        // Вычисление общего количества строк
        int totalLines = n * (m + 1);

        // Вывод результата
        System.out.println("Количество секунд, необходимых Петечкину: " + totalLines);
    }
}
