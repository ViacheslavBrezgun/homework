//1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и
// вывести ход вычислений в консоль. Пользователь обязан ввести целое число.
// Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
//1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//        1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//        1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

package home_work_2.loops;

public class Task1_2 {
    public static void main(String[] args) {
        String s = args[0];

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("введено не число");
                break;
            } else if (s.contains(".") || s.contains(",")) {
                System.out.println("Введено не целое число");
                break;
            } else {
                int x = Integer.parseInt(args[0]);
                int y = x;
                int count = 0;

                while (y > 0) {
                    y = y / 10;
                    count++;
                }
                int[] array = new int[count];
                for (i = 0; i < count; i++) {
                    array[i] = x % 10;
                    x = x / 10;
//            System.out.print(array[i] + " ");
                }
                System.out.println(" ");
                int c = 1;
                for (i = array.length - 1; i >= 0; i--) {
                    System.out.print(array[i]);
                    if (i > 0) {
                        System.out.print("*");
                    }
                    c = array[i] * c;
                }
                System.out.println("=" + c);
                break;
            }
        }

    }
}


