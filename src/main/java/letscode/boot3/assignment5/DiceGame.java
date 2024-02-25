package letscode.boot3.assignment5;

import java.util.Scanner;

public class DiceGame {
    int[] resultCounts = new int[6];

    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
    }

    private void startGame() {
        determineRollCounts(inputNumber());
        printResult();
    }

    private int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void determineRollCounts(int a) {
        for (int i = 0; i < a; i++) {
            int randomDiceFace = (int) (Math.random() * 6);
            resultCounts[randomDiceFace]++;
        }
    }

    private void printResult() {
        for (int i = 0; i < resultCounts.length; i++) {
            System.out.printf((i + 1) + "번 눈금이 %d번 나왔습니다.\n", resultCounts[i + 1]);
        }
    }

}
