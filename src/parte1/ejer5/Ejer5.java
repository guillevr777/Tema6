package parte1.ejer5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		try (BufferedWriter in = new BufferedWriter(new FileWriter("src\\parte1\\ejer5\\CadenasTexto", true))) {
			Scanner reader = new Scanner(System.in);
			
			String nombre;
			int edad;
			
			System.out.println("Introduzca nombre");
			nombre = reader.nextLine();
			
			System.out.println("Introduzca edad");
			edad = reader.nextInt();
			
			in.write(nombre + " " + edad);
			in.newLine();
			in.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
