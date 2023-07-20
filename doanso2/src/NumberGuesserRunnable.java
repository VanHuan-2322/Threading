import java.util.Random;

public class NumberGuesserRunnable implements Runnable {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private String threadName;
    private int targetNumber;

    public NumberGuesserRunnable(String threadName, int targetNumber) {
        this.threadName = threadName;
        this.targetNumber = targetNumber;
    }

    @Override
    public void run() {
        Random random = new Random();
        int guessNumber;
        int guessCount = 0;

        do {
            guessNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            guessCount++;
            System.out.println(threadName + " đoán số: " + guessNumber);
        } while (guessNumber != targetNumber);

        System.out.println(threadName + " thắng với " + guessCount + " lần đoán.");
    }
}

