package iteration2;
/**
 * 
 * @author chaima_arfaoui
 *
 */



import iteration2.GridMatrix.GridArray;

public class GameOfLifeServiceImpl implements GameOfLifeService {


	private static final String ALIVE = "+";
	private static final char ALIVE_CHAR = '+';
	private static final String DEAD = "-";
	private static final char DEAD_CHAR = '-';
	private static final String OUTPOUT_CONSOLE="E";
	
	
	// Contient la logique du scénario de départ.
	// Quelles cellules sont vivantes ou mortes dans la génération 0?
	
	@Override
	public boolean[][] createNewgrid(int x, int y, GridMatrix grid) {

		boolean[][] newgrid = new boolean[x][y];
		int row = -1, col = 0;

		for (GridArray gridArray : grid.getGridArray()) {
			row++;
			col = 0;
			for (boolean gridArray1 : gridArray.array) {
				newgrid[row][col] = gridArray1;
				col++;
			}
		}

		return newgrid;
	}


	@Override
	public String drawGrid(boolean[][] grid,int generation) {
		StringBuilder outputConsole = new StringBuilder();
		System.out.println(OUTPOUT_CONSOLE+generation);
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				// System.out.println("E" + row);
				System.out.print(grid[row][col] ? ALIVE_CHAR : DEAD_CHAR);
				System.out.print(' ');

				if (grid[row][col] == true) {
					outputConsole.append(ALIVE);
				} else {
					outputConsole.append(DEAD);
				}

			}

			System.out.println();
		}
		return outputConsole.toString();

	}

	@Override
	public boolean isAlive(int row, int col, int x, int y, boolean[][] grid) {

		int liveCount = 0;
		boolean cellCurrentlyAlive = grid[row][col];

		for (int r = -1; r <= 1; r++) {
			int currentRow = row + r;
			for (int c = -1; c <= 1; c++) {
				int currentCol = col + c;
				if (currentRow >= 0 && currentRow < x && currentCol >= 0 && currentCol < y)
					if (grid[currentRow][currentCol]) {
						liveCount++;
					}
			}
		}

		// Puisque toutes les cellules sont comptées, y compris la cellule que
		// nous sommes en train de calculer.
		// Nous devons soustraire 1 du nombre réel si la cellule pour laquelle
		// nous calculons est vivante.

		if (cellCurrentlyAlive) {
			liveCount--;
		}

		if (liveCount == 2 && cellCurrentlyAlive) {
			return true;
		} else if (liveCount == 3) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean[][] nextGeneration(int x, int y, boolean[][] grid) {
		boolean[][] newgrid = new boolean[x][y];
		for (int row = 0; row < newgrid.length; row++) {
			for (int col = 0; col < newgrid[row].length; col++) {
				newgrid[row][col] = isAlive(row, col, x, y, grid);
			}
		}

		return newgrid;
	}



	// Calculer si une cellule individuelle doit être vivante dans la génération
	// suivante.

	@Override
	public void getGeneration(int generation, int x, int y, boolean[][] grid) {
		drawGrid(grid, 0);
		boolean[][] newgrid = nextGeneration(x, y, grid);
		drawGrid(newgrid, 1);
		for (int i = 2; i <= generation; i++) {
			newgrid = nextGeneration(x, y, newgrid);
			drawGrid(newgrid,i);
		}
	}

}
