package minds;

import java.util.Arrays;

/**
 * 饼干分配问题
 * @Author valarchie
 * @Date 2020-05-05 19:31
 */
public class DistributeCookie {

    public static void main(String[] args) {

        int[] cookies = new int[]{1, 2};
        int[] kidsSatisfy = new int[]{3, 1, 2};

        distribute(kidsSatisfy, cookies);



    }


    /**
     * 分发饼干，先按满足度和饼干大小进行排序
     * @param kidSatisfy
     * @param cookies
     */
    public static void distribute(int[] kidSatisfy, int[] cookies) {

        Arrays.sort(kidSatisfy);
        Arrays.sort(cookies);

        int satisfyCount = 0;

        for (int i = 0; i < kidSatisfy.length && i < cookies.length; i++) {

//            if(cookies[i]<kidSatisfy.)

        }




    }



}
