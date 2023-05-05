//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//       Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//       1.1.1. Используя только цикл
//       1.1.2.* Используя рекурсию
package home_work_2.loops;
public class Task1_1 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] array = new int[x];
        int res = 1;
        for (int i = 0; i < x; i++) {
            array[i] = i + 1;
            res = res * (i + 1);
            //while(array[i])

            System.out.print(array[i] + " * ");
            System.out.println(res);
        }
        System.out.println();
    }
}
