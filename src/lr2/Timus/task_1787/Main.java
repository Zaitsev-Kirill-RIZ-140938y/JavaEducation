package lr2.Timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество машин, успевающих повернуть за минуту (k), и количество минут наблюдения (n):");
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println("Введите " + n + " чисел, обозначающих количество машин, подъехавших в каждую минуту:");
        int[] cars = new int[n];
        for (int i = 0; i < n; i++) {
            cars[i] = scanner.nextInt();
        }

        int currentTraffic = 0;

        for (int i = 0; i < n; i++) {
            currentTraffic += cars[i];
            currentTraffic -= k;
            if (currentTraffic < 0) {
                currentTraffic = 0;
            }
        }

        System.out.println("Количество машин в пробке через " + n + " минут(ы): " + currentTraffic);
    }
}