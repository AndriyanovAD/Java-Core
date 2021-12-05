package HW2;

public class Main {

    int sum=0;

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] string1 = {
                {"1","2","3","4"},
                {"1","8","3","4"},
                {"6","2","3","4"},
                {"1","2","15","4"}
        };

        String[][] string2 = {
                {"1","2","3","4"},
                {"1","8","3","4"},
                {"6","2","3","4"},
                {"1","2","15","5"},
                {null,"2",null,null}
        };

        String[][] string3 = {
                {"1","2","3","4"},
                {"1","8","3","4"},
                {"6","2","3","4"},
                {"1","2","15","a"}
        };

        try {
            CheckSizeAndSum(string1);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void CheckSizeAndSum (String[][] str) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (str.length != 4) throw new MyArraySizeException();
        if (str[0].length != 4) throw new MyArraySizeException();
        for (int i=0; i < str.length; i++){
            for (int j=0; j < str[i].length; j++){
                try {
                    sum += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В массиве неправильное значение в ячейке: [" + (i+1) + "][" + (j+1) + "].");
                }
            }
        }
        System.out.println(sum);
    };

}
