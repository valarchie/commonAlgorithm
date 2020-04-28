package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * 从数组中找出给定目标数字的两数组合
 *
 * @Author valarchie
 * @Date 2020-04-28 17:13
 */
public class FindPairEqualsTarget {

    public static final int[] TEST_INTS_1 = new int[]{2, 3, 5, 7, 8, 9, 11, 14, 18};
    public static final int[] TEST_INTS_2 = new int[]{1, 2, 3, 4, 5, 6, 10, 11, 12, 13};
    public static final int[] TEST_INTS_3 = new int[]{0, 6, 7, 10, 12, 17, 19};


    public static void main(String[] args) {

        findPairNumber(TEST_INTS_1, 17);

        findPairNumber(TEST_INTS_2, 21);

        findPairNumber(TEST_INTS_3, 30);

    }


    /**
     * 利用Set存储是否存在对应的数字
     */
    public static void findPairNumber(int[] arrays, int target) {

        Set<Integer> existIntegers = new HashSet<>();

        for (int i = 0; i < arrays.length; i++) {

            existIntegers.add(arrays[i]);

        }

        for (int i = 0; i < arrays.length; i++) {

            if (existIntegers.contains(target - arrays[i])) {
                System.out.println("找到对应的数字组合：" + arrays[i] + "和" + (target - arrays[i]));

                // 去除掉已使用过的数字
                existIntegers.remove(arrays[i]);

            }

        }


    }


}
