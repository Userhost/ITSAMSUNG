package pokeball;

/**
 * Created by student1 on 09.12.18.
 */
public class Pokemon {
    boolean isAlive;
    int hp = 100;
    int mp = 100;
    Pokemon(){
        isAlive = true;
        hp = 100;
        mp = 100;
        System.out.println("Рождение покемона "+this);
    }
    void hitTarget(){

    }
}
