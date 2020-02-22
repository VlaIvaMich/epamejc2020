package homeworks.HW_3_arrays.pyramidX;

import homeworks.utility.helper.CancellationException;
import homeworks.utility.helper.Helper;

public class PyramidX {

    public void run() {
        System.out.println(Helper.GREETING);
        int input = getUserInput();
        printPyramidX(input);
    }

    private int getUserInput() {
        int n = 0;

        try {
            n = Helper.getInt();
            Helper.closeReaderSilently();
        } catch (CancellationException ignored) {}

        return n;
    }

    private void printPyramidX(int n) {
        for (int i = n; i > 0; i--) {
            printLineX(i);
            System.out.println(" ");
        }
    }

    private void printLineX(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("x");
        }
    }
}