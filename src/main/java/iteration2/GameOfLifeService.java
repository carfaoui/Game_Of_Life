package iteration2;
/**
 * 
 * @author chaima_arfaoui
 *
 */


public interface GameOfLifeService {
	
	/**
	 * Créer une grille à partir de grille type GridMatrix
	 * GridMatrix : permet de creer une grille à partir de fichier data ( input file )
	 * @param x : row ,y : col
	 * @return boolean[][]
	 */
	boolean[][] createNewgrid(int x, int y,GridMatrix grid);

	
	/**
	 * Dessiner une grille avec le format ( +,-) et à partir de grid de type boolean [][] 
	 * @param generation nombre de géneration courante   
	 * @param grid 
	 *  
	 * 
	 */
	String drawGrid(boolean[][] grid,int generation);
	
	/**
	 * Vérifier toutes les  cellules de grille si elles sont mortes ou vivantes 
	 * @param row nombre de  ligne 
	 * @param col nombre de colonne  
	 * @param grid  
	 * @return boolean
	 */

	boolean isAlive(int row, int col, int x, int y, boolean[][] grid);
	/**
	 * Créer une grille  à partir de : 
	 *  grille inital + le nombre de ligne + nombre de colonne
	 * @param row nombre de  ligne 
	 * @param col nombre de colonne 
	 * @param grid 
	 * @return boolean[][] 
	 * 
	 */

	boolean[][] nextGeneration(int x, int y, boolean[][] grid);
	/**
	 * Créer  et Dessiner N  génération à partir  d'une grille 
	 *  + le nombre de ligne + nombre de colonne

	 * @param evolutionCount nombre d'évolution 
	 * @param row nombre de  ligne 
	 * @param col nombre de colonne 
	 * @param grid 
	 * @return boolean[][] 
	 * 
	 */

	void getGeneration(int generation, int x, int y, boolean[][] grid);

}
