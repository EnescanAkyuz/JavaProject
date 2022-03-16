import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menu extends Panel {
	Scanner menusc = new Scanner(System.in);
	int bakiye;
	String data;
	Scanner bakiyeal = new Scanner(System.in);
	
	
	
	public void Menuler() throws IOException, InterruptedException {
		System.out.println("*****MENÜ*****\n");
		System.out.println("1.Kütüphanem");
		System.out.println("2.Maðaza ");
		System.out.println("3.Cüzdan");
		System.out.println("4.Arkadaþlar");
		System.out.println("9.Çýkýþ\n");
		int menu = menusc.nextInt();
		switch(menu){
		case 1:
			Kutuphane kutuphane = new Kutuphane();
			kutuphane.KutupOkuma();

        case 2:
			Magaza magaza = new Magaza(menu);
			magaza.MagazaOkuma();
        case 3: 
        	//CuzdanMenu();

        case 4:

            break;
        case 9:
        	System.exit(0);
		default:
			System.out.println("Geçersiz seçim!");
			Thread.sleep(500);
			Menuler();
		}          
 }
	public void Para(int bakiye) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\enescan\\eclipse-workspace\\NewJavaProject\\texts\\Bakiye");
			data = data + bakiye;
			myWriter.write(data);
			myWriter.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace(); //hatanýn nerde olduðunu gösterme
		}

	}
	
	/*public void EldekiPara() throws IOException {
		try {
			File myobj = new File("C:\\Users\\enescan\\eclipse-workspace\\NewJavaProject\\texts\\Bakiye");
			Scanner myReader = new Scanner(myobj);
			while (myReader.hasNextLine	()) {
				data = myReader.nextLine();
				System.out.println(data);
				
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace();
		}

	
	}
	
	public void CuzdanMenu() throws InterruptedException, IOException {
		System.out.println("1-Bakiye Görüntüle");
		System.out.println("2-Para Yükle");
		System.out.println("Geri gelmek için 9'a basýn");
		System.out.println("Seçiminiz: ");
		int scsc = bakiyeal.nextInt();
		switch (scsc) {
		case 1:
			System.out.println("Cüzdandaki paranýz: ");
			EldekiPara();
			System.out.println("Geri gelmek için 9'a basýn");
			int scsc2 = bakiyeal.nextInt();
			if(scsc2==9) {
				CuzdanMenu();
			}
			else {
				CuzdanMenu();
			}
		case 2:
			System.out.println("Yüklemek istediðiniz tutar: ");
			int tutar = bakiyeal.nextInt();
			//bakiye = bakiye + tutar;
			Para(tutar);
			System.out.println("Para baþarýyla yüklendi");
			Thread.sleep(500);
			
			CuzdanMenu();
		case 9 :
			Menuler();
		default:
			break;
		}
	}*/
	
}
