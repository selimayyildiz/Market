package bim;

public class ÜrünOlustur extends Main {
public void ürünOlustur() {
	String ürünAdi;
	int ürünStok;
	int ürünFiyat;
	System.out.println("\n ****URUN OLUSTURMA KISMINDASINIZ***\n");
    System.out.println("Urun Adi: ");
    ürünAdi =scanner.next(); 
    System.out.println("Urun Stok: ");
    ürünStok =scanner.nextInt();
    System.out.println("Urun Fiyat: ");
    ürünFiyat =scanner.nextInt();

    ürünler.add(new ÜrünBilgisi());
    ürünler.get(urunKayıtId).setÜrünAdi(ürünAdi);
    ürünler.get(urunKayıtId).setÜrünStok(ürünStok);
    ürünler.get(urunKayıtId).setÜrünFiyat(ürünFiyat);
    ürünler.get(urunKayıtId).setUrunId(urunKayıtId);
    urunKayıtId +=1;
    System.out.println("Urun Olusturuldu... ");

}
}
