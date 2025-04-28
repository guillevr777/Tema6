package parte1.ejer6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		String numeros;
		int numero;

		try (BufferedReader in = new BufferedReader(new FileReader("src\\parte1\\ejer6\\LeerNumero"))) {
			
			numeros = in.readLine();
			
			while (numeros != null) {
			
			numero = Integer.parseInt(numeros);
			lista.add(numero);
			numeros = in.readLine();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		
		try (BufferedWriter in = new BufferedWriter(new FileWriter("src\\parte1\\ejer6\\EscribirNumero", true))) {
			
			for (Integer a : lista) {
				numero = a;
				
				in.write(String.valueOf(numero));
				in.newLine();
				in.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
