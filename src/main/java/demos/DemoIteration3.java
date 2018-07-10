package demos;



import iteration3.Beans.ExtractDataBean;
import iteration3.Beans.GameOfLifeBean;

public class DemoIteration3 {
	void launch() {

		/**lecture de fichier data*/
		
		String dataFileName = "iteration3/data8x8";
		ExtractDataBean extractDataBean = new ExtractDataBean();
		

		/** récupération des donnés depuis le fichier */
		GameOfLifeBean gol = extractDataBean.retrieveDataFromFile(extractDataBean.getPath(dataFileName));
		int rowCount = gol.getDimension().getRow();
		int colCount = gol.getDimension().getCol();
		int evolutionCount = gol.getNumberOfEvolutions();

		/** création de grille initial à partir des données de fichier data */
		boolean[][] grid1 = gol.createBooleanGridFromGridMatrix(rowCount, colCount, gol.getGrid());
		gol.getGeneration(evolutionCount,rowCount, colCount, grid1);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/** simulateur de grille de dimension 8x8 Itération 3 */
//		Boolean[][] grid2 =gol.nextGeneration(rowCount, rowCount, grid1);gol.drawGrid(grid2,2);
//		Boolean[][] grid3 =gol.nextGeneration(rowCount, rowCount, grid2);gol.drawGrid(grid3,3);
//		Boolean[][] grid4 =gol.nextGeneration(rowCount, rowCount, grid3);gol.drawGrid(grid4,4);
//		Boolean[][] grid5 =gol.nextGeneration(rowCount, rowCount, grid4);gol.drawGrid(grid5,5);
//		Boolean[][] grid6 =gol.nextGeneration(rowCount, rowCount, grid5);gol.drawGrid(grid6,6);
//		Boolean[][] grid7 =gol.nextGeneration(rowCount, rowCount, grid6);gol.drawGrid(grid7,7);
//		Boolean[][] grid8 =gol.nextGeneration(rowCount, rowCount, grid7);gol.drawGrid(grid8,8);
		
		
		
}}
