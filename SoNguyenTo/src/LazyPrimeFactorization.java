public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization: " + number);
            }
            if (number >= 100) {
                break;
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}