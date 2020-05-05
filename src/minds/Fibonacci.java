package minds;

/**
 * 斐波那契数列-动态规划方式
 * @Author valarchie
 * @Date 2020-05-05 17:06
 */
public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacciDP(9));

    }



    /**
     * 采用动态规划的方式
     * @param level
     * @return
     */
    public static int fibonacciDP(int level) {

        int[] dp = new int[level + 1];

        for (int i = 0; i <= level; i++) {

            if (i == 0) {
                dp[i] = 0;
                continue;
            }

            if (i == 1) {
                dp[i] = 1;
                continue;
            }

            dp[i] = dp[i - 1] + dp[i - 2];

        }

        return dp[level];

    }

}
