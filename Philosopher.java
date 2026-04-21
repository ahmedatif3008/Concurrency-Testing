import java.util.PriorityQueue;

public class Philosopher extends Thread{
    int hunger;
    char name;
    static int nameNum = 64;
    boolean eating = false;
    Chopstick left;
    Chopstick right;

    public Philosopher(Chopstick l, Chopstick r){
        this.hunger = 0;
        nameNum += 1;
        this.name = (char) nameNum;
        this.left = l;
        this.right = r;
    }

    public void think(){
        this.hunger += 1;
    }

    public void eat(){
        this.hunger = 0;
        this.eating = true;
        this.left.pickUp();
        this.right.pickUp();
    }

    public void stopEating(){
        this.eating = false;
        this.left.putDown();
        this.right.putDown();
    }

    public synchronized void run(){
        int counter = 0;
        while (true){ 
            eat();
            System.out.println("Philosopher " + this.name + " is eating " + this.hunger + " : ");
            try {
                Thread.sleep(3000);
            }
                catch (Exception l){
                System.out.println("error");
            }
            stopEating();
            
            counter++;


        }
            
    }

    
}
