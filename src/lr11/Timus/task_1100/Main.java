package lr11.Timus.task_1100;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество команд: ");
        int n = scanner.nextInt();

        // Сохраняем команды с их входным порядком
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите ID и количество решённых задач для команды #" + (i + 1) + ": ");
            int id = scanner.nextInt();
            int solved = scanner.nextInt();
            teams.add(new Team(id, solved, i));
        }

        // Сортировка: сначала по убыванию числа задач, потом по входному порядку
        teams.sort((a, b) -> {
            if (b.solved != a.solved) return b.solved - a.solved;
            return a.inputOrder - b.inputOrder;
        });

        for (Team t : teams) {
            System.out.println(t.id + " " + t.solved);
        }
    }

    static class Team {
        int id, solved, inputOrder;
        Team(int id, int solved, int inputOrder) {
            this.id = id;
            this.solved = solved;
            this.inputOrder = inputOrder;
        }
    }
}
