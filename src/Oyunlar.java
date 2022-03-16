import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Oyunlar extends Magaza{
	public Oyunlar(int secim) {
		super(secim);
		// TODO Auto-generated constructor stub
	}

	Scanner oyunsc = new Scanner(System.in);
	String Rdr;
	String str;
	int secim1;
	
	
	public void appendStrToFile(String fileName, String str) throws InterruptedException {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
			out.newLine();
			out.write(str);
			System.out.println("\nOyun Eklendi\n");
			Thread.sleep(400);
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("error " + e);
		}
	}
	
	public void Control() throws IOException, InterruptedException  {
		if(bakiye>=dizi2[secim-1]) {
			FileReader f = new FileReader("C:\\Users\\enescan\\eclipse-workspace\\NewJavaProject\\texts\\Kutuphane.txt");
			BufferedReader in = new BufferedReader(f);

			String[] line = new String[9];

			int i=0;

			while((line[i]=in.readLine())!=null)
			{
				if (line[i].equals(dizi1[secim-1])) {
					//System.out.println(line[i]);
					System.out.println("\nZaten sahipsin!\n");
					Thread.sleep(500);
					MagazaOkuma();
					}
			i++;
			}

			f.close();

			}
		else {
			System.out.println("YETERSÝZ BAKÝYE!");
			Thread.sleep(200);
			MagazaOkuma();
		}
		}

	public void Ekleme() throws InterruptedException {
		String str1 = dizi1[secim-1]; 
		appendStrToFile("C:\\Users\\enescan\\eclipse-workspace\\NewJavaProject\\texts\\Kutuphane.txt", str1);
		bakiye = bakiye - dizi2[secim-1];
	}
	
	public void RdrSatis() throws IOException, InterruptedException {
		System.out.println("Oyun Adý: " + dizi1[secim-1] + "\n" + "Fiyat: " + dizi2[secim-1]);
		System.out.println("\nAlmak için 1'e basýnýz,geri gelmek için 9'a basýnýz\n");
		secim1 = oyunsc.nextInt();
		switch (secim1) {
		case 1:
			Control();
			Ekleme();
				
		case 9:
			MagazaOkuma();
			break;
		default:
			break;
		}
	}
	
	
}
