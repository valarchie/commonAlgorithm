package sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
* description: 桶排序
* @author: valarchie
* on: 2020/5/4
* @email: 343928303@qq.com
*/
public class BucketSort {


    public static void main(String[] args) {

        bucketSort(TestSortData.DISORDER_ARRAY);
        System.out.println(Arrays.toString(TestSortData.DISORDER_ARRAY));

    }


    public static void bucketSort(int[] array){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }

        //桶数
        int bucketNum = (max - min) / array.length + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for(int i = 0; i < bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }

        //将每个元素放入桶
        for(int i = 0; i < array.length; i++){
            int num = (array[i] - min) / (array.length);
            bucketArr.get(num).add(array[i]);
        }

        //对每个桶进行排序
        for(int i = 0; i < bucketArr.size(); i++){
            Collections.sort(bucketArr.get(i));
        }

        int k = 0;

        for (int i = 0; i < bucketArr.size(); i++) {

            for (Integer integer : bucketArr.get(i)) {
                array[k++] = integer;
            }

        }

    }
}