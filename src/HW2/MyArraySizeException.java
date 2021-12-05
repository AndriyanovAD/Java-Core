package HW2;


import java.io.IOException;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Размер массива не соответствует ожидаемому значению!");
    }
}
