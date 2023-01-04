package bim;

public class KullanıcıBilgileri extends Kullanıcı {
    private String isim;
    private String soyisim;
    private String telefon;
    private String email;
    private int bakiye = 0;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void paraYükle(int yükle) {
    	bakiye += yükle;
    }

    public void paraÇek(int total) {
    	bakiye -= total;
    }
}
