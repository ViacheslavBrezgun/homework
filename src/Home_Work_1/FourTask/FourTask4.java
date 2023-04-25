//4.4 Перевести байты в килобайты или наоборот
package Home_Work_1.FourTask;

public class FourTask4 {
    public static void main(String[] args) {
        int myNumber = 100240;
        int kByte = myNumber / 1024;
        int Byte = myNumber * 1024;
        System.out.println("Байт: " + Byte + " килобайт: " + kByte);
    }
}
