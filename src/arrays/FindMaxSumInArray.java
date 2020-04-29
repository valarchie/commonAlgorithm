package arrays;


/**
* description: 在一个有负数的数组中寻找连续最大的子向量
* 例如{6,-3,-2,7,-15,1,2,2}连续最大子向量为8
* @author: valarchie
* on: 2020/4/29
* @email: 343928303@qq.com
*/
public class FindMaxSumInArray {

    public static final int[] TEST_INTS_1 = new int[]{6, -3, -2, 7, -15, 1, 2, 2};

    public static final int[] TEST_INTS_2 = new int[]{-1, 0, 5, 0, 0};

    public static void main(String[] args) {


        System.out.println(findMaxSum(TEST_INTS_1));
        System.out.println(findMaxSum(TEST_INTS_2));


    }


    /**
     * 在数组中声明一个临时sum和最大sum,当累加的临时sum小于0的话，就放弃这个下标，重新开始
     * 当临时sum大于最大sum的时候，就替换最大sum
     * @param ints
     * @return
     */
    public static Integer findMaxSum(int[] ints) {

        if (ints.length == 0) {
            return null;
        }

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < ints.length; i++) {

            currentSum += ints[i];

            if (currentSum < 0) {
                currentSum = 0;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;

    }






}