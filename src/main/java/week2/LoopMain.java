package week2;

import java.util.logging.Logger;

public class LoopMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.info("start >>>>>>>");
        // 1. for문 사용하기 -> 초기식, 조건식, 증감식을 다 주었을 때
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        logger.info("end >>>>>>>>");
        // 2. for문 사용하기 -> 초기식, 조건식, 증감식을 중 일부만 주었을 때
        for (int i = 0; i < 5;) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        // 3. for문 사용하기 -> 초기식, 조건식, 증감식 모두 안 주었을 때
        int j = 0;
        for (;;) {
            j += 1;
            System.out.println(j);
            if (j == 5) {
                break;
            }
        }
    }
}
