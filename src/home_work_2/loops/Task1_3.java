//. Возведение в степень. Через консоль пользователь вводит два числа.
// Первое число это число которое мы будем возводить, Второе число это степень в
// которую возводят первое число. Степень - только положительная и целая. Возводимое число -
// может быть отрицательным и оно будет дробным. Math использовать нельзя.
//		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        double x = sc.nextDouble();
        System.out.println(("введите степень возведения"));
        int stepen = sc.nextInt();
        double result = 1;
        //2^3=2*2*2
        for (int i = 0; i < stepen; i++) {
            result *= x;
        }
        System.out.println(x + "^" + stepen + "=" + result);
    }
}
