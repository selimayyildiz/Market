package bim;
import java.util.Scanner;
public class MainMenu extends Main implements IMenu{
    @Override	        
	public void menu() {
    	secenek=-1;	
		while(secenek !=0) {
			System.out.println("\n***Bim A.S.'ye Hos Geldiniz***\n");
            System.out.println("[1] Giris Yap");
            System.out.println("[2] Kayit Ol");
            System.out.println("[3] Cikis Yap");
			System.out.print("Lutfen yapmak istediginiz islemi giriniz: ");
            secenek= scanner.nextInt();
            switch(secenek) {
            	case 1:
            		System.out.println("\n***Giris Yapiniz***\n");
            		new KullanıcıGirisi().giris();
                    menu = new KullanıcıMenu();
                    menu.menu();
                    secenek=-1;
                    break;
            	case 2:
                    System.out.println("\n***Kayit Yapiniz***\n");
                    new KullanıcıKayıt().kayit();
                    System.out.println("Ana menuye yonlendiriliyorsunuz...");
            		secenek=-1;
            		break;
            	case 3:
            		System.out.println("\nCikis Yapiliyor\n");
            		secenek=0;
            		break;
            	case 0:
            		new YöneticiGiris().yöneticiGiris();
                    menu = new YöneticiMenu();
                    menu.menu();
            		secenek=-1;

            		break;
        		default:
        			System.out.println("\nHatali sayi girdiniz. Tekrardan deneyiniz.\n");
        			secenek=-1;
        			
            }
		}
	}
}
