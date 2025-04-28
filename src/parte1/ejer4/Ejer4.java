package parte1.ejer4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {

		try (BufferedWriter in = new BufferedWriter(new FileWriter("src\\parte1\\ejer4\\texto", true))) {
			Scanner reader = new Scanner(System.in);
			
			String frase;
			
			do {
			System.out.println("Hablame de tu vida");
			frase = reader.nextLine();
			
			in.write(frase);
			in.newLine();
			in.flush();
			} while (!frase.endsWith("fin"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
