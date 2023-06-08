import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanıp değer atamalarının yapılması
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, kg, total=0;

        //Scanner sınıfı
        Scanner imp = new Scanner(System.in);

        //Kullanıcıdan değerleri alıp ilgili değişkenlere aktarılması
        System.out.print("Armut kaç kilo: ");
        kg = imp.nextDouble();
        total += kg * armut;
        System.out.print("Elma kaç kilo: ");
        kg = imp.nextDouble();
        total += kg * elma;
        System.out.print("Domates kaç kilo: ");
        kg = imp.nextDouble();
        total += kg * domates;
        System.out.print("Muz kaç kilo: ");
        kg = imp.nextDouble();
        total += kg * muz;
        System.out.print("Patlıcan kaç kilo: ");
        kg = imp.nextDouble();
        total += kg * patlican;

        //Nihai sonucun ekrana yazdırılması
        System.out.println("Toplam tutar: " + total);
    }
}