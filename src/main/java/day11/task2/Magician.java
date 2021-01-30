package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {

    public Magician() {
        health = 100;
        physAtt = 5;
        physDef = 0;
        magicAtt = 20;
        magicDef = 80;
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
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - (physAtt * hero.physDef / 100));
        if (hero.health <= 0)
            hero.health = 0;
        if (hero.health > 100)
            hero.health = 100;
    }

    @Override
    public String toString() {
        return "Magician {" +
                "health = " + health +
                '}';
    }
}
