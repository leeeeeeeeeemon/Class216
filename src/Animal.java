import java.util.ArrayList;

public class Animal {
    String name;
    protected int age;
    int hp = 50;
    int attack = 15;

    void punch(Animal enemy){
    }

    void addWeapon (Weapon weapon){
        this.weapons.add(weapon);
    }
    ArrayList<Weapon> weapons = new ArrayList<Weapon>();
}
