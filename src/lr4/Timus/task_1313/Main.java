package lr4.Timus.task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера матрицы
        System.out.print("Введите размер N: ");
        int n = scanner.nextInt();

        // Ввод матрицы
        int[][] matrix = new int[n][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Вывод пикселей по диагоналям
        System.out.println("Результат:");
        for (int diag = 0; diag < 2 * n - 1; diag++) {
            if (diag % 2 == 0) { // Чётная диагональ
                for (int i = 0; i < n; i++) {
                    int j = diag - i;
                    if (j >= 0 && j < n) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            } else { // Нечётная диагональ
                for (int i = n - 1; i >= 0; i--) {
                    int j = diag - i;
                    if (j >= 0 && j < n) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
        }
    }
}