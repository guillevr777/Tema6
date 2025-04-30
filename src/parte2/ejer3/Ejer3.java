package parte2.ejer3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String linea;
		String firma = null;
		int cont = 0;
		
		// Metodo para escribir
		try (BufferedWriter in = new BufferedWriter(new FileWriter("src\\parte2\\ejer3\\Documento", true))) {
				
				System.out.println("Haz tu firma:");
				firma = reader.nextLine();
				
				in.write(firma);
				in.newLine();
				in.flush();
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
	
		// Metodo para leer
		try (BufferedReader in = new BufferedReader(new FileReader("src\\parte2\\ejer3\\Documento"))) {
			
			do {
			
			for (int i = 0 ; i < 24 ; i++ ) {
			linea = in.readLine();
			
			System.out.println(linea);
				
			linea = in.readLine();
			
			i++;
			}
			
			System.out.println("Pulsa S para salir o continua leyendo:");
			firma = reader.nextLine();
			
		} while (!firma.equalsIgnoreCase("S"));
			
		} catch (FileNotFoundException e) {
			FileWriter f;
			try {
				f = new FileWriter("src\\parte2\\ejer2\\Firmas");
				f.close();
			} catch (IOException e1) {
				System.out.println("Error al crear el fichero " + e1.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error al leer el fichero " + e.getMessage());
		}
		
		reader.close();
	}
}
