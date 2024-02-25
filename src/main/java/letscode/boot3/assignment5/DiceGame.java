package letscode.boot3.assignment5;

import java.util.stream.IntStream;

public class DiceGame {

    private static final int DICE_FACE = 6;
    private final int[] resultCounts = new int[DICE_FACE];

    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        DiceGame game = new DiceGame();
        game.startGame();
    }

    private void startGame() {
        determineRollCounts(User.inputNumber());
        printResult();
    }

    private void determineRollCounts(int a) {
        IntStream.range(0, a)
                .map(i -> (int) (Math.random() * DICE_FACE))
                .forEach(randomDiceFace -> resultCounts[randomDiceFace]++);
    }

    private void printResult() {
        IntStream.range(0, resultCounts.length).forEach(i ->
                System.out.printf("%d번 눈금이 %d번 나왔습니다.\n", i + 1, resultCounts[i]));

    }

}
