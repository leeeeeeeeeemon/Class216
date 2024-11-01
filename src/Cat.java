import java.util.Random;

public class Cat extends Animal implements DisplayInfo, Attackeble{
    {
        this.name = "Koshak";
        this.age = 3;
        this.attack = 14;
    }
    interface Healleable{
        void heal();
    }


    void setAge(int age){
        if(age >= 0 && age < 40){
            this.age = age;
        }
    }





    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    Cat(String name){
        this.name = name;
        this.age = 7;
    }

    Cat(){

    }


    void punch(Animal enemy) {
        Random rnd = new Random();
        int bonusDamage = 0;
        for(Weapon wp : weapons){
            bonusDamage += wp.damageIncr;
        }

        int punch = attack + bonusDamage + rnd.nextInt(-5, 5);
        enemy.hp -= punch;
        System.out.println(name + " ударил палкой c силой "+ punch + " " + enemy.name + " , у противника" +
                "осталось хп: " + enemy.hp);
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " " + age);
    }


}
