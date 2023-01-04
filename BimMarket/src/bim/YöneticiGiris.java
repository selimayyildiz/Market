package bim;

import java.util.Scanner;

public class YöneticiGiris extends Yönetici{
    Scanner scanner = new Scanner(System.in);

    public boolean yöneticiGiris() {
        yönetici();
       
        String yöneticiKullaniciAdi;
        String yöneticiSifre;
        System.out.print("Kullanici Adi: ");
        yöneticiKullaniciAdi = scanner.next();
        System.out.print("Sifre: ");
        yöneticiSifre = scanner.next();
        
        if (new YöneticiDoğrulaması(yöneticiKullaniciAdi, yöneticiSifre).girisDoğrulamasi(yöneticiBilgisi)) {
        	yöneticiGirisId = new YöneticiDoğrulaması(yöneticiKullaniciAdi, yöneticiSifre).yöneticiGirisId(yöneticiBilgisi);
        	System.out.println("\nYonetici girisi Basarili...");
            return true;
        }
        else {
        	System.out.println("\nYonetici Girisi Basarisiz...");
        	System.exit(0);

            return false;
        }
    }
}