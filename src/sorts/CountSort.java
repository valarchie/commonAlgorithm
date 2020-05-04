package sorts;

import java.util.Arrays;

public class CountSort {


    public static void main(String[] args) {


        countSort(TestSortData.DISORDER_ARRAY);
        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));


    }


    public static int[] countSort(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //找出数组中的最大最小值
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }

        int help[] = new int[max];

        //找出每个数字出现的次数
        for (int i = 0; i < array.length; i++) {
            int mapPos = array[i] - min;
            help[mapPos]++;
        }

        int index = 0;
        for (int i = 0; i < help.length; i++) {
            while (help[i]-- > 0) {
                array[index++] = i + min;
            }
        }

        return array;
    }


}