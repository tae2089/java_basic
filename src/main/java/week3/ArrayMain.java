package week3;

import java.util.Arrays;
import java.util.logging.Logger;

public class ArrayMain {
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {

        // 배열 생성하기
        int[] arr1 = { 1, 2, 3, 4 };
        log.info("-------------------start------------------------");
        int[] arr2 = new int[5];
        arr2[0] = 555;
        // 배열의 값 넣어 보기
        arr2[0] = 1;
        arr2[1] = 2;

        // 이차원 배열 만들어 보기
        int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr4 = new int[3][3];
        // 배열의 값 변경해보기
        arr1[0] = 3;
        // 배열의 값 출력해보기
        log.info(Arrays.toString(arr1));
        log.info(Arrays.toString(arr2));

        // call by reference
        arr1[0] = 1;
        callReference(arr1);
        log.info(Arrays.toString(arr1));
        log.info("-------------------end------------------------");
    }

    static void callReference(int[] arr) {
        int j = 0;
        for (int i : arr) {
            arr[j] = i + 1;
            j += 1;
        }
    }
}
