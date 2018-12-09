package pokeball;

/**
 * Created by student1 on 09.12.18.
 */
public class Test {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Butterfree butterfree = new Butterfree();
        pikachu.hitTarget();
        butterfree.hitTarget();
        butterfree.checkAlive();
        butterfree.kill();
        butterfree.checkAlive();

    }
}
