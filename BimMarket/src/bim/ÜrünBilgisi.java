package bim;

public class ÜrünBilgisi extends Main{
	int urunId;
	private String ürünAdi;
	private int ürünFiyat;
	private int ürünStok;

	public ÜrünBilgisi(int urunId, String ürünAdi, int ürünFiyat, int ürünStok) {
		this.urunId = urunId;
		this.ürünAdi = ürünAdi;
		this.ürünFiyat = ürünFiyat;
		this.ürünStok = ürünStok;
	}

	public ÜrünBilgisi(String ürünAdi, int ürünFiyat) {
		this.ürünAdi = ürünAdi;
		this.ürünFiyat = ürünFiyat;
	}

	public ÜrünBilgisi() {

	}

	public int getUrunId() {
		return urunId;
	}

	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}

	public String getÜrünAdi() {
		return ürünAdi;
	}
	public void setÜrünAdi(String ürünAdi) {
		this.ürünAdi = ürünAdi;
	}
	public int getÜrünFiyat() {
		return ürünFiyat;
	}
	public void setÜrünFiyat(int ürünFiyat) {
		this.ürünFiyat = ürünFiyat;
	}
	public int getÜrünStok() {
		return ürünStok;
	}
	public void setÜrünStok(int ürünStok) {
		this.ürünStok = ürünStok;
	}
}