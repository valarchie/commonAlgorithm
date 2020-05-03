package sorts;


import java.util.Arrays;

/**
* description: 插入排序
* @author: valarchie
* on: 2020/5/3
* @email: 343928303@qq.com
*/
public class InsertSort {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));

        insertSort(TestSortData.DISORDER_ARRAY);

        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));


    }


    /**
     * 插入排序
     * @param array
     */
    public static void insertSort(int[] array) {

        if (array.length == 0) {
            return;
        }


        for (int i = 0; i < array.length; i++) {

            int min = array[i];
            int minIndex = i;


            for (int j = i; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }

            }


            int tmp = array[i];
            array[i] = min;
            array[minIndex] = tmp;

        }


    }


}