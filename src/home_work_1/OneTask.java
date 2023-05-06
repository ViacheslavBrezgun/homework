//1.2.Использовать побитовые И и ИЛИ с двумя числами введёнными через консоль.
//1.3 В комментариях к каждой операции написать двоичный код (8 бит) двух, любых, выбранными вами чисел и результата операций с ними.
//1.4 Попробуйте сделать побитовую операцию с числом 42.5, опишите результат в комментариях в классе с заданием.
package home_work_1;

import java.util.Scanner;

public class OneTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        System.out.println("Введитe первое число ");
        number1 = scanner.nextInt();    //2  00000010
        System.out.println("Введитe второе число ");
        number2 = scanner.nextInt();    //3  00000011
        System.out.println(" Вы ввели числа   " + number1 + " и " + number2);
        int result1 = number1 & number2;//результат 00000010
        System.out.println("Результат побитовой операции И: " + result1);
        //System.out.println("Результат побитовой операции И в двоичном виде: " + Integer.toBinaryString(result1));
        int result2 = number1 | number2;
        System.out.println("Результат побитовой операции ИЛИ " + result2);
        //System.out.println("В двоичном виде: " + Integer.toBinaryString(result2));
        scanner.close();
        //решение задачи п.1.4
        double x = 42.5;
        //  double res = x|1;//ошибка компиляции - java: bad operand types for binary operator '|'
        // -неверные типы операндов для бинарного оператора '|'
        // битовые операции определены только для целочисленных типов и не могут применяться к вещественным числам.
        // int res = x | 1; //ошибка компиляции //bad operand types for binary operator '|'
        // - при определении типа результата int также возникает ошибка
        int res = (int) x | 1;//при явном приведении типов побитовая операция выполняется
        System.out.println("Результат побитового ИЛИ с числом 42.5: " + res);
    }


}



