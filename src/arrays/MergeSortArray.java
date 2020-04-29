package arrays;

import java.util.Arrays;

/**
 * description: 合并两个有序的数组
 *
 * @author: valarchie
 * on: 2020/4/29
 * @email: 343928303@qq.com
 */
public class MergeSortArray {

    public final static int[] TEST_INTS_1 = new int[]{1, 2, 5, 6};
    public final static int[] TEST_INTS_2 = new int[]{3, 4, 7, 8, 9};


    public static void main(String[] args) {

        int[] mergeSortArray = mergeSortArray(TEST_INTS_2, TEST_INTS_1);

        System.out.println(Arrays.toString(mergeSortArray));

    }


    /**
     * 依次对比两个数组的数字，小的填入新数组，下标右移
     * @param arrayA
     * @param arrayB
     * @return
     */
    public static int[] mergeSortArray(int[] arrayA, int[] arrayB) {


        int[] sortArray = new int[arrayA.length + arrayB.length];

        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < sortArray.length && aIndex <= arrayA.length && bIndex <= arrayB.length; i++) {

            if (aIndex == arrayA.length) {
                sortArray[i] = arrayB[bIndex++];
                continue;
            }

            if (bIndex == arrayB.length) {
                sortArray[i] = arrayA[aIndex++];
                continue;
            }

            if (arrayA[aIndex] < arrayB[bIndex]) {

                sortArray[i] = arrayA[aIndex];
                aIndex++;

            } else {

                sortArray[i] = arrayB[bIndex];
                bIndex++;

            }

        }

        return sortArray;

    }


}