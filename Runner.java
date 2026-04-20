import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Runner {

   

    public static void main(String[] args){

        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();
        Chopstick c3 = new Chopstick();
        Chopstick c4 = new Chopstick();
        Chopstick c5 = new Chopstick();

        Philosopher a = new Philosopher(c1, c2);
        Philosopher b = new Philosopher(c2, c3);
        Philosopher c = new Philosopher(c3, c4);
        Philosopher d = new Philosopher(c4, c5);
        Philosopher e = new Philosopher(c5, c1);



        Philosopher[] philosophers = {a, b, c, d, e};
        Chopstick[] chopsticks = {c1, c2, c3, c4, c5};
        int len = philosophers.length;
        
        int counter = 0;

      
        philosophers[0].start();
        philosophers[1].start();
        philosophers[2].start();
        philosophers[3].start();
        philosophers[4].start();

        

    }
}
