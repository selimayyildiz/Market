package bim;

public class KullanıcıKayıt extends Main {
    boolean kontrol = true;

    public void kayit() {
        while (kontrol) {
            String kullaniciAdi;
            String sifre;
            String isim, soyisim, telefon, email;
            System.out.print("Kullanici Adi Giriniz: ");
            kullaniciAdi = scanner.next();
            System.out.print("Sifre Olusturunuz: ");
            sifre = scanner.next();
            if (new KullanıcıDoğrulaması(kullaniciAdi).kayitDoğrulamasi(kullanıcılar)) {
                System.out.println("Girmis oldugunuz kullanici adi daha onceden alinmistir, kayit islemine devam etmek için \"true\", ana menuye geri dönmek için \"false\" yaziniz -> ");
                kontrol = scanner.nextBoolean();
            } 
            else {
                kullanıcılar.add(new Kullanıcı());
                kullanıcılar.get(kayitId).setKullaniciAdi(kullaniciAdi);
                kullanıcılar.get(kayitId).setSifre(sifre);
                kullanıcılar.get(kayitId).setId(kayitId);
                kontrol = false;
                System.out.println("\nTebrikler basariyla hesap olusturdunuz...");
                kullanıcıBilgileri.add(new KullanıcıBilgileri());
                System.out.println("\nLutfen Kisisel Bilgilerinizi dogru bir sekilde giriniz...\n");
                System.out.print("Isim: ");
                isim=scanner.next();
                System.out.print("Soyisim: ");
                soyisim=scanner.next();
                System.out.print("Telefon Numarasi: ");
                telefon=scanner.next();
                System.out.print("Email: ");
                email=scanner.next();

                kullanıcıBilgileri.get(kayitId).setIsim(isim);
                kullanıcıBilgileri.get(kayitId).setSoyisim(soyisim);
                kullanıcıBilgileri.get(kayitId).setTelefon(telefon);
                kullanıcıBilgileri.get(kayitId).setEmail(email);
                sepet.add(new Sepet());
                kayitId++;
            }

        }
    }
}
