package minds;

/**
 * 交换两个数字，不使用临时变量
 *
 * @Author valarchie
 * @Date 2020-05-05 15:24
 */
public class ExchangeWithoutTemp {


    public static void main(String[] args) {

        exchange3(3, 4);

    }


    /**
     * 利用加法的差值进行
     * a = a + b
     * b = (a+b) - b
     * @param a
     * @param b
     */
    public static void exchange1(int a, int b) {

        System.out.println("a:" + a + ",b:" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a:" + a + ",b:" + b);
    }


    public static void exchange2(int a, int b) {

        System.out.println("a:" + a + ",b:" + b);

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("a:" + a + ",b:" + b);


    }

    public static void exchange3(int a, int b) {

        System.out.println("a:" + a + ",b:" + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a:" + a + ",b:" + b);


    }


}
