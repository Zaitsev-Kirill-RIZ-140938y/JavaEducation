package lr9.Timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = scanner.nextInt();
        int[][] a = new int[N][N];
        int num = 1;

        // 1. Диагонали, начинающиеся в верхней строке (идем справа налево)
        for (int col = N - 1; col >= 0; col--) {
            int i = 0, j = col;
            while (i < N && j < N) {
                a[i][j] = num++;
                i++;
                j++;
            }
        }
        // 2. Диагонали, начинающиеся в левом столбце (идем сверху вниз, кроме [0][0])
        for (int row = 1; row < N; row++) {
            int i = row, j = 0;
            while (i < N && j < N) {
                a[i][j] = num++;
                i++;
                j++;
            }
        }

        // Вывод
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j]);
                if (j < N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}