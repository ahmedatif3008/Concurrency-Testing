import java.util.PriorityQueue;

public class Dining {

    public static void main(String[] args){


        Philosopher a = new Philosopher();
        Philosopher b = new Philosopher();
        Philosopher c = new Philosopher();
        Philosopher d = new Philosopher();
        Philosopher e = new Philosopher();

        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();
        Chopstick c3 = new Chopstick();
        Chopstick c4 = new Chopstick();
        Chopstick c5 = new Chopstick();

        Philosopher[] philosophers = {a, b, c, d, e};
        Chopstick[] chopsticks = {c1, c2, c3, c4, c5};
        int len = philosophers.length;
        PriorityQueue<Philosopher> pq = new PriorityQueue<>();

        for (int i = 0; i < len; i++){ //initialize the priority queue
            pq.add(philosophers[i]);
        }


        



    }
}
