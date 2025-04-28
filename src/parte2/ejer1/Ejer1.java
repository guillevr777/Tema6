package parte2.ejer1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer1 {

	public static void main(String[]args) {
		
		String linea;
		int caracteres = 0;
		int lineas = 0;
		int palabras = 0;
		
		try (BufferedReader in = new BufferedReader(new FileReader("src\\parte2\\ejer1\\Carta"))) {
			
			linea = in.readLine();
			
			while (linea != null) {
			
			lineas ++;
			caracteres += linea.length();
			palabras += linea.split(" ").length;
			
			linea = in.readLine();
			
			}
			
		} catch (FileNotFoundException e) {
			FileWriter f;
			try {
				f = new FileWriter("src\\parte2\\ejer1\\Carta");
				f.close();
			} catch (IOException e1) {
				System.out.println("Error al crear el fichero " + e1.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error al leer el fichero " + e.getMessage());
		}
		
		System.out.println("Lineas :" + lineas + "\nCaracteres :" + caracteres + "\nPalabras :" + palabras);
	}
}
