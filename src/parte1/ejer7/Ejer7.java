package parte1.ejer7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		HashSet<String> lista = new HashSet<String>();
		int opc;
		String linea;
		String nombre;
		int numero;
		
		do {
			System.out.println("Elige opcion:\n1.Nuevo Contacto\n2.Buscar por Nombre\n3.Mostrar Todo\4.Salir");
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				try (BufferedWriter in = new BufferedWriter(new FileWriter("src\\parte1\\ejer7\\Contactos", true))) {
					
						System.out.println("Dime tu nombre y tu numero:");
						nombre = reader.nextLine();
						numero = reader.nextInt();
						reader.nextLine();

						in.write(nombre + " " + numero);
						in.newLine();
						in.flush();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			case 2 -> {
				System.out.println("Dime el nombre del contacto:");
				nombre = reader.nextLine();
				
				try (BufferedReader in = new BufferedReader(new FileReader("src\\parte1\\ejer7\\Contactos"))) {
					
					linea = in.readLine();
					
					while (linea != null) {
					
					if (linea.contains(nombre)) {
					System.out.println(linea);
					}
					
					linea = in.readLine();
					}
					
				} catch (IOException e) {
					System.out.println(e);
				}
			}
			case 3 -> {
				try (BufferedReader in = new BufferedReader(new FileReader("src\\parte1\\ejer7\\Contactos"))) {
					
					linea = in.readLine();
					
					while (linea != null) {
					
					System.out.println(linea);
					linea = in.readLine();
					}
				
				} catch (FileNotFoundException e) {
					FileWriter f;
					try {
						f = new FileWriter("src\\parte1\\ejer7\\Contactos");
						f.close();
					} catch (IOException e1) {
						System.out.println("Error al crear el fichero " + e1.getMessage());
					}
				} catch (IOException e) {
					System.out.println("Error al leer el fichero " + e.getMessage());
				}
			}
			case 4 -> {
				System.out.println("Tas salio del programa...");
			}
			}
		} while (opc != 4);
	}
}
