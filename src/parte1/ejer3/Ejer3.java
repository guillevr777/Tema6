package parte1.ejer3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer3 {
	
	public static void main(String[]args) {
		double mediaEdad = 0;
		double mediaSuma = 0;
		double edades = 0;
		double alturas = 0;
		String nombres = "";
		int cont = 0;
		String todo[];
		String linea;
		String nombre;
		int edad;
		double altura;
		
		try {
			BufferedReader out = new BufferedReader(new FileReader("src\\parte1\\ejer3\\Alumnos"));
			
			linea = out.readLine();
			
			while (linea != null) {
				todo = linea.split(" ");
				nombre = todo[0];
				edad = Integer.parseInt(todo[1]);
				altura = Double.parseDouble(todo[2]);
				
				nombres += nombre + " ";
				edades += edad;
				alturas += altura;
				cont++;
				
				linea = out.readLine();
			}
			mediaEdad = edades / cont;
			mediaSuma = alturas / cont; 
			System.out.println("Nombres : " + nombres);
			System.out.println("Suma total " + mediaEdad);
			System.out.println("Media total " + mediaSuma);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el numerin" + e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
