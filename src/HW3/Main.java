package HW3;

public class Main {

    public static void main(String[] args) {

        Box boxOfApples1 = new Box();
        boxOfApples1.addFruit(new Apple());
        boxOfApples1.addFruit(new Apple());
        boxOfApples1.addFruit(new Apple());
        boxOfApples1.addFruit(new Orange());
        Box boxOfApples2 = new Box();
        boxOfApples2.addFruit(new Apple());
        boxOfApples2.addFruit(new Apple());
        boxOfApples2.addFruit(new Apple());
        Box boxOfOrange = new Box();
        boxOfOrange.addFruit(new Orange());
        boxOfOrange.addFruit(new Orange());

        System.out.println(boxOfApples1.getWeight());
        System.out.println(boxOfApples2.getWeight());

        System.out.println(boxOfApples1.compare(boxOfApples2));
        System.out.println(boxOfOrange.compare(boxOfApples1));

        System.out.println(boxOfApples1);
        System.out.println(boxOfApples2);

        boxOfApples1.sumBoxes(boxOfApples2);
        System.out.println(boxOfApples1);
        System.out.println(boxOfApples2);

        boxOfApples1.sumBoxes(boxOfOrange);

        System.out.println(boxOfOrange.compare(boxOfApples1));

    }



}
