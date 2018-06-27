package iteration2;
/**
 * 
 * @author chaima_arfaoui
 *
 */



public  class GameOfLife extends GameOfLifeServiceImpl {
	/**
	 * Les dimensions de la grille. */
	private  Dimension dimension;
	/**
	 * L’état initial de la grille */
	private GridMatrix grid;
	/**
	 * Le nombre d’évolutions */
	private int numberOfEvolutions;
	



	public GameOfLife() {
		super();
		this.numberOfEvolutions = 0;
		
	}

	public GameOfLife(Dimension dimension, GridMatrix gridArray) {
		super();
		this.dimension = dimension;
		this.grid = gridArray;
		
	}


	public GameOfLife(int numberOfEvolutions,Dimension dimension, GridMatrix grid2) {
		super();
		this.dimension = dimension;
		this.grid = grid2;
		this.numberOfEvolutions = numberOfEvolutions;
	}

	public GridMatrix getGrid() {
		return grid;
	}


	public void setGrid(GridMatrix grid) {
		this.grid = grid;
	}


	public Dimension getDimension() {
		return dimension;
	}


	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public int getNumberOfEvolutions() {
		return numberOfEvolutions;
	}

	public void setNumberOfEvolutions(int numberOfEvolutions) {
		this.numberOfEvolutions = numberOfEvolutions;
	}

}
