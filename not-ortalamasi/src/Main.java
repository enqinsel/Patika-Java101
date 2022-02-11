import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri Oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Değerleri Al
        System.out.print("Matematik Notunu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunu Giriniz: ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam / 6;

        boolean sonuc = ort > 60;

        String str = sonuc ? "Sınıfı Geçtiniz" : "Kaldınız";

        System.out.print(str);

    }
}
