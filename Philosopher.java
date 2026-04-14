public class Philosopher extends Thread{
    int hunger;
    char name;
    static int nameNum = 64;
    boolean eating = false;

    public Philosopher(){
        this.hunger = 0;
        nameNum += 1;
        this.name = (char) nameNum;
    }

    public void starve(){
        this.hunger += 1;
    }

    public void eat(){
        this.hunger = 0;
        this.eating = true;
    }

    public void run(){
        eat();
    }
}
