package thread;

public class myThread extends Thread {
    private int count = 5;

    //public void run() {
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(" 由 " + this.currentThread().getName() + " 计算，count=" + count);
    }
}
