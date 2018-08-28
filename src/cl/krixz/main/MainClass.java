package cl.krixz.main;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cl.krixz.clases.Animal;
import cl.krixz.clases.Caballo;
import cl.krixz.clases.Perro;

public class MainClass {

	public static void main(String[] args) {
		
		/*	Scanner
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		*/
		
		// JOptionPane
		JFrame frame = new JFrame();
		String input = JOptionPane.showInputDialog(frame, "Qué tipo de animal quiere alimentarse?");

		
		Animal a;
		
		// *** el concepto de polimorfismo esta relacionado a clases abstractas ***
		
		switch(input) {
		case "caballo":	// desde Java 7 se puede usar String como argumentos
			a = new Caballo("silver", "pony");
			// POLIMORFISMO ---> método se llama igual
			a.alimentarse();
			break;
		case "perro":
			a = new Perro("cachilupi", "doberman");
			// POLIMORFISMO ---> método se llama igual
			a.alimentarse();
			break;
		default:
			System.out.println("No ha ingresado ningún animal valido");
		}
		
	}

}
