package bim;

public class KullanıcıListesi extends Main {
	   public void liste() {
	        for (Kullanıcı kullanıcı : kullanıcılar) {
	            System.out.println("Id: " + kullanıcı.getId());
	            System.out.println("Kullanici adi: " + kullanıcı.getKullaniciAdi());
	            System.out.println("sifre: " + kullanıcı.getSifre());
	            System.out.println("\n");
	        }
	    }
}
