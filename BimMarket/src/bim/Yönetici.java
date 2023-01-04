package bim;

import java.util.ArrayList;

public class Yönetici {
	 static ArrayList<YöneticiBilgisi> yöneticiBilgisi = new ArrayList<>();
	    static int yöneticiGirisId;
	    public static void yönetici() {
	        yöneticiBilgisi.add(new YöneticiBilgisi());
	        yöneticiBilgisi.get(0).setYöneticiKullaniciAdi("admin");
	        yöneticiBilgisi.get(0).setYöneticiSifre("password");
	        yöneticiBilgisi.get(0).setYöneticiId(0);
	    }
}
