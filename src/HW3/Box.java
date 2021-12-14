package HW3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

   private ArrayList<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }


    public float getWeight (){
        float sum = 0;
            for (int i=0; i < fruitList.size(); i++){
                sum += fruitList.get(i).getWeight();
            }
        return sum;
    }

    public void sumBoxes(Box box){
        if (this.getFruitList().get(0).getClass() == box.getFruitList().get(0).getClass()){
            this.fruitList.addAll(box.fruitList);
            box.fruitList.removeAll(fruitList);
        } else {
            System.out.println("Нельзя соединять коробки с яблоками и апельсинами");
        }

    }

    public void addFruit(T fruit) {
        if (this.fruitList.isEmpty()){
            this.fruitList.add(fruit);
        }else if (this.getFruitList().get(0).getClass()==fruit.getClass()){
            this.fruitList.add(fruit);
        } else {
            System.out.println("Ай ай яй!!! Вы попытались положить фрукт в коробку с фруктом другого вида! Так делать нельзя по заданию и эта операция не выполнена!");
        }
    }

    public boolean compare(Box box){
       if (this.getWeight()==box.getWeight()){
           return true;
       } else return false;
    }



//// Написал метод на случай если вес фруктов будет разный
//    public boolean compare(Box box){
//        if (this.fruitList.size()==box.fruitList.size() & this.getWeight()==box.getWeight()){
//            return true;
//        }else return false;
//    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList.size() +
                '}';
    }
}
