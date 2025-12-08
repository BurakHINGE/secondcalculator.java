import java.util.Scanner;

public class SaniyeHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saniye değeri giriniz: ");
        int girilenSaniye = input.nextInt();
    
        int saat = girilenSaniye / 3600;
        int saattenKalanSaniye = girilenSaniye % 3600;
        int dakika = saattenKalanSaniye / 60;
        int dakikadanKalanSaniye = saattenKalanSaniye % 60;
        int kalanSaniye = dakikadanKalanSaniye;
        
        

        System.out.println(girilenSaniye + " saniye " + saat + " saat " + dakika + " dakika " + kalanSaniye + " saniye ediyor.");



    }
}
