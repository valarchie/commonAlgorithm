package arrays;

import java.util.Arrays;

/**
 * 反转数组
 * @Author valarchie
 * @Date 2020-04-28 18:58
 */
public class ReverseArray {

    public static final int[] ORDER_ARRAY_1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static final int[] ORDER_ARRAY_2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    public static void main(String[] args) {

        reverseArray(ORDER_ARRAY_1);
        System.out.println(Arrays.toString(ORDER_ARRAY_1));

        reverseArray(ORDER_ARRAY_2);
        System.out.println(Arrays.toString(ORDER_ARRAY_2));


    }


    /**
     * 只需要将数组按中间位置为对称轴进行交换
     * @param arrays
     */
    public static void reverseArray(int[] arrays) {

        for (int i = 0; i < arrays.length/2; i++) {

            int tmp = arrays[i];
            arrays[i] = arrays[arrays.length -1 - i];
            arrays[arrays.length -1 - i] = tmp;

        }

    }


}
