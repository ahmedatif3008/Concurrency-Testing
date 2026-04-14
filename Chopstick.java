public class Chopstick {
    static int positionalIterator = -1;
    boolean using;
    int position;

    public Chopstick(){
        positionalIterator += 1;
        this.using = false;
        this.position = positionalIterator;
    }

}
