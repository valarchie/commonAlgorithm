package arrays;

public class RollMatrix {

    public static final int[][] MATRIX_1 = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

    public static final int[][] MATRIX_2 = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

    public static final int[][] MATRIX_3 = new int[][]{
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}};


    public static void main(String[] args) {

        roll3StepMatrix(MATRIX_3, 0);
//        System.out.println(Arrays.toString(MATRIX_1));

        printMatrix(MATRIX_3);


    }


    public static void printMatrix(int[][] matrix) {

        for (int[] ints : matrix) {

            for (int anInt : ints) {

                System.out.print(anInt + ",");

            }
            System.out.println("");

        }

    }


    public static void roll3StepMatrix(int[][] matrix, int circle) {

        if (matrix.length - circle * 2 <= 0) {
            return;
        }

        int bound = matrix.length - circle - 1;

        for (int i = circle; i < matrix.length - 1 - circle; i++) {

//            System.out.println(matrix[circle][i]);
//            System.out.println(matrix[i][bound]);
//            System.out.println(matrix[bound][bound - i + circle]);
//            System.out.println(matrix[bound - i + circle][circle]);

            int a = matrix[circle][i];
            int b = matrix[i][bound];
            int c = matrix[bound][bound - i + circle];
            int d = matrix[bound - i + circle][circle];

            matrix[circle][i] = d;
            matrix[i][bound] = a;
            matrix[bound][bound - i + circle] = b;
            matrix[bound - i + circle][circle] = c;

        }

        roll3StepMatrix(matrix, circle + 1);

    }


    public static void rollMatrix(int[][] matrix, int diameter) {

//        for (int i = matrix.length - diameter; i < diameter; i++) {
//
//           int a = matrix[][i];
//           int b = matrix[i][i];
//
//        }


    }


}