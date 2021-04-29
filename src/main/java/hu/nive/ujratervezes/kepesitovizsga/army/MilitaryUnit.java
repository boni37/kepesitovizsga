package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    int force;
    int hitPoints;
    boolean isArmored;

    public MilitaryUnit() {
    }

    public int getForce() {
        return force;
    }


    public boolean isArmored() {
        return isArmored;
    }

    abstract int doDamage();

    abstract int sufferDamage(int damage);

    public abstract int getHitPoints();
}
