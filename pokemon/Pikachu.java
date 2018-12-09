package pokeball;

/**
 * Created by student1 on 09.12.18.
 */
public class Pikachu extends Pokemon {
    Pikachu(){
        super();
        System.out.println("тип покемона - Пикачу");
    }
    @Override
    void hitTarget(){
        System.out.println("Пикачу использует");
    }
    void kill(){
        isAlive = false;
        System.out.println("Произошло убийство");
    }
    void checkAlive(){
        System.out.println(isAlive ? this + "Yeah" : this + "NO(");
    }
}
