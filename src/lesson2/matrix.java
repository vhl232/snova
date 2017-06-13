package lesson2;

/**
 * Created by voca on 23.04.17.
 */
public class matrix {
    public static void main(String[] args) {
        byte[][] matrix;
        matrix = new byte[][]{
                {1, 2, 3},
                {12, 15, 17},
                {0, 0, -10}
        };
        System.out.println(matrix[0][2]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }
}

