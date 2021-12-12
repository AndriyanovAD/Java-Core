package HW4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String[] words= new String[]{
                "Java", "Java", "education", "education","education", "project", "project", "homework", "Java", "Java", "education", "Anton", "Andriyanov"
        };

        ArrayList list1 = new ArrayList();
        for (String string: words){
           list1.add(string);
        }

        HashSet hashSet= new HashSet();
        for (String string: words){
            hashSet.add(string);
        }
        System.out.println(hashSet);

        Iterator iterator = hashSet.iterator();

        while (iterator.hasNext()){
            String str = (String) iterator.next();
            System.out.println("Слово " + str + " повторяется в массиве " + Collections.frequency(list1, str) + " раз.");
        }

        Telephones telephones = new Telephones("Andriyanov", "+79119876542");

        telephones.add("Andriyanov", "+79119871234");
        telephones.add("Andriyanov", "+79069871234");
        telephones.add("Andriyanov", "+792119871234");
        telephones.add("Andreev", "+79119871234");


        telephones.get("Andriyanov");
        telephones.get("Andreev");
    }
}
