public class MyThread extends Thread {
//Trạng thái
    @Override
    public void run() {
        System.out.println("Thread Start");
    }
//
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        System.out.println(myThread.getState());
//    }


//    Trạng thái RUNNABLE
//    @Override
//    public void run() {
//        System.out.println("Thread Start");
//    }
//
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println(myThread.getState());
//
//    }

//    Trạng thái BLOCKED
//@Override
//public void run() {
//    DemoSynchronized.commonResource();
//}
//
//    public static void main(String[] args) {
//        // Khai báo nhiều đối tượng của MyThread
//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//
//        // Đều start() hết các đối tượng MyThread
//        // để xem Thread nào sẽ được vào commonResource()
//        myThread1.start();
//        myThread2.start();
//
//        // In ra các trạng thái của chúng
//        System.out.println(myThread1.getName() + ": " + myThread1.getState());
//        System.out.println(myThread2.getName() + ": " + myThread2.getState());
//    }
//    Trạng thái WAITING
//    @Override
//    public void run() {
//        System.out.println("MyThread Start");
//        Thread myRunnableThread = new Thread(new MyRunnable());
//        myRunnableThread.start();
//
//        try {
//            myRunnableThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("MyThread End");
//    }
//
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//
//        myThread.start();
//
//        try {
//            Thread.sleep(100);
//            System.out.println("MyThread State: " + myThread.getState());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }




}


