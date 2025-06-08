package lr9.task_1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("Результат: " + fact(5, 0));
    }

    public static int fact(int n, int level) {
        // Формируем отступы для наглядности
        String indent = "  ".repeat(level);

        System.out.println(indent + "Вход: fact(" + n + ")");

        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            // Показываем, что будет два рекурсивных вызова
            System.out.println(indent + "-> Ветвление: " + n + " * fact(" + (n - 2) + ") + fact(" + (n - 1) + ")");
            result = n * fact(n - 2, level + 1) + fact(n - 1, level + 1);
        }

        System.out.println(indent + "Выход: fact(" + n + ") = " + result);
        return result;
    }
}

