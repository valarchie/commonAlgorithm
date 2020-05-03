package sorts;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * description: 冒泡排序
 *
 * @author: valarchie
 * on: 2020/5/3
 * @email: 343928303@qq.com
 */
public class BubbleSort {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));

        bubble(TestSortData.DISORDER_ARRAY);

        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));

    }


    /**
     * 依次两两比较数组内的元素，较大的元素往后移动
     *
     * @param array
     */
    public static void bubble(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j + 1 < array.length - i; j++) {

                if (array[j] > array[j + 1]) {

                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }

            }

        }

    }


}