package iteration1;



import iteration2.GridMatrix;
import iteration2.GridMatrix.GridArray;

/**
 * 
 * @author chaima_arfaoui
 *
 */

public  class GameOfLife {
	/**
	 * Les dimensions de la grille. */
	private  int dimension;
	/**
	 * L’état initial de la grille */
	private GridMatrix grid;
	/**
	 * Le nombre d’évolutions */
	private long generation;
	
	/**
	 * Le nombre lignes */
	private int rowGrid;
	/**
	 * Le nombre colonnes */
	private int colGrid;
	
	private static final String ALIVE = "+";
	private static final char ALIVE_CHAR = '+';
	private static final String DEAD = "-";
	private static final char DEAD_CHAR = '-';
	private static final String OUTPOUT_CONSOLE="E";

	

	public GameOfLife() {
		super();
		this.generation = 0;
		
	}



	public GameOfLife(int dimension, GridMatrix grid) {
		super();
		this.dimension = dimension;
		this.grid = grid;
		
	}


	public GameOfLife(int rowGrid, int colGrid,GridMatrix grid2) {
		super();
		this.grid = grid2;
		this.rowGrid = rowGrid;
		this.colGrid = colGrid;
	}

	public GridMatrix getGrid() {
		return grid;
	}


	public void setGrid(GridMatrix grid) {
		this.grid = grid;
	}


	public int getDimension() {
		return dimension;
	}


	public void setDimension(int dimension) {
		this.dimension = dimension;
	}


	public long getGeneration() {
		return generation;
	}


	public void setGeneration(long generation) {
		this.generation = generation;
	}

	
	public int getRowGrid() {
		return rowGrid;
	}

	public void setRowGrid(int rowGrid) {
		this.rowGrid = rowGrid;
	}

	public int getColGrid() {
		return colGrid;
	}

	public void setColGrid(int colGrid) {
		this.colGrid = colGrid;
	}
	
	/**
	 * Créer une grille à partir de grille type GridMatrix
	 * GridMatrix : permet de creer une grille à partir de fichier data ( input file )
	 * @param x : row ,y : col
	 * @return boolean[][]
	 */
	public boolean[][] createInitgrid(int x, int y, GridMatrix grid) {

		boolean[][] newgrid = new boolean[x][y];
		int row = -1, col = 0;

		for (GridArray gridArray : grid.getGridArray()) {
			row++;
			col = 0;
			for (boolean gridArray1 : gridArray.getArray()) {
				newgrid[row][col] = gridArray1;
				col++;
			}
		}

		return newgrid;
	}

	/**
	 * Dessiner une grille avec le format ( +,-) et à partir de grille de type boolean [][] 
	 * @param evolutionCount nombre d'évolution de grille   
	 * @param grid 
	 *  
	 * 
	 */
	public String drawGrid(boolean[][] grid,int evolutionCount) {
		StringBuilder outputConsole = new StringBuilder();
		System.out.println(OUTPOUT_CONSOLE+evolutionCount);
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

	/**
	 * Créer une grille à partir de grille type GridMatrix
	 * GridMatrix : permet de creer une grille à partir de fichier data ( input file )
	 * @param x : row ,y : col
	 * @return boolean[][]
	 */
	public boolean[][] createGridFromAnotherGrid(int x, int y,boolean [][]grid){
		boolean[][] newgrid = new boolean[x][y];
		for(int row = 0; row < newgrid.length; row++ ){
			for(int col = 0; col < newgrid[row].length; col++ ){
				newgrid[row][col] = isAlive(row, col,x,y,grid);
			}
		}
		return newgrid;
	
	}

	// Calculer si une cellule individuelle doit être vivante dans la génération suivante.
	public boolean isAlive(int row, int col,int x , int y,boolean[][] grid){
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

		// Puisque toutes les cellules sont comptées, y compris la cellule que nous sommes en train de calculer. 
		// Nous devons soustraire 1 du nombre réel si la cellule pour laquelle nous calculons est vivante.
		
		if(cellCurrentlyAlive){
			liveCount--;
		}
	
	
		if(liveCount == 2 && cellCurrentlyAlive){
			return true;
		} else if(liveCount == 3){
			return true;
		} else {
			return false;
		}
	}
	
	
	

}
