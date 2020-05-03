package sorts;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));

        quick(TestSortData.DISORDER_ARRAY, 0, TestSortData.DISORDER_ARRAY.length - 1);

        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));

    }


    /**
     * 快速排序，递归
     * @param array
     * @param begin
     * @param end
     */
    public static void quick(int[] array, int begin, int end) {

        if (begin >= end) {
            return;
        }

        int beginRange = begin;
        int endRange = end;

        int compareInt = array[begin];

        begin++;

        while (begin < end) {

            if (array[end] > compareInt) {
                end--;
                continue;
            }

            if (array[begin] < compareInt) {
                begin++;
                continue;
            }


            int tmp = array[begin];
            array[begin] = array[end];
            array[end] = tmp;

        }

        if (array[beginRange] > array[begin]) {

            int tmp = array[begin];
            array[begin] = array[beginRange];
            array[beginRange] = tmp;

        }

        quick(array, beginRange, begin - 1);
        quick(array, end + 1, endRange);

        return;


    }


}