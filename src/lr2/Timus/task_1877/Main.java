package lr2.Timus.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Подсказка для ввода кодов замков
        System.out.println("Введите код первого замка (4 цифры):");
        String lock1 = scanner.next();

        System.out.println("Введите код второго замка (4 цифры):");
        String lock2 = scanner.next();

        // Проверка на совпадение
        if (lock1.equals("0000") && lock2.equals("0000")) {
            // Если вор мог открыть оба замка
            System.out.println("yes");
        } else {
            // Если вор не смог открыть оба замка
            System.out.println("no");
        }

        scanner.close();
    }
}