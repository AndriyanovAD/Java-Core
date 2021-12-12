package HW3;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[2];
        array[0] = "1";
        array[1] = "2";
        System.out.println("Массив содержит: [0]= " + array[0] + " [1]= " + array[1]);
        changeElementsOfArray(array, 0, 1);
        System.out.println("Массив содержит: [0]= " + array[0] + " [1]= " + array[1]);

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

    public static void changeElementsOfArray(String[] array, int index1, int index2){
        if (array.length >= index1 & array.length >= index2) {
            String a;
            String b;
            a = array[index1];
            b = array[index2];
            array[index1] = b;
            array[index2] = a;
        } else {
            System.out.println("Размер данного массива меньше чем подаваемые индексы");
        }
    }

}
