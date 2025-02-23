package lr7.Timus.task_1639;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размеры шоколадки m и n через пробел:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Общее число ходов = m * n - 1.
        // Если m*n четное, то число ходов нечётное, и выигрывает первый игрок (Карлсон).
        if ((m * n) % 2 == 0) {
            System.out.println("[:=[first]");
        } else {
            System.out.println("[second]=:]");
        }
    }
}