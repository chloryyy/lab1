package bsu.rfe.java.group7.lab1.Zhamoitin.varB4;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {
    public int compare(Food obj1, Food obj2) {
        if(obj1 == null) return 1;
        if(obj2 == null) return -1;
        return Integer.compare(obj2.calculateCalories(),obj1.calculateCalories());
    }
}
