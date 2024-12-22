package bsu.rfe.java.group7.lab1.Zhamoitin.varB4;

public class Cheese extends Food {
        public Cheese() {
            super("Сыр");
            calculateCalories();
        }

        private int calories = 0;
        public void consume() {
            System.out.println(this + " съеден");
        }

//for first commit
    public int calculateCalories() {
        calories = 200;
        return calories;
    }
}
