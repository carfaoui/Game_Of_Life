package demos;

import java.io.File;

import iteration2.FileLoad;
import iteration2.GameOfLife;

public class DemoIteration2 {

	void launch() {

		/**lecture de fichier data*/
		
		String dataFileName = "iteration2/data3x3";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gol = file.retrieveDataFromFile(file.getPath(dataFileName));

		int rowCount = gol.getDimension().getRow();
		int colCount = gol.getDimension().getCol();
		int evolutionCount = gol.getNumberOfEvolutions();

		/** création de grille initial à partir des données de fichier data */
		Boolean[][] grid = gol.createNewgrid(rowCount, colCount, gol.getGrid());
		gol.nextGeneration(rowCount, colCount, grid);

		/** simulateur de grille de dimension 3x3 Itération 2 */
	    gol.getGeneration(evolutionCount, rowCount, colCount, grid);
	}

}
