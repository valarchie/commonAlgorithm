package leetcode;

public class No202HappyNumber {


    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(long number) {
        long slow = number;
        long fast = squareSum(number);

        while (slow != fast) {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }
        return slow == 1;
    }


    public static long squareSum(long number) {
        long sum = 0;
        while (number != 0) {
            long remain = number % 10;
            sum += remain * remain;
            number /= 10;
        }
        return sum;
    }

}