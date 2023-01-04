package bim;

import java.util.ArrayList;

public class Sepet extends Main {
    ArrayList<ÜrünBilgisi> sepetUrunleri = new ArrayList<>();
    public void sepetListesi() {
        for (ÜrünBilgisi ürünBilgisi : sepetUrunleri) {
        	int a=0;
            System.out.println("Urun ID : " + a);
            System.out.println("Urun adi : " + ürünBilgisi.getÜrünAdi());
            System.out.println("Urun fiyat : " + ürünBilgisi.getÜrünFiyat());
            a++;
            System.out.println();
        }
    }

    public int toplam() {
        int total=0;
        for (ÜrünBilgisi ürünBilgisi:sepetUrunleri) {
            total+=ürünBilgisi.getÜrünFiyat();
        }
        return total;
    }

    public void sepetEkle(int urunId) {
        sepetUrunleri.add(new ÜrünBilgisi(ürünler.get(urunId).getÜrünAdi(),ürünler.get(urunId).getÜrünFiyat()));
        ürünler.get(urunId).setÜrünStok(ürünler.get(urunId).getÜrünStok()-1);
    }


}
