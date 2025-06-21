package lr13.Timus.task_1012;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа подсчёта N-значных чисел в системе счисления с основанием K");
        System.out.println("без двух нулей подряд. Введите сначала N (длина числа), затем K (основание):");

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger K = BigInteger.valueOf(sc.nextInt());

        System.out.println("\nВычисление количества " + N + "-значных чисел в " +
                K + "-ичной системе без двух нулей подряд...");

        BigInteger M = K.subtract(BigInteger.ONE);
        BigInteger D = BigInteger.ZERO;

        for (int i = 1; i < N; i++) {
            BigInteger T = M;
            M = M.multiply(K).subtract(D);
            D = T.subtract(D);
        }

        System.out.println("\nРезультат:");
        System.out.println("Количество допустимых чисел: " + M);

        sc.close();
    }
}