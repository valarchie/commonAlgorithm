package arrays;

import java.util.Arrays;

/**
* description: 获取数组的前K个最大的数字
* @author: valarchie
* on: 2020/4/28
* @email: 343928303@qq.com
*/
public class FindKMaxNumbers {

    public static final int[] TEST_INTS_1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
            48, 49, 50, 51, 52, 53, 54, 55, 56, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
            76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

    public static final int[] TEST_INTS_2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
            48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71,};

    public static final int[] TEST_INTS_3 = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, };


    public static void main(String[] args) {


        int[] kMaxInts = findKMaxInts(5, TEST_INTS_1);

        System.out.println(Arrays.toString(kMaxInts));


    }


    /**
     * 获取数组前K个最大的数字
     * @param K
     * @param ints
     * @return
     */
    public static int[] findKMaxInts(int K, int[] ints) {

        int[] kInts = new int[K];

        for (int i = 0; i < ints.length; i++) {
            // 如果大于kInts 数组中的最后一个数字的话，直接插入
            if (ints[i] > kInts[K - 1]) {
                kInts[K - 1] = ints[i];
            }
            // 再进行冒泡
            bulb(kInts);
        }


        return kInts;
    }


    /**
     * 进行冒泡
     * @param ints
     */
    public static void bulb(int[] ints) {

        for (int i = ints.length-1; i >= 1; i--) {

            // 进行冒泡
            if (ints[i] > ints[i - 1]) {

                int tmp = ints[i];
                ints[i] = ints[i - 1];
                ints[i-1]=tmp;

            }

        }


    }








}