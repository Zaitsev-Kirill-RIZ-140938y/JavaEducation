package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите номер дня в месяце: ");
        int date = scanner.nextInt();

        String monthInGenitive = getMonthInGenitive(month);

        if (monthInGenitive == null) {
            System.out.println("Некорректное название месяца.");
        } else {
            System.out.printf("Сегодня: %s %d %s%n", dayOfWeek, date, monthInGenitive);
        }

        scanner.close();
    }

    private static String getMonthInGenitive(String month) {
        String[] months = {
                "январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };
        String[] monthsGenitive = {
                "января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря"
        };

        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(month)) {
                return monthsGenitive[i];
            }
        }
        return null; // Если месяц не найден
    }
}
