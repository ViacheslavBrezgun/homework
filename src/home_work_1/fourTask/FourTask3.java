// 4.3 Проверка делимости одного числа на другое
package Home_Work_1.FourTask;
public class FourTask3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        if (a == 0) {
            System.out.println("на ноль делить нельзя");
        } else if (b % a != 0) {
            System.out.println("не делится, результат");
        } else {
            System.out.println("делится,результат: " + (b / a));
        }
    }
}
