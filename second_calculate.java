import java.util.Scanner;

public class SaniyeHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saniye değeri giriniz: ");
        int girilenSaniye = input.nextInt();
    
        int dakika = girilenSaniye / 60;
        int kalanSaniye = girilenSaniye % 60;

        System.out.println(girilenSaniye + " saniye " + dakika + " dakika " + kalanSaniye + " saniye ediyor.");



    }
}
