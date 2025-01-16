package lr6;

import java.util.Arrays;

public class Example10 {
    public static class ClassExample10 {
        // Статический метод для поиска наибольшего и наименьшего значений среди аргументов
        public static int[] findMinMax(int... numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Ошибка: должен быть передан хотя бы один аргумент.");
            }

            int[] minMaxArray = new int[2];
            minMaxArray[0] = Arrays.stream(numbers).max().getAsInt(); // Наибольшее значение
            minMaxArray[1] = Arrays.stream(numbers).min().getAsInt(); // Наименьшее значение

            return minMaxArray;
        }
    }

    public static void main(String[] args) {
        // Вызов метода с произвольными числами
        int[] minMaxValues = ClassExample10.findMinMax(7, 3, 1, 5, 9, -2, 8);
        System.out.println("Наибольшее и наименьшее значения: " + Arrays.toString(minMaxValues));
    }
}