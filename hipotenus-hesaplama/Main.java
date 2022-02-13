import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler

        int a,b;
        double c;

        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan veri alma
        System.out.print("1. kısa kenarı girin(a): ");
        a = inp.nextInt();

        System.out.print("2. kısa kenarı girin(b): ");
        b = inp.nextInt();

        //İşlemler

        c = Math.sqrt((a*a) + (b*b));

        System.out.print("Hipotenüs(c): " + c);
    }
}
