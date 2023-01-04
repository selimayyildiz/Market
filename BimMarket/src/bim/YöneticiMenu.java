package bim;

import java.util.Scanner;

public class YöneticiMenu extends Main implements IMenu {
    @Override
    public void menu() {
        secenek = -1;
        while (secenek != 0) {
            System.out.println("\n ***Yonetici Menusu***\n");
            System.out.println("1-) Kayitli Hesaplari goruntule");
            System.out.println("2-) Urun Ekle");
            System.out.println("3-) Urun kaldir");
            System.out.println("4-) Ana menuye geri don");

            System.out.print("\nLutfen yapmak istediginiz islemi seciniz: ");
            secenek = scanner.nextInt();
            switch (secenek) {
                case 1:
                    new KullanıcıListesi().liste();
                    System.out.println("Devam etmek icin herhangi bir tusa basiniz...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
                case 2:
                	new ÜrünOlustur().ürünOlustur();
                    break;
                case 3:
                    System.out.println("Kaldirmak istediginiz urunun Id numarasini giriniz...");
                    int selection = new Scanner(System.in).nextInt();
                    ürünler.remove(selection);
                    break;
                case 4:
                    menu = new MainMenu();
                    menu.menu();
                    secenek = 0;
                    break;
                default:
                    break;
            }
        }
    }
}
