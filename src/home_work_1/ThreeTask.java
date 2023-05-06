package home_work_1;

//Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html).
// Отразить эксперименты в сданной домашней работе.
public class ThreeTask {
    public static void main(String[] args) {
        //Примеры работы с библиотекой Math
        int a = 16;
        System.out.println("Mетод sqrt возвращает квадратный корень числа " + a + " он будет равен: " + Math.sqrt(a));
        int x = 4, y = 2;
        System.out.println("Метод pow  возводит число x в степень y : " + Math.pow(x, y));
        System.out.println("Метод max возвращает большее из двух чисел x и y: " + Math.max(x, y));
        System.out.println("Метод random возвращает случайное число от 0 до 1: " + Math.random());
    }
}
