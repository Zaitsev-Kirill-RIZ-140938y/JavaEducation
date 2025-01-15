package lr1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Формат для ввода даты и времени
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy H:mm");

        try {
            // Ввод текущей даты и времени
            System.out.println("Введите текущую дату и время в формате ДД.ММ.ГГГГ ЧЧ:ММ (например, 15.01.2025 14:30):");
            String currentDateTimeInput = scanner.nextLine();
            LocalDateTime currentDateTime = LocalDateTime.parse(currentDateTimeInput, dateTimeFormatter);

            // Ввод даты и времени рождения
            System.out.println("Введите вашу дату и приблизительное время рождения в формате ДД.ММ.ГГГГ ЧЧ:ММ (например, 20.05.1990 08:00):");
            String birthDateTimeInput = scanner.nextLine();
            LocalDateTime birthDateTime = LocalDateTime.parse(birthDateTimeInput, dateTimeFormatter);

            // Проверка валидности дат
            if (birthDateTime.isAfter(currentDateTime)) {
                System.out.println("Дата рождения не может быть позже текущей даты.");
            } else {
                // Расчёт возраста
                int age = currentDateTime.getYear() - birthDateTime.getYear();
                if (currentDateTime.getMonthValue() < birthDateTime.getMonthValue() ||
                        (currentDateTime.getMonthValue() == birthDateTime.getMonthValue() && currentDateTime.getDayOfMonth() < birthDateTime.getDayOfMonth())) {
                    age--;
                }

                String ageWord = getAgeWord(age);
                System.out.printf("Ваш возраст: %d %s.%n", age, ageWord);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат ввода. Убедитесь, что вы вводите дату и время в формате ДД.ММ.ГГГГ ЧЧ:ММ.");
        }

        scanner.close();
    }

    private static String getAgeWord(int age) {
        int lastDigit = age % 10;
        int lastTwoDigits = age % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "лет";
        }
        switch (lastDigit) {
            case 1:
                return "год";
            case 2:
            case 3:
            case 4:
                return "года";
            default:
                return "лет";
        }
    }
}