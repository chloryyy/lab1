package bsu.rfe.java.group7.lab1.Zhamoitin.varB4;

    public abstract class Food implements Consumable, Nutritious {
        public Food(String name){
            this.name = name;
        }
       String name = null;

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

        public String toString() {
            return name;
        }

        public boolean equals(Object arg0) {
           if(!(arg0 instanceof Food)) return false;
           if(name == null || ((Food)arg0).name==null) return false;
           return name.equals(((Food)arg0).name);
        }
    }


