import java.io.IOException;

import java.util.Scanner;

public class Magaza extends Menu {
	int deger;
	int secim;
	
	Scanner kutupsc = new Scanner(System.in);
	String[] dizi1 = {"Red Dead Redemption","PUBG","Forza Horizon 4","Among Us","Fall Guys",
			"Crysis","Bilardo 3D","Euro Truck"};
	int[] dizi2 = {200,100,120,60,21,62,12,9};
	String birim="TL";
	public void MagazaOkuma() throws IOException, InterruptedException {
		System.out.println("\n******MAÐAZA******");
		//System.out.println(bakiye);
		for (int i = 0; i < dizi1.length; i++) {
			System.out.printf("\n" + (i+1) + "-" + dizi1[i]);
		}
		
		System.out.println("\n\nSeçmek istediðiniz oyun?"+ " geri gelmek için 9'a basýn!\n");
		secim = kutupsc.nextInt();
		switch (secim) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			Oyunlar oyunlar = new Oyunlar(secim);
			oyunlar.RdrSatis();
			break;
		case 9:
			Menuler();
		default:
			Menuler();
		}
		
		while(deger!=9) {
		
		System.out.println("\nGeri dönmek için 9'a basýnýz");
		deger = kutupsc.nextInt();
		if(deger==9) {
			Menuler();
		}
		}
			
	}
	public int getSecim() {
		return secim;
	}
	public void setSecim(int secim) {
		this.secim = secim;
	}
	public Magaza(int secim) {
		super();
		this.secim = secim;
	}
	
	
}
