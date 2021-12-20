package HW5;

import com.sun.xml.internal.ws.api.message.Header;

import java.io.File;

public class Main {


    public static void main(String[] args) {

        File file = new File("src/HW5/data.csv");
        File file2 = new File("src/HW5/1.txt");

        String[] headers = new String[]{"Value1", "Value2", "Value3"};
        int[][] values = new int[][]{
                {100, 200, 300},
                {1000, 2000, 3000},
                {10000, 20000, 30000}
        };

        AppData appData = new AppData(headers, values);
        appData.save(file);
        appData.load(file2);

    }
}
