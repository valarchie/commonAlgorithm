package arrays;

import java.util.Arrays;

/**
 * description: 找到数组的中位数
 *
 * @author: valarchie
 * on: 2020/4/29
 * @email: 343928303@qq.com
 */
public class FindMiddleNumber {

    /**
     * 中位数为11
     */
    public final static int[] TEST_INTS_1 = new int[]{14, 15, 1, 2, 5, 10, 11, 18, 19, 12, 13, 16, 3, 4, 6, 7, 8, 9,
            17};

    /**
     * 中位数为10或者11
     */
    public final static int[] TEST_INTS_2 = new int[]{8, 9, 10, 20, 21, 11, 14, 15, 16, 1, 2, 3, 12, 13, 4, 5, 6, 7
            , 17, 18, 19};


    public static void main(String[] args) {


        int middleNumber = findMiddleNumber(TEST_INTS_1, 0, TEST_INTS_1.length - 1);

        System.out.println(Arrays.toString(TEST_INTS_1));
        System.out.println(middleNumber);


    }


    /**
     * 使用快排的思想，但是只往中间位置进行排序，当最后的排序下标抵达数组中间位置的时，就是中位数
     * @param array
     * @param begin
     * @param end
     */
    public static int findMiddleNumber(int[] array, int begin, int end) {

        int beginRange = begin;
        int endRange = end;

        if (begin >= end) {
            return begin;
        }

        // 选择begin位置的数字作为分界点
        int splitNumber = array[begin];

        while (begin + 1 < end) {

            if (array[begin + 1] < splitNumber) {
                begin++;
                continue;
            }

            if (array[end] > splitNumber) {
                end--;
                continue;
            }

            int tmp = array[begin + 1];
            array[begin + 1] = array[end];
            array[end] = tmp;

        }

        int tmp = array[beginRange];
        array[beginRange] = array[begin];
        array[begin] = tmp;

        if (begin > array.length / 2) {

            return findMiddleNumber(array, beginRange, begin);

        } else {
            return findMiddleNumber(array, end, endRange);

        }

    }


}