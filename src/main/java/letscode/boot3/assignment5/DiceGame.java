package letscode.boot3.assignment5;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] rollCounts = new int[6];

        for (int i = 0; i < a; i++) {
            int randomDiceFace = (int) (Math.random() * 6);
            rollCounts[randomDiceFace]++;
        }

        for (int i = 0; i < rollCounts.length; i++) {
            System.out.printf((i+1) + "번 눈금이 %d번 나왔습니다.\n", rollCounts[i + 1]);
        }
    }

}
