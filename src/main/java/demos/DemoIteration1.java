package demos;



import iteration1.FileLoad;
import iteration1.GameOfLife;

public class DemoIteration1 {
	public void launch() {
		/**lecture de fichier data*/	
		String dataFileName = "iteration1/data2x2";
		FileLoad file = new FileLoad();
		
		/**récupération des donnés depuis le fichier*/
		GameOfLife gol = file.retrieveDataFromFile(file.getPath(dataFileName));

		/** création de grille initial à partir des données de fichier data  */
		Boolean[][] grid = gol.createInitgrid(gol.getRowGrid(), gol.getColGrid(), gol.getGrid());
		gol.drawGrid(grid, 1);

		/** création de grille 2  à partir grille 1  */
		Boolean[][] grid1 = gol.createGridFromAnotherGrid(gol.getRowGrid(), gol.getColGrid(), grid);
		gol.drawGrid(grid1, 2);

		/** création de grille 3  à partir grille 2  */
		Boolean[][] grid2 = gol.createGridFromAnotherGrid(gol.getRowGrid(), gol.getColGrid(), grid1);
		gol.drawGrid(grid2, 3);

	}

}
