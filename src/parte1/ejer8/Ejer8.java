package parte1.ejer8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		HashSet<String> lista = new HashSet<String>();
		int opc;
		String linea;
		int dia;
		int mes;
		int año;
		int tempMaxima;
		int tempMinima;
		
		do {
			System.out.println("Elige opcion:\n1.Nueva Temperatura\n2.Mostrar Historial De Registros\n3.Salir");
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				try (BufferedWriter in = new BufferedWriter(new FileWriter("src\\parte1\\ejer7\\Temperaturas", true))) {
					
						System.out.println("Dime fecha actual , la temperatura minima y la maximam :");
						dia = reader.nextInt();
						reader.nextLine();
						mes = reader.nextInt();
						reader.nextLine();
						año = reader.nextInt();
						reader.nextLine();
						tempMaxima = reader.nextInt();
						reader.nextLine();
						tempMinima = reader.nextInt();
						reader.nextLine();

						in.write(año + "-" + mes + "-" + dia + "," + tempMinima + "," + tempMaxima);
						in.newLine();
						in.flush();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			case 2 -> {
				try (BufferedReader in = new BufferedReader(new FileReader("src\\parte1\\ejer7\\Contactos"))) {
					
					linea = in.readLine();
					
					while (linea != null) {
					
					System.out.println(linea);
					linea = in.readLine();
					}
				
				} catch (FileNotFoundException e) {
					FileWriter f;
					try {
						f = new FileWriter("src\\parte1\\ejer8\\Temperaturas");
						f.close();
					} catch (IOException e1) {
						System.out.println("Error al crear el fichero " + e1.getMessage());
					}
				} catch (IOException e) {
					System.out.println("Error al leer el fichero " + e.getMessage());
				}
			}
			case 3 -> {
				System.out.println("Tas salio del programa...");
			}
			}
		} while (opc != 3);
		
		// Cerramos el escaner
		reader.close();
	}
}
