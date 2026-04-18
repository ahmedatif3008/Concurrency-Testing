import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Dining {

    public static void printPQ(PriorityQueue<Philosopher> p){
        System.out.print("[ ");


        while(!p.isEmpty()) {
            System.out.print(p.poll().name + ", ");
        }

        System.out.print("]");
    }

    public static void printPhilosopoherList(Philosopher[] phil){
        System.out.print("[ ");


        for (int i = 0; i < phil.length; i++){
            System.out.print(phil[i].name + ", " + phil[i].hunger + ", " + phil[i].eating + " ||| ");
        }

        System.out.print("] \n");
    }

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

        PriorityQueue<Philosopher> pq = new PriorityQueue<>(
            (x, y) -> y.hunger - x.hunger 
        ); //comparator for the pq

        for (int i = 0; i < len; i++){ //initialize the priority queue
            pq.add(philosophers[i]);
        }

        
        Philosopher p1 = null;
        Philosopher p2 = null;
        int counter = 0;

        while (true) {
            
            if ((p1 == null) && (p2 == null)){ 
                p1 = pq.poll();
                p2 = pq.poll();
            }
            
            pq.add(p1);
            pq.add(p2);


            p1 = pq.poll();
            

            printPhilosopoherList(philosophers);
            

            Stack<Philosopher> stck = new Stack<>();

            while (true){
                p2 = pq.poll();
                
                if ((p1.left == p2.right) || (p1.right == p2.left)){
                    stck.add(p2);
                }
                else {
                    break;
                }
            
            }



            // while ((p1.left == pq.peek().right) || (p1.right == pq.peek().left)){
            //     //System.out.println("hello");

            // }

            while (stck.size() != 0){
                pq.add(stck.pop());
            }

            p1.run();
            p2.run();

            try {
                Thread.sleep(3000);
            }
            catch (Exception l){
                System.out.println("error");
            }
            
            System.out.println(p1.name + " and " + p2.name + " are eating::" + pq.size());

            for (int i = 0; i < philosophers.length; i++){
                if ((!philosophers[i].equals(p1)) && (!philosophers[i].equals(p2))){
                    philosophers[i].starve();
                    
                }
            }
            counter++;

            if (counter == 100){ break;}
        }

        

    }
}
