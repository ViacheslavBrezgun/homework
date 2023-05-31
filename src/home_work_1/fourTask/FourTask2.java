// 4.2 Среди трёх чисел найти среднее
package home_work_1.fourTask;
public class FourTask2 {
    int a = 0, b = -6, c = 2;

    public static void main(String[] args) {
//        int a = 0, b = -6, c = 2;
//        if ((a > b && a < c) || (a < b && a > c)) {
//            System.out.println("Среднее число: " + a);
//        } else if ((b > a && b < c) || (b < a && b > c)) {
//            System.out.println("СРеднее число: " + b);
//        } else if ((c > a && c < b) || (c < a && c > b)) {
//            System.out.println("СРеднеее число : " + c);
//        }
        System.out.println(sred(0,-6,2));
    }

    public static int sred(int a, int b, int c) {
        int sr=0;
        if ((a > b && a < c) || (a < b && a > c)) {
            sr=a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            sr=b;

        } else if ((c > a && c < b) || (c < a && c > b)) {
            sr=c;
        }
        return sr;
    }

}
