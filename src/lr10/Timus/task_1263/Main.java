package lr10.Timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество кандидатов и избирателей через пробел: ");
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] votes = new int[N];

        for (int i = 0; i < M; i++) {
            System.out.print("Введите номер кандидата, за которого проголосовал избиратель #" + (i + 1) + ": ");
            int vote = scanner.nextInt();
            votes[vote - 1]++;
        }

        for (int i = 0; i < N; i++) {
            double percent = (votes[i] * 100.0) / M;
            System.out.printf("%.2f%%%n", percent);
        }
    }
}