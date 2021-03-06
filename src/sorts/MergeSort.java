package sorts;

import java.util.Arrays;

/**
 * description: 归并排序
 *
 * @author: valarchie
 * on: 2020/5/3
 * @email: 343928303@qq.com
 */
public class MergeSort {

    public static void main(String[] args) {

        sort(TestSortData.DISORDER_ARRAY, 0, TestSortData.DISORDER_ARRAY.length - 1);

        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));

    }


    /**
     * 归并排序，先排序小的数组，再两两合成大的数组
     * @param array
     * @param left
     * @param right
     */
    public static void sort(int[] array, int left, int right) {

        //1.设置递归的base case
        if (left == right) {
            return;
        }
        //2.分别排两边
        int mid = left + (right - left) / 2;
        sort(array, left, mid);
        sort(array, mid + 1, right);
        //3.合并
        merge(array, left, mid + 1, right);

    }

    public static void merge(int[] array, int leftPtr, int rightPtr, int rightBound) {

        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];

        int i = leftPtr, j = rightPtr, k = 0;
        while (i <= mid && j <= rightBound) {
            temp[k++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= rightBound) {
            temp[k++] = array[j++];
        }

        //不要忘了把temp数组复制到arr中
        for (int m = 0; m < temp.length; m++) {
            array[leftPtr + m] = temp[m];
        }

    }


}