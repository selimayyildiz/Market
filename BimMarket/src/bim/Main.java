package bim;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Kullanıcı> kullanıcılar = new ArrayList<>();
    static ArrayList<ÜrünBilgisi> ürünler = new ArrayList<>();
    static ArrayList<Sepet> sepet = new ArrayList<>();
    static ArrayList<KullanıcıBilgileri> kullanıcıBilgileri = new ArrayList<>();

    static IMenu menu;
    static int girisId;
    static int kayitId = 0;
    static int secim=-1;
    static int urunKayıtId =0;
    static int secenek =-1;
	public static void main(String[] args) {
        MainMenu deneme = new MainMenu();
		deneme.menu();
	}
}
