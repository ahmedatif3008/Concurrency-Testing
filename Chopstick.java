import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    static int positionalIterator = -1;
    // boolean using;
    int position;
    private final ReentrantLock lock = new ReentrantLock();

    public Chopstick(){
        positionalIterator += 1;
        // this.using = false;
        this.position = positionalIterator;
    }

    public void pickUp() {
        lock.lock();  
    }

    public void putDown() {
        lock.unlock();
    }
}
