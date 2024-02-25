package letscode.boot3.assignment5;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] rollCounts = new int[6];

        for (int i = 0; i < a; i++) {
            double b = Math.random() * 6;
            if (b >= 0 && b < 1) {
                r1++;
            } else if (b >= 1 && b < 2) {
                r2++;
            } else if (b >= 2 && b < 3) {
                r3++;
            } else if (b >= 3 && b < 4) {
                r4++;
            } else if (b >= 4 && b < 5) {
                r5++;
            } else if (b >= 5 && b < 6) {
                r6++;
            }
        }

        System.out.printf("1번 눈금이 %d번 나왔습니다.\n", r1);
        System.out.printf("2번 눈금이 %d번 나왔습니다.\n", r2);
        System.out.printf("3번 눈금이 %d번 나왔습니다.\n", r3);
        System.out.printf("4번 눈금이 %d번 나왔습니다.\n", r4);
        System.out.printf("5번 눈금이 %d번 나왔습니다.\n", r5);
        System.out.printf("6번 눈금이 %d번 나왔습니다.\n", r6);
    }

}
