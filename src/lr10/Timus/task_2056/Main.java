package lr10.Timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество экзаменов: ");
        int n = scanner.nextInt();

        int sum = 0;
        boolean hasThree = false;
        boolean allFives = true;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите оценку за экзамен #" + (i + 1) + ": ");
            int grade = scanner.nextInt();
            sum += grade;
            if (grade == 3) hasThree = true;
            if (grade != 5) allFives = false;
        }

        if (hasThree) {
            System.out.println("None");
        } else if (allFives) {
            System.out.println("Named");
        } else {
            double avg = sum * 1.0 / n;
            if (avg >= 4.5) {
                System.out.println("High");
            } else {
                System.out.println("Common");
            }
        }
    }
}
