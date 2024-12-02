package bsu.rfe.java.group7.lab1.Zhamoitin.varB4;

public class Pie extends Food{
    public Pie(String filling) {
        super("Пирог");
        this.filling = filling.toLowerCase();
        calculateCalories();
    }

    private String filling;
    private int calories = 0;

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    public String toString() {
        return super.toString() + " " + filling.toLowerCase();
    }

    public boolean equals(Object arg0) {
        if(super.equals(arg0)) {
            if (!(arg0 instanceof Food)) return false;
            return filling.equals(((Pie)arg0).filling);
        }
        return false;
    }

    public int calculateCalories() {
        if(filling.equals("вишневый"))
            calories = 218;
        if(filling.equals("клубничный"))
            calories = 267;
        if(filling.equals("яблочный"))
            calories = 265;
        return getCalories();
    }

    public int getCalories(){
        return calories;
    }
}
