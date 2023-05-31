// 4.3 Проверка делимости одного числа на другое
package home_work_1.fourTask;
public class FourTask3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
//        if (a == 0) {
//            System.out.println("на ноль делить нельзя");
//        } else if (b % a != 0) {
//            System.out.println("не делится, результат");
//        } else {
//            System.out.println("делится,результат: " + (b / a));
//        }
    }
    public  boolean delit(int a,int b){
        boolean t=false;
        if (a == 0) {
            t=false;
        } else if (b % a != 0) {
            t=false;
        } else {
            t=true;
        }
        return t;
    }
}
