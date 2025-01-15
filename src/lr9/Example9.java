package lr9;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца:");
        String month = scanner.nextLine();

        System.out.println("Введите количество дней в этом месяце:");
        int days = scanner.nextInt();

        switch (days) {
            case 31:
                System.out.println(month + " содержит 31 день.");
                break;
            case 30:
                System.out.println(month + " содержит 30 дней.");
                break;
            case 28:
                System.out.println(month + " содержит 28 дней.");
                break;
            default:
                System.out.println(month + " содержит необычное количество дней.");
                break;
        }

        scanner.close();
    }
}