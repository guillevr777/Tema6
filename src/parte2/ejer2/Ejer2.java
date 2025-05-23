package parte2.ejer2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer2 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String linea;
		String firma;
		
		// Metodo para escribir
				try (BufferedWriter in = new BufferedWriter(new FileWriter("src\\parte2\\ejer2\\Firmas", true))) {
					
					System.out.println("Haz tu firma:");
					firma = reader.nextLine();
					
					in.write(firma);
					in.newLine();
					in.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		// Metodo para leer
		try (BufferedReader in = new BufferedReader(new FileReader("src\\parte2\\ejer2\\Firmas"))) {
			
			linea = in.readLine();
			
			while (linea != null) {
			
			System.out.println("\nFirma :" + linea);
				
			linea = in.readLine();
			
			}
			
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
