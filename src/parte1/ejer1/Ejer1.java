package parte1.ejer1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[]args) {
		
		double suma = 0;
		double media;
		int cont = 0;
		
		try {
			Scanner reader = new Scanner(new FileReader("src\\parte1\\ejer1\\numeros"));
			
			while (reader.hasNextDouble()) {
				suma += reader.nextDouble();
				cont++;
			}
			media = suma / cont;
			System.out.println("Suma total " + suma);
			System.out.println("Media total " + media);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el numerin" + e);
		}
	}
}
