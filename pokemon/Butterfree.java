package pokeball;

/**
 * Created by student1 on 09.12.18.
 */
public class Butterfree extends Pokemon {
    Butterfree(){
        super();
        System.out.println("тип покемона - ButterFree");
    }
    @Override
    void hitTarget(){
        System.out.println("ButterFree испульзует отвлекающий маневр, не насосящий урона");
    }
    void kill(){
        isAlive = false;
        System.out.println("Произошло убийство");
    }
    void checkAlive(){
        System.out.println(isAlive ? this + "Yeah" : this + "NO(");
    }

}
