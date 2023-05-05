//4.1 Определить нечётное число
package Home_Work_1.FourTask;

public class FourTask1 {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("нечетное Число " + i);
            }
        }
    }
}