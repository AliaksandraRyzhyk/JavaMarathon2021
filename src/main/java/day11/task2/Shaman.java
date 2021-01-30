package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {

    public Shaman() {
        health = 100;
        physAtt = 10;
        physDef = 20;
        magicAtt = 15;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        health += 50;
        if (health <= 0)
            health = 0;
        if (health > 100)
            health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
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
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - (physAtt * hero.physDef / 100));
        if (hero.health <= 0)
            hero.health = 0;
        if (hero.health > 100)
            hero.health = 100;
    }

    @Override
    public String toString() {
        return "Shaman {" +
                "health = " + health +
                '}';
    }
}
