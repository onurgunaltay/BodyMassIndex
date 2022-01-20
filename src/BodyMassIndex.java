
import java.util.Scanner;


public class BodyMassIndex {
    public static void main(String[] args) {

        /* Kullanıcıdan Boy ölçüsünü m cinsinden girmesini isteyelim
         * Kullanıcıdan Kilo ağırlığını kg cinsinden girmesini isteyelim
         */

        Scanner input = new Scanner(System.in);

        double lenght, weight;
        double index;

        System.out.print("Boyunuzu m cınsınden giriniz :");
        lenght = input.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz :");
        weight = input.nextDouble();

        index = weight / (lenght * lenght);

        System.out.print("Vücut Kitle İndeksiniz :" + index);


    }
}
