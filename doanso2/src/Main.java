import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên từ 1 đến 100: ");
        int targetNumber = scanner.nextInt();

        Thread thread1 = new Thread(new NumberGuesserRunnable("Thread 1", targetNumber));
        Thread thread2 = new Thread(new NumberGuesserRunnable("Thread 2", targetNumber));

        thread1.start();
        thread2.start();
    }
}