public class MinhaThread extends Thread {
    public void run() {
        System.out.println("Thread Secundaria");
    }

    public static void main(String[] args) {
        MinhaThread minhaThread = new MinhaThread();
        minhaThread.start();
        System.out.println("Thread Principal");
    }
}
