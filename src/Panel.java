import java.util.Scanner;

public class Panel {
Scanner giris = new Scanner(System.in);
	
	public void Giris() throws InterruptedException {
		System.out.println("L�tfen sifrenizi giriniz: ");
		String sifre = giris.nextLine();
		if(sifre.equals("123456")) {
			System.out.println("\nGiri� Yap�ld�\n");
			Thread.sleep(400);
			
			
		}
		else{
			System.out.println("�ifre yanl��, tekrar deneyiniz");
			Thread.sleep(400);
			Giris();
	    }
	}
}
