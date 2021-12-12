package HW4;

import java.util.ArrayList;
import java.util.HashMap;

public class Telephones {

    ArrayList<String> arrayList = new ArrayList<>();
    HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public Telephones(String secondName, String tel) {
        arrayList.add(tel);
        hashMap.put(secondName, arrayList);
    }

    public void get(String secondName){
        System.out.println("Для имени *" + secondName + "* найдены следующие телефоны: " + hashMap.get(secondName));

    }

    public void add(String secondName, String telephone) {
           if (hashMap.containsKey(secondName)) {
               hashMap.get(secondName).add(telephone);
           } else {
               ArrayList<String> newArrayList = new ArrayList<>();
               newArrayList.add(telephone);
               hashMap.put(secondName, newArrayList);
           }
    }
}
