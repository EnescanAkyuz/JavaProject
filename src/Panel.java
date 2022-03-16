import java.util.Scanner;

public class Panel {
Scanner giris = new Scanner(System.in);
	
	public void Giris() throws InterruptedException {
		System.out.println("Lütfen sifrenizi giriniz: ");
		String sifre = giris.nextLine();
		if(sifre.equals("123456")) {
			System.out.println("\nGiriþ Yapýldý\n");
			Thread.sleep(400);
			
			
		}
		else{
			System.out.println("Þifre yanlýþ, tekrar deneyiniz");
			Thread.sleep(400);
			Giris();
	    }
	}
}
