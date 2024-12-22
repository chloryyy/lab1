package bsu.rfe.java.group7.lab1.Zhamoitin.varB4;

import java.util.Arrays;
import java.util.Scanner;
//
public class MainApplication {
    public static void main (String[] args) throws Exception{

        Scanner in = new Scanner(System.in);

        Food[] breakfast = new Food[20];

        boolean checkexit = true;
        int Item = 0;
        int calories = 0;

        while(checkexit) {
            System.out.println("Что вы хотите употребить?(напишите End, чтобы закончить)");
            args = in.nextLine().split(" ");

            for (String arg : args) {
                if(arg.equals("End"))
                {
                    checkexit = false;
                    break;
                }
                if (arg.startsWith("-")) {
                    if(arg.equals("-show"))
                    {
                        System.out.println("В списке завтрака: ");
                        for(Food item : breakfast)
                        {
                            if(item!=null) {
                                System.out.println(item);
                            }
                            else {
                                break;
                            }
                        }

                    }
                    if(arg.equals("-calories"))
                    {
                        for(Food item : breakfast)
                        {
                            if (item != null) {
                                calories += item.calculateCalories();
                            }
                            else
                            {
                                break;
                            }
                        }
                        System.out.println("В завтраке уже "+ calories + " калорий");
                    }
                    if(arg.equals("-sort"))
                    {
                        Arrays.sort(breakfast, new FoodComparator());
                    }
                }
                else
                {
                    String[] parts = arg.split("/");
                    switch (parts[0])
                    {
                        case "Cheese":
                            breakfast[Item] = new Cheese();
                            Item++;
                            break;
                        case "Apple":
                            breakfast[Item] = new Apple(parts[1]);
                            Item++;
                            break;
                        case "Pie":
                            breakfast[Item] = new Pie(parts[1]);
                            Item++;
                            break;
                        default:
                            System.out.println("Неизвестная продукт! Попробуйте еще раз, например Apple/большое");
                    }
                }
            }
        }
        for(Food item: breakfast)
        {
            if (item!=null) {
                item.consume();
            }
            else {
                break;
            }
        }

        int[] Apples = {0,0,0};
        int[] Pies = {0,0,0};
        int[] Cheeses = {0};

        for(Food item : breakfast)
        {
            if (item instanceof Apple) {
                Apple apple = (Apple) item;
                if ("большое".equals(apple.getSize())) {
                    Apples[0]++;
                } else if ("среднее".equals(apple.getSize())) {
                    Apples[1]++;
                } else if ("маленькое".equals(apple.getSize())) {
                    Apples[2]++;
                }
            } else if (item instanceof Pie) {
                Pie pie = (Pie) item;
                if ("вишневый".equals(pie.getFilling())) {
                    Pies[0]++;
                } else if ("яблочный".equals(pie.getFilling())) {
                    Pies[1]++;
                } else if ("клубничный".equals(pie.getFilling())) {
                    Pies[2]++;
                }
            } else if (item instanceof Cheese) {
                Cheeses[0]++;
            }
        }

        System.out.println("Итого продуктов съедено:\n Сыров: " + Cheeses[0]);
        System.out.println(" Пирогов:\n  Вишневых: " + Pies[0] +"\n  Яблочных: " + Pies[1] + "\n  Клубничных: "+Pies[2]);
        System.out.println(" Яблок:\n  Больших: " + Apples[0] + "\n  Средних: " + Apples[1]+ "\n  Маленьких: " + Apples[2]);
        System.out.println("Goodbye!");
    }
}
