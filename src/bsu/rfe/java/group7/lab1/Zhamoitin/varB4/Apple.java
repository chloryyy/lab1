package bsu.rfe.java.group7.lab1.Zhamoitin.varB4;

public class Apple extends Food{
    public Apple(String size) {
        super("Яблоко");
        this.size = size.toLowerCase();
        calculateCalories();
    }

    private String size;
    private int calories = 0;

    public String getSize()
    {
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String toString() {
        return super.toString() + " размера '" + size.toLowerCase() + "'";
    }


    public boolean equals(Object arg) {
        if(super.equals(arg)) {
            if(!(arg instanceof Apple)) return false;
            if (size.equals(((Apple)arg).size)) {
                return true;
            }
        }
        return false;
    }

    public int calculateCalories() {
        if(size.equalsIgnoreCase("большое")) {
            calories = 94;
        }
        if(size.equalsIgnoreCase("среднее")) {
            calories = 61;
        }
        if(size.equalsIgnoreCase("маленькое")) {
            calories = 42;
        }
        return calories;
    }

    public int getCalories(){
        return calories;
    }
}
