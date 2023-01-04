package bim;

public class ÜrünListesi extends Main {
    public void ürünListesi(){
        System.out.println("****** URUNLER ******");
        for(ÜrünBilgisi ürünler: ürünler)
        {
            System.out.println("\nUrun Adi: "+ürünler.getÜrünAdi());
            System.out.println("Urun Fiyat: "+ürünler.getÜrünFiyat()+" tl");
            System.out.println("Urun Id: "+ ürünler.getUrunId());
            System.out.println("Urun Stok: " + ürünler.getÜrünStok()+" adet");
            System.out.println("\n********************");

        }
    }
}
