package iteration2Test;

/**
 * 
 * @author chaima_arfaoui
 *
 */

import org.junit.Assert;
import org.junit.Test;

import iteration2.FileLoad;
import iteration2.GameOfLife;
import static Utils.Utils.*;

public class GameOfLifeIteration2Test {

	@Test
	public void launch_2x2_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration2/data2x2";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		int rowCount = gameOfLife.getDimension().getRow();
		int colCount = gameOfLife.getDimension().getCol();

		// récupération de grille initial
		boolean[][] grid = gameOfLife.createNewgrid(rowCount, colCount, gameOfLife.getGrid());
		String drawing2x2_0 = gameOfLife.drawGrid(grid, 0);
		Assert.assertEquals(drawing2x2_0, output2x2_1);
		// géneration 1
		boolean[][] grid2 = gameOfLife.nextGeneration(rowCount, colCount, grid);
		String drawing2x2_1 = gameOfLife.drawGrid(grid2, 1);
		Assert.assertEquals(drawing2x2_1, output2x2_2);
		// géneration 2
		boolean[][] nextGrid2 = gameOfLife.nextGeneration(rowCount, colCount, grid2);
		String drawing2x2_2 = gameOfLife.drawGrid(nextGrid2, 2);
		Assert.assertEquals(drawing2x2_2, output2x2_2);
	}

	@Test
	public void launch_2x3_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration2/data2x3";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		int row2x3 = gameOfLife.getDimension().getRow();
		int col2x3 = gameOfLife.getDimension().getCol();

		// géneration 0 (récupération de grille initial)
		boolean[][] grid2x3_0 = gameOfLife.createNewgrid(row2x3, col2x3, gameOfLife.getGrid());
		String drawing2x3_0 = gameOfLife.drawGrid(grid2x3_0, 0);
		Assert.assertEquals(drawing2x3_0, output2x3_0);

		// géneration 1
		boolean[][] grid = gameOfLife.nextGeneration(row2x3, col2x3, grid2x3_0);
		String drawing2x3_1 = gameOfLife.drawGrid(grid, 1);
		Assert.assertEquals(drawing2x3_1, output2x3_1);

		// géneration 2
		boolean[][] grid2x3_2 = gameOfLife.nextGeneration(row2x3, col2x3, grid);
		String drawing2x3_2 = gameOfLife.drawGrid(grid2x3_2, 2);
		Assert.assertEquals(drawing2x3_2, output2x3_2);
	}

	@Test
	public void launch_3x1_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration2/data3x1";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		int row3x1 = gameOfLife.getDimension().getRow();
		int col3x1 = gameOfLife.getDimension().getCol();

		// géneration 0 (récupération de grille initial)
		boolean[][] grid = gameOfLife.createNewgrid(row3x1, col3x1, gameOfLife.getGrid());
		String drawing3x1_0 = gameOfLife.drawGrid(grid, 0);
		Assert.assertEquals(drawing3x1_0, output3x1_0);

		// géneration 1
		boolean[][] grid3x1_1 = gameOfLife.nextGeneration(row3x1, col3x1, grid);
		String drawing3x1_1 = gameOfLife.drawGrid(grid3x1_1, 1);
		Assert.assertEquals(drawing3x1_1, output3x1_1);

		// géneration 2
		boolean[][] grid3x1_2 = gameOfLife.nextGeneration(row3x1, col3x1, grid3x1_1);
		String drawing3x1_2 = gameOfLife.drawGrid(grid3x1_2, 2);
		Assert.assertEquals(drawing3x1_2, output3x1_2);

	}

	@Test
	public void launch_3x2_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration2/data3x2";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		int rowCount = gameOfLife.getDimension().getRow();
		int colCount = gameOfLife.getDimension().getCol();

		// géneration 0 (récupération de grille initial)
		boolean[][] grid3x2_0 = gameOfLife.createNewgrid(rowCount, colCount, gameOfLife.getGrid());
		String drawing3x2_0 = gameOfLife.drawGrid(grid3x2_0, 0);
		Assert.assertEquals(drawing3x2_0, output3x2_0);

		// géneration 1
		boolean[][] grid3x2_1 = gameOfLife.nextGeneration(rowCount, colCount, grid3x2_0);
		String drawing3x2_1 = gameOfLife.drawGrid(grid3x2_1, 1);
		Assert.assertEquals(drawing3x2_1, output3x2_1);

		// géneration 2
		boolean[][] grid3x2_2 = gameOfLife.nextGeneration(rowCount, colCount, grid3x2_1);
		String drawing3x2_2 = gameOfLife.drawGrid(grid3x2_2, 2);
		Assert.assertEquals(drawing3x2_2, output3x2_2);
	}

	@Test
	public void launch_3x3_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration2/data3x3";
		FileLoad file = new FileLoad();

		/** récupération des donnés depuis le fichier */
		GameOfLife gameOfLife = file.retrieveDataFromFile(file.getPath(dataFileName));

		int row = gameOfLife.getDimension().getRow();
		int col = gameOfLife.getDimension().getCol();

		// géneration 0 (récupération de grille initial)
		boolean[][] grid = gameOfLife.createNewgrid(row, col, gameOfLife.getGrid());
		String drawing3x3_0 = gameOfLife.drawGrid(grid, 0);
		Assert.assertEquals(drawing3x3_0, output3x3_0);

		// géneration 1
		boolean[][] grid3x3_1 = gameOfLife.nextGeneration(row, col, grid);
		String drawing3x3_1 = gameOfLife.drawGrid(grid3x3_1, 1);
		Assert.assertEquals(drawing3x3_1, output3x3_1);

		// géneration 2
		boolean[][] grid3x3_2 = gameOfLife.nextGeneration(row, col, grid3x3_1);
		String drawing3x3_2 = gameOfLife.drawGrid(grid3x3_2, 2);
		Assert.assertEquals(drawing3x3_2, output3x3_2);

	}

}
