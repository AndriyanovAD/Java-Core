package HW5;

import java.io.*;


public class AppData {

    private String[] header;

    private int[][] values;

    public AppData(String[] header, int[][] values) {
        this.header = header;
        this.values = values;
    }

    public void save(File file){
        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(file))){
            for (int i=0; i < header.length; i++){
                if (i == (header.length -1)){
                    bufferedOutputStream.write(header[i] + "\n");
                } else {
                    bufferedOutputStream.write(header[i] + "; ");
                }
             }
            for (int i=0; i < values.length; i++){
                for (int j=0; j < values.length; j++){
                    if (j == (values.length - 1)){
                        bufferedOutputStream.write(values[i][j] + "\n");
                    } else {
                        bufferedOutputStream.write(values[i][j] + "; ");
                    }
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public void load(File file){
        try (BufferedReader bufferedOutputStream = new BufferedReader(new FileReader(file))){

            header = bufferedOutputStream.readLine().split("; ");

            int countOfHeaders = header.length;

            int countStringsOfData = countStringsOfData(file);


            this.values = new int[countStringsOfData][countOfHeaders];

            for (int i=0; i < countStringsOfData; i++){
                String[] tmp = bufferedOutputStream.readLine().split("; ");
                for (int j=0; j < countOfHeaders; j++){
                    this.values[i][j] = Integer.parseInt(tmp[j]);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getValues() {
        return values;
    }

    public int countStringsOfData (File file) {
        String data;
        int countStringsOfData = 0;
        try (BufferedReader bufferedOutputStream = new BufferedReader(new FileReader(file))){
            while ((data = bufferedOutputStream.readLine()) != null){
                countStringsOfData++;
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        return (countStringsOfData -1) ;
    }
}
