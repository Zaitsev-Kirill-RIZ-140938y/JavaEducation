package lr3.Timus.task_1197;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества тестов
        System.out.print("Введите количество тестов: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Считываем оставшуюся часть строки

        // Массив с направлениями хода коня
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        System.out.println("Введите позиции коня в формате (например, a1):");
        for (int i = 0; i < n; i++) {
            String position = scanner.nextLine();
            char column = position.charAt(0); // Буква (колонка)
            char row = position.charAt(1);    // Цифра (строка)

            // Конвертация в числовые координаты
            int x = column - 'a' + 1; // Номер колонки (1-8)
            int y = row - '0';        // Номер строки (1-8)

            int count = 0; // Счётчик доступных ходов

            // Проверяем все возможные ходы коня
            for (int j = 0; j < 8; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];
                if (nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8) {
                    count++;
                }
            }

            // Вывод результата для текущего теста
            System.out.println("Клетки под боем: " + count);
        }
    }
}