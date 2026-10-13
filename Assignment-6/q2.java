
class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

class Counter {
    synchronized void display(String name) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " : " + i);
        }
    }
}

class SyncThread extends Thread {
    Counter counter;

    SyncThread(Counter counter, String name) {
        super(name);
        this.counter = counter;
    }

    public void run() {
        counter.display(getName());
    }
}

public class q2 {
    public static void main(String[] args) {

        // Thread creation and priorities
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        // Synchronization
        Counter counter = new Counter();

        SyncThread t3 = new SyncThread(counter, "Sync Thread 1");
        SyncThread t4 = new SyncThread(counter, "Sync Thread 2");

        t3.start();
        t4.start();

        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());
    }
}
