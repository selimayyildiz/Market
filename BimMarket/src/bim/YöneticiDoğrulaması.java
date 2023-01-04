package bim;

import java.util.ArrayList;

public class YöneticiDoğrulaması {
	private String yöneticiKullaniciAdi;
    private String yöneticiSifre;

    YöneticiDoğrulaması(String yöneticiKullaniciAdi, String yöneticiSifre) {
        this.yöneticiKullaniciAdi = yöneticiKullaniciAdi;
        this.yöneticiSifre = yöneticiSifre;
    }

    public boolean girisDoğrulamasi(ArrayList<YöneticiBilgisi> yöneticiBilgisi) {
        for (YöneticiBilgisi yönetici : yöneticiBilgisi) {
            if (yönetici.getYöneticiKullaniciAdi().equals(yöneticiKullaniciAdi) && yönetici.getYöneticiSifre().equals(yöneticiSifre)) {
                return true;
            }
        }
        return false;
    }

    public int yöneticiGirisId(ArrayList<YöneticiBilgisi> yöneticiBilgisi) {
        for (YöneticiBilgisi yönetici : yöneticiBilgisi) {
            if (yönetici.getYöneticiKullaniciAdi().equals(yöneticiKullaniciAdi) && yönetici.getYöneticiSifre().equals(yöneticiSifre)) {
                return yönetici.getYöneticiId();
            }
        }
        return 0;
    }
}
