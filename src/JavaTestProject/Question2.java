package JavaTestProject;

import java.util.Arrays;
import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("========정렬전========");
        System.out.println( Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("========정렬후========");
        System.out.println(Arrays.toString(array));
    }
}
