package day11.task2;

public class Warrior extends Hero implements MagicAttack, PhysAttack {

    public Warrior() {
        health = 100;
        physAtt = 30;
        physDef = 80;
        magicAtt = 0;
        magicDef = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - (physAtt * hero.physDef / 100));
        if (hero.health <= 0)
            hero.health = 0;
        if (hero.health > 100)
            hero.health = 100;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (magicAtt - (magicAtt * hero.magicDef / 100));
        if (hero.health <= 0)
            hero.health = 0;
        if (hero.health > 100)
            hero.health = 100;
    }

    @Override
    public String toString() {
        return "Warrior {" +
                "health = " + health +
                '}';
    }
}
