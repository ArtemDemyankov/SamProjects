package task7;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static java.lang.StrictMath.random;

public class Task7 {
    public static void execute() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int num = (int) (random() * 4 + 1);

        switch (num) {
            case 1: {
                throw new NullPointerException();
            }
            case 2: {
                throw new ArithmeticException();
            }
            case 3: {
                throw new FileNotFoundException();
            }
            case 4: {
                throw new URISyntaxException("input", "reason");
            }
        }
    }
}
