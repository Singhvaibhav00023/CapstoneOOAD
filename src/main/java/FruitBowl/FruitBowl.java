package FruitBowl;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {

    public static void main(String[] args) {

        List<Fruits> bowl = new ArrayList<>();

        bowl.add(new Fruits("apple","red","S",100));
        bowl.add(new Fruits("apple","green","M",150));
        bowl.add(new Fruits("mango","yellow","L",200));
        bowl.add(new Fruits("banana","yellow","M",150));
        bowl.add(new Fruits("grape","green","S",100));
        bowl.add(new Fruits("orange","orange","M",150));

        System.out.println("Fruits in the bowl are: "+bowl);

        System.out.println("------------------------");

        List<Fruits> uppershelf = new ArrayList<>();
        List<Fruits> middleshelf = new ArrayList<>();
        List<Fruits> lowershelf = new ArrayList<>();

        for (Fruits fruit:bowl) {
            if(fruit.getType().equalsIgnoreCase("Apple"))
            {
                uppershelf.add(fruit);
            } else if (fruit.getType().equalsIgnoreCase("Orange")) {
                middleshelf.add(fruit);
            } else  {
                lowershelf.add(fruit);
            }
        }

        System.out.println("Fruits in the above shelf are: "+uppershelf);
        System.out.println("Fruits in the middle shelf are: "+middleshelf);
        System.out.println("Fruits in the lower shelf are: "+lowershelf);
    }

    private static class Fruits {

        String type;
        String color;
        String size;
        int weight;

        public Fruits(String type, String color, String size, int weight) {
            this.type = type;
            this.color = color;
            this.size = size;
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Fruits{" +
                    "type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    ", size='" + size + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}
