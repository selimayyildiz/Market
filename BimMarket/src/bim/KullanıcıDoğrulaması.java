package bim;

import java.util.ArrayList;

public class KullanıcıDoğrulaması {
    private String kullaniciAdi;
    private String sifre;

    KullanıcıDoğrulaması(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    KullanıcıDoğrulaması(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public boolean girisDoğrulamasi(ArrayList<Kullanıcı> kullanıcılar) {
        for (Kullanıcı kullanıcı : kullanıcılar) {
            if (kullanıcı.getKullaniciAdi().equals(kullaniciAdi) && kullanıcı.getSifre().equals(sifre)) {
                return true;
            }
        }
        return false;
    }

    public int girisId(ArrayList<Kullanıcı> kullanıcılar) {
        for (Kullanıcı kullanıcı : kullanıcılar) {
            if (kullanıcı.getKullaniciAdi().equals(kullaniciAdi) && kullanıcı.getSifre().equals(sifre)) {
                return kullanıcı.getId();
            }
        }
        return 0;
    }

    public boolean kayitDoğrulamasi(ArrayList<Kullanıcı> kullanıcılar) {
        for (Kullanıcı kullanıcı : kullanıcılar) {
            if (kullanıcı.getKullaniciAdi().equals(kullaniciAdi)) {
                return true;
            }
        }
        return false;
    }
}
