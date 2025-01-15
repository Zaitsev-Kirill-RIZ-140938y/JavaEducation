package lr11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Формат для ввода дат
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            // Ввод имени
            System.out.println("Введите ваше имя:");
            String name = scanner.nextLine();

            // Ввод даты рождения
            System.out.println("Введите вашу дату рождения в формате ДД.ММ.ГГГГ (например, 15.08.2000):");
            String birthDateInput = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(birthDateInput, dateFormatter);

            // Получение текущей даты
            LocalDate currentDate = LocalDate.now();

            // Проверка валидности даты рождения
            if (birthDate.isAfter(currentDate)) {
                System.out.println("Дата рождения не может быть позже текущей даты.");
            } else {
                // Расчёт возраста
                int age = currentDate.getYear() - birthDate.getYear();
                if (currentDate.getMonthValue() < birthDate.getMonthValue() ||
                        (currentDate.getMonthValue() == birthDate.getMonthValue() && currentDate.getDayOfMonth() < birthDate.getDayOfMonth())) {
                    age--;
                }

                // Определение корректного склонения для возраста
                String ageWord = getAgeWord(age);

                // Вывод результата
                System.out.printf("%s, ваш возраст: %d %s.%n", name, age, ageWord);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты. Пожалуйста, используйте формат ДД.ММ.ГГГГ.");
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