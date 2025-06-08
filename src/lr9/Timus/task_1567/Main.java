package lr9.Timus.task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите рекламную речёвку: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int[] keyCost = new int[256]; // Таблица стоимости нажатий

        // Заполняем по таблице из условия (строчные буквы!)
        // 1
        keyCost['a'] = 1; keyCost['b'] = 2; keyCost['c'] = 3;
        // 2
        keyCost['d'] = 1; keyCost['e'] = 2; keyCost['f'] = 3;
        // 3
        keyCost['g'] = 1; keyCost['h'] = 2; keyCost['i'] = 3;
        // 4
        keyCost['j'] = 1; keyCost['k'] = 2; keyCost['l'] = 3;
        // 5
        keyCost['m'] = 1; keyCost['n'] = 2; keyCost['o'] = 3;
        // 6
        keyCost['p'] = 1; keyCost['q'] = 2; keyCost['r'] = 3;
        // 7
        keyCost['s'] = 1; keyCost['t'] = 2; keyCost['u'] = 3;
        // 8
        keyCost['v'] = 1; keyCost['w'] = 2; keyCost['x'] = 3;
        // 9
        keyCost['y'] = 1; keyCost['z'] = 2;
        // 0
        keyCost['_'] = 1; // пробел
        keyCost[','] = 2;
        keyCost['.'] = 3;
        keyCost['!'] = 4;

        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            sum += keyCost[ch];
        }
        System.out.println(sum);
    }
}