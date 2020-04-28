package arrays;

/**
 * 在数值在1-100的数组中，随机去除掉某几个数字，如何找到去除掉的数字
 *
 * @Author valarchie
 * @Date 2020-04-28 14:38
 */
public class FindMissingNumber {

    // 缺失数字 57
    public static final int[] TEST_INTS1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
        48, 49, 50, 51, 52, 53, 54, 55, 56, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
        76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

    // 缺失数字 87
    public static final int[] TEST_INTS2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
        76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

    // 缺失数字 8
    public static final int[] TEST_INTS3 = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
        76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};


    public static void main(String[] args) {

        findMissNumber2(TEST_INTS3);

    }


    /**
     * 找到丢失的数字 利用byte数组的1或0标记该数字是否被删除
     * 例如byte数组下标为0的数值为1的话，代表数字1存在
     */
    public static void findMissNumber1(int[] ints) {

        // 声明一个byte数组
        byte[] isExist = new byte[100];

        for (int i = 0; i < ints.length; i++) {

            if (ints[i] > 0) {
                // 由于数值比下标大1， 0位置代表的是数字1
                isExist[ints[i] - 1] = 1;
            }

        }

        for (int i = 0; i < isExist.length; i++) {

            if (isExist[i] == 0) {
                System.out.println("删除的数字是:" + ++i );
            }

        }

    }


    /**
     * 我们可以利用1-100的总和为5050，我们一次减所有值，得到的差值即为删除的值
     *
     */
    public static void findMissNumber2(int[] ints) {

        int sum = 5050;

        for (int i = 0; i < ints.length; i++) {

            sum -= ints[i];
        }

        System.out.println("删除的数字：" + sum);

    }



}