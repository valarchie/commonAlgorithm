package leetcode;

import java.util.ArrayList;
import java.util.List;

public class No54SpiralMatrix {


    public static void main(String[] args) {

        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = new int[][]{{1, 2}};
        int[][] matrix3 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix4 = new int[][]{{1}, {2}};
        int[][] matrix5 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] matrix6 = new int[][]{{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}};
        int[][] matrix7 = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}};

        System.out.println(spiral(matrix1));
        System.out.println(spiral(matrix2));
        System.out.println(spiral(matrix3));
        System.out.println(spiral(matrix4));
        System.out.println(spiral(matrix5));
        System.out.println(spiral(matrix6));
        System.out.println(spiral(matrix7));


    }

    public static List spiral(int[][] matrix) {
        List list = new ArrayList();

        if (matrix.length <= 0) {
            return list;
        }
        printMatrix(matrix, list);
        return list;
    }


    public static void printMatrix(int[][] matrix, List<Integer> list) {

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            if (++top > bottom) break;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            if (--right < left) break;

            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            if (--bottom < top) break;

            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            if (++left > right) break;

        }

    }


}