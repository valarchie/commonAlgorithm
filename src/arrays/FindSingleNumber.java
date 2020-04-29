package arrays;

/**
 * description: 在一个数组中，只有一个数字没有重复，如何找到这个数字
 *
 * @author: valarchie
 * on: 2020/4/29
 * @email: 343928303@qq.com
 */
public class FindSingleNumber {


    public static final int[] TEST_INTS_1 = {1, 9, 4, 2, 7, 8, 5, 4, 7, 1, 2, 9, 5};

    public static final int[] TEST_INTS_2 = {1, 1, 2, 2, 3, 3, 4};


    public static void main(String[] args) {

        Integer singleNumber = findSingleNumber(TEST_INTS_1);

        System.out.println(singleNumber);


    }


    /**
     * 将所有数字进行异或，重复的数字将会抵消
     * @param ints
     * @return
     */
    public static Integer findSingleNumber(int[] ints) {

        if (ints.length == 0) {
            return null;
        }

        int singleNumber = ints[0];

        for (int i = 1; i < ints.length; i++) {

            singleNumber ^= ints[i];

        }

        return singleNumber;

    }


}