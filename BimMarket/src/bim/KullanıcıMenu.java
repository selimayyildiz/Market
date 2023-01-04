package bim;

import java.util.Scanner;

public class KullanıcıMenu extends Main implements IMenu {

    @Override
    public void menu() {
        secenek = -1;
        while (secenek != 0) {
            System.out.println("\n\nHosgeldiniz: " + kullanıcıBilgileri.get(girisId).getIsim() + " " + kullanıcıBilgileri.get(girisId).getSoyisim());
            System.out.println("\n1-) Hesap Bilgilerini Goruntule");
            System.out.println("2-) Hesaba Bakiye Yukle");
            System.out.println("3-) Urunlere Goz At");
            System.out.println("4-) Sepeti Goruntule");
            System.out.println("5-) Ana Menuye Geri Don");
            System.out.println("6-) Uygulamadan Cikis yap");

            System.out.println("\nLutfen yapmak istediğiniz islemi seciniz -> ");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    System.out.println("\n***Hesap Bilgilerim***");
                    System.out.println("Isim: " + kullanıcıBilgileri.get(girisId).getIsim());
                    System.out.println("Soyisim: " + kullanıcıBilgileri.get(girisId).getSoyisim());
                    System.out.println("Telefon: " + kullanıcıBilgileri.get(girisId).getTelefon());
                    System.out.println("Email: " + kullanıcıBilgileri.get(girisId).getEmail());
                    System.out.println("Bakiye: " + kullanıcıBilgileri.get(girisId).getBakiye());
                    break;

                case 2:
                    int yükle;
                    String kartNo, cvv, kartTarih;
                    System.out.println("\n\nYukleme yapilacak kartin bilgilerini giriniz...");
                    System.out.print("Kart Numarasi: ");
                    kartNo = scanner.next();
                    System.out.print("Kart CVV: ");
                    cvv = scanner.next();
                    System.out.print("Kart Son Kullanma Tarihi: ");
                    kartTarih = scanner.next();
                    System.out.print("Yukleme yapilacak tutar: ");
                    yükle = scanner.nextInt();
                    kullanıcıBilgileri.get(girisId).paraYükle(yükle);
                    System.out.println("Yukleme Basarili...");
                    break;

                case 3:
                    new ÜrünListesi().ürünListesi();
                    System.out.println("0'dan kucukk karakter girerseniz urun ekleme sona erer ");
                    System.out.println("Sepetinize eklemek istediginiz urunun Id numarasini giriniz: ");
                    int a=1;
                    while(a>0) {
                    	int ürünId = scanner.nextInt();
                    	if(ürünId>-1) {
                    		sepet.get(girisId).sepetEkle(ürünId);
                    		System.out.println("Secmis oldugunuz urun sepetinize eklenmistir...");
                    	}
                    	else {
                    		System.out.println("urun ekleme islemi sona ermistir...");
                    		a--;
                    	}
                    }
                    secenek = -1;
                    break;

                case 4:
                    System.out.println("\n***Sepet***\n");
                    System.out.println("1- Sepeti Goruntule");
                    System.out.println("2- Urunn Kaldir");
                    System.out.println("3- Alisverisi Bitir");
                    System.out.println("0- Geri Don");
                    System.out.print("\nLutfen yapmak istediginiz islemin numarasini giriniz ->");
                    secenek = scanner.nextInt();

                    if (secenek == 1) {
                        sepet.get(girisId).sepetListesi();
                        System.out.println("toplam : " + sepet.get(girisId).toplam()+"tl");
                    } else if (secenek == 2) {
                        sepet.get(girisId).sepetListesi();
                        System.out.println("Kaldırmak istediğiniz ürünün Idsini giriniz -> ");
                        int urunId = scanner.nextInt();
                        sepet.get(girisId).sepetUrunleri.remove(urunId);
                    } else if (secenek == 3) {
                    	if(kullanıcıBilgileri.get(girisId).getBakiye() > sepet.get(girisId).toplam()){
                    		kullanıcıBilgileri.get(girisId).paraÇek(sepet.get(girisId).toplam());
                    		System.out.println("Alısveris basariyla gerceklesmistir...");
                            sepet.get(girisId).sepetUrunleri.clear();
                    	}
                    	else {
                    		System.out.println("Yetersiz Bakiye...");
                    	}
                    }
                    secenek = -1;
                    break;
                case 5:
                    secenek = 0;
                    break;
                case 6:
                    System.out.println("Bizi Tercih Ettiğiniz Icin Tesekkur Ederiz...");
                    System.exit(0);
                    break;
            }


        }
    }

}