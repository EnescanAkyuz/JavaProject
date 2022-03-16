import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Kutuphane extends Menu {
	int deger;
	Scanner kutupsc = new Scanner(System.in);
	public void KutupOkuma() throws IOException, InterruptedException {

		System.out.println("\n******Oyunlarýn******");
		File file = new File("C:\\Users\\enescan\\eclipse-workspace\\NewJavaProject\\texts\\Kutuphane.txt");
		FileReader fileReader = new FileReader(file);
		String line;

		BufferedReader br = new BufferedReader(fileReader);

		while ((line = br.readLine()) != null) {

		    System.out.println(line);

		}

		br.close();
		
		while(deger!=9) {
		System.out.println("Geri dönmek için 9'a basýnýz");
		deger = kutupsc.nextInt();
		if(deger==9) {
			Menuler();
		}
		}
			
	}

}

