package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Введите число (не менее 1000):");
            number = scanner.nextInt();

            if (number < 1000) {
                System.out.println("Ошибка: число должно быть не меньше 1000. Попробуйте снова.");
            }
        } while (number < 1000);

        // Преобразуем число в строку
        String numberAsString = String.valueOf(number);

        // Количество тысяч во введенном числе
        int thousandsTotal = number / 1000;

        // Четвертая цифра справа
        char thousandsFourthChar = numberAsString.charAt(numberAsString.length() - 4);

        // Вывод результата
        System.out.println("Всего тысяч во введенном числе: " + thousandsTotal);
        System.out.println("Четвертая цифра справа в десятичном представлении числа: " + thousandsFourthChar);

        scanner.close();
    }
}
