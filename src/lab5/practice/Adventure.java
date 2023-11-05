package lab5.practice;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    public void swim() {
    }

    public void fly() {
    }
}

public class Adventure {

    static void t(CanFight x) {
        x.fight();
    }

    static void u(CanSwim x) {
        x.swim();
    }

    static void v(CanFly x) {
        x.fly();
    }

    static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(final String[] args) {
        Hero hero = new Hero();

        t(hero); // Treat it as a CanFight

        u(hero); // Treat it as a CanSwim

        v(hero); // Treat it as a CanFly

        w(hero); // Treat it as an ActionCharacter
    }
}