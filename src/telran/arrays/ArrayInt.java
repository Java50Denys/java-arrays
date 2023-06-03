package telran.arrays;

import java.util.Arrays;

public class ArrayInt {
public static int[] addNumber(int [] array, int number) {
    int[] res = Arrays.copyOf(array, array.length + 1);
    res[array.length] = number;
    return res;
}
}
