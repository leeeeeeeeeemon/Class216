//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Tom", 25);

        DisplayInfo ourCat = new Cat("bars", 25);
        Animal f = new Dog();

        ((Cat)ourCat).setAge(54);
        ourCat.print();

        barsik.setAge(-5);
        barsik.displayInfo();
        Dog d1 = new Dog();
        Weapon sword = new Weapon(15);
        barsik.weapons.add(sword);

        //battle(barsik, d1);


        Calculator calc = new Calculator();
        System.out.println(calc.sum(13,14,6));
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
