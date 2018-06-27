package iteration1Test;

/**
 * 
 * @author chaima_arfaoui
 *
 */

import org.junit.Assert;
import org.junit.Test;

import iteration1.FileLoad;
import iteration1.GameOfLife;
import static Utils.Utils.*;

public class GameOfLifeIteration1Test

{

	@Test
	public void launch_1x1_Test() {

		// lecture de fichier

		/** lecture de fichier */
		String dataFileName = "iteration1/data1x1";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		// création de grille initial à partir des données de fichier data
		Boolean[][] grid = gameOfLife.createInitgrid(gameOfLife.getRowGrid(), gameOfLife.getColGrid(),
				gameOfLife.getGrid());
		// grille num 1 (concaténation des tout lignes de grille 1 )
		String output1 = gameOfLife.drawGrid(grid, 1);
		Assert.assertEquals(output1, output1x1_1);

		// création de grille numéro 2 à partire de grid
		Boolean[][] grid2 = gameOfLife.createGridFromAnotherGrid(1, 1, grid);
		// grille num 2 (concaténation des tout lignes de grille 2 )
		String output2 = gameOfLife.drawGrid(grid2, 2);
		Assert.assertEquals(output2, output1x1_2);

	}

	@Test
	public void launch_1x2_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration1/data1x2";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		// création de grille initial à partir des données de fichier data
		Boolean[][] grid1 = gameOfLife.createInitgrid(gameOfLife.getRowGrid(), gameOfLife.getColGrid(),
				gameOfLife.getGrid());
		// grille num 1 (concaténation des tout lignes de grille 1 )
		String output1 = gameOfLife.drawGrid(grid1, 1);
		Assert.assertEquals(output1, output1x2_1);

		// création de grille 2 à partir de grille 1
		Boolean[][] grid2 = gameOfLife.createGridFromAnotherGrid(1, 2, grid1);
		// grille num 2 (concaténation des tout lignes de grille 2 )
		String output2 = gameOfLife.drawGrid(grid2, 2);
		Assert.assertEquals(output2, output1x2_2);

		// création de grille 3 à partir de grille 2
		Boolean[][] grid3 = gameOfLife.createGridFromAnotherGrid(1, 2, grid2);
		// grille num 3 (concaténation des tout lignes de grille 3 )
		String output3 = gameOfLife.drawGrid(grid3, 3);
		Assert.assertEquals(output3, output1x2_3);

	}

	@Test
	public void launch_2x1_Test() {

		// lecture de fichier

		/** lecture de fichier */
		String dataFileName = "iteration1/data2x1";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		// création de grille initial à partir des données de fichier data
		Boolean[][] grid = gameOfLife.createInitgrid(gameOfLife.getRowGrid(), gameOfLife.getColGrid(),
				gameOfLife.getGrid());
		// grille num 1 (concaténation des tout lignes de grille 1 )
		String output1 = gameOfLife.drawGrid(grid, 1);
		Assert.assertEquals(output1, output2x1_1);

		// création de grille numéro 2 à partire de grid
		Boolean[][] grid2 = gameOfLife.createGridFromAnotherGrid(2, 1, grid);
		// grille num 2 (concaténation des tout lignes de grille 2 )
		String output2 = gameOfLife.drawGrid(grid2, 2);
		Assert.assertEquals(output2, output2x1_2);

	}

	@Test
	public void launch_2x2_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration1/data2x2";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		// création de grille initial à partir des données de fichier data
		Boolean[][] grid1 = gameOfLife.createInitgrid(gameOfLife.getRowGrid(), gameOfLife.getColGrid(),
				gameOfLife.getGrid());
		// grille num 1 (concaténation des tout lignes de grille 1 )
		String output1 = gameOfLife.drawGrid(grid1, 1);
		Assert.assertEquals(output1, output2x2_1);

		// création de grille 2 à partir de grille 1
		Boolean[][] grid2 = gameOfLife.createGridFromAnotherGrid(2, 2, grid1);
		// grille num 2 (concaténation des tout lignes de grille 2 )
		String output2 = gameOfLife.drawGrid(grid2, 2);
		Assert.assertEquals(output2, output2x2_2);

		// création de grille 3 à partir de grille 2
		Boolean[][] grid3 = gameOfLife.createGridFromAnotherGrid(2, 2, grid2);
		// grille num 3 (concaténation des tout lignes de grille 3 )
		String output3 = gameOfLife.drawGrid(grid3, 3);
		Assert.assertEquals(output3, output2x2_2);

	}

}
