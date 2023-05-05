// 4.2 Среди трёх чисел найти среднее
package Home_Work_1.FourTask;
public class FourTask2 {
    public static void main(String[] args) {
        int a =0, b=-6, c=2;
        if((a>b&&a<c)||(a<b&&a>c)){
            System.out.println("Среднее число: "+a);
        }
        else if((b>a&&b<c)||(b<a&&b>c)){
            System.out.println("СРеднее число: "+b);
        }
        else if((c>a&&c<b)||(c<a&&c>b)){
            System.out.println("СРеднеее число : "+c);
        }
    }

}
