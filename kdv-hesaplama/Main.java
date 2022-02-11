import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double user, kdv , kdvUser;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fiyatı Giriniz: ");
        user = inp.nextDouble();

        double durum = (user >= 1000) ? 0.08 : 0.18;

        kdvUser = ((user * durum) + user);
        kdv = durum;

        System.out.println("KDV'siz Fiyat: " + "" + user + " TL");
        System.out.println("KDV'li Fiyat: " + "" + kdvUser + " TL");
        System.out.println("KDV Tutarı: " + "" + kdv);

    }
}
