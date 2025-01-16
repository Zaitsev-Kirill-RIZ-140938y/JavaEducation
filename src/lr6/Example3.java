package lr6;

public class Example3 {
    public static class ClassExample3 {
        // Статический метод для вычисления наибольшего значения из произвольного количества аргументов или массива
        public static int calculateMaxValueFromSet(int... numbers) {
            int max = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        // Нахождение максимального значения среди произвольных аргументов
        int maxFromArguments = ClassExample3.calculateMaxValueFromSet(0, 9, 3, 2, 1, 4, 1, 9, 0);
        System.out.println("Максимальное значение (аргументы) = " + maxFromArguments);

        // Нахождение максимального значения в массиве
        int[] numbersArray = {1, 9, 0, 3, 2, 0, 9, 1, 0};
        int maxFromArray = ClassExample3.calculateMaxValueFromSet(numbersArray);
        System.out.println("Максимальное значение (массив) = " + maxFromArray);
    }
}