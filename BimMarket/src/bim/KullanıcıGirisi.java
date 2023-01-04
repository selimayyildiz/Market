package bim;

public class KullanıcıGirisi extends Main {
	boolean kontrol = true;
	
	public void giris() {
		while(kontrol) {
			String kullaniciAdi;
            String sifre;
            System.out.println("Kullanici adi: ");
            kullaniciAdi = scanner.next();
            System.out.println("Sifre: ");
            sifre = scanner.next();
            
			if (new KullanıcıDoğrulaması(kullaniciAdi, sifre).girisDoğrulamasi(kullanıcılar)) {
				girisId = new KullanıcıDoğrulaması(kullaniciAdi, sifre).girisId(kullanıcılar);
                kontrol = false;
                System.out.println("Basariyla giris yaptiniz ,sisteme yonlendiriliyorsunuz lutfen bekleyiniz...");
                secenek = 0;
                
			}else{
            	System.out.println("Yanlis kullanici adi veya sifre girdiniz ,giris islemine devam etmek icin \"true\", ana menuye geri donmek için \"false\" yaziniz ->");
                kontrol = scanner.nextBoolean();
            }


		}
		
	}
}
