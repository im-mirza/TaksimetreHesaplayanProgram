import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        int km;
        double perKm=2.20,total, startPrice=10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km= sc.nextInt();

        total=km*perKm;
        total+=(total<20)?20:total;
        System.out.println("Toplam Tutar: "+total);
    }
}