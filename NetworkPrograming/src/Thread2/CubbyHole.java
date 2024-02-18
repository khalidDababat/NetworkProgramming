package Thread2;

class CubbyHole {

    private int x, y;
    private boolean available = false; // condition var

    public synchronized int get() {
        while (available == false) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;  // enforce consumers to wait again.
        notifyAll(); // notify all producer/consumer to compete for execution!
        // use notify() if just wanting to wakeup one waiting thread!
        return x + y;
    }

    public synchronized void put(int a, int b) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        x = a;
        y = b;
        available = true;  // wake up waiting consumer/producer to continue
        notifyAll(); // or notify();    }}

    }

}
