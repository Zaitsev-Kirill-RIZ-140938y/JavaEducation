package lr4;

public class Example3 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 10;
        int[][] rectangle = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rectangle[i][j] = 2;
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}