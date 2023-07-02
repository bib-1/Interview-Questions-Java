package Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] arrays = {1,4,3,5,6,7,8,9,2};

        System.out.println(Arrays.toString(arrays));

        Arrays.sort(arrays);

        System.out.println(arrays[arrays.length-1] * arrays[arrays.length -2]);
    }
}
