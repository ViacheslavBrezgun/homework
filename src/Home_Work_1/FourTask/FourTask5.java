//4.5 Буква или иной символ

package Home_Work_1.FourTask;

public class FourTask5 {
    public static void main(String[] args) {
        int res = (int) ('$');
        if (res >= 97 && res <= 122 || res >= 65 && res <= 90) {
            System.out.println("Под номером " + res + " записана буква");
        } else {
            System.out.println("Под номером " + res + " записан иной символ");
        }
    }
}
