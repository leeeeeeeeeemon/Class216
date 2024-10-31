//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Tom", 25);

        barsik.setAge(-5);

        Weapon sword = new Weapon(10);
        Weapon secondSword = new Weapon(15);

        barsik.addWeapon(sword);
        barsik.addWeapon(secondSword);
        barsik.disployInfo();

        Dog d1 = new Dog();

        battle(barsik, d1);
    }

    static void battle(Animal an1, Animal an2){
        System.out.println("Battle");
        while (an1.hp > 0 && an2.hp > 0){
            an1.punch(an2);
            an2.punch(an1);
        }
        if(an1.hp <= 0) System.out.println("Победил " + an2.name);
        if(an2.hp <= 0) System.out.println("Победил " + an1.name);
    }
}
