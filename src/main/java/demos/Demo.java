package demos;
/**
 * 
 * @author chaima_arfaoui
 *
 */

import java.io.IOException;

/**
 * Classe Demo pour l'affichage finale des Grilles on va afficher une simulation
 * d'une grille par Itération:
 * 
 * Itération 1 Grille 2x2 Itération 2 Grille 3x3 Itération 3 Grille 8x8
 * 
 */

public class Demo {
	public static void main(String[] args) throws IOException {

		// Iteration 1
		System.out.println("********Itération 1   2x2  ********************");
		new DemoIteration1().launch();

		// Iteration 2
		System.out.println("********Itération 2   3x3 ********************");
		new DemoIteration2().launch();

		// Iteration 3
		System.out.println("********Itération 3   8x8 ********************");
		new DemoIteration3().launch();

	}

}
