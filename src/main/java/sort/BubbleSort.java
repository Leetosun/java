package sort;

import org.junit.Test;

/**
 * Created by LeeToSun on 2017/6/26 0026
 */
public class BubbleSort {

    @Test
    public void test() {
        // int[] arr = new int[3];
        // arr[0] = 1;
        int[] arr = { 9, 13, 5, 63, 21, 2 };
        for (int i = 0; i < arr.length - 1; i++) { // 减少循环次数 -1 -i-1
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        System.out.println();
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
