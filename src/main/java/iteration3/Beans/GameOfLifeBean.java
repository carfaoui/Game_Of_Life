package iteration3.Beans;

/**
 * 
 * @author chaima_arfaoui
 *
 */


import iteration3.Services.Imp.GameOfLifeServicesImpl;

public  class GameOfLifeBean extends GameOfLifeServicesImpl {
	/**
	 * Les dimensions de la grille. */
	private  DimensionBean dimension;
	/**
	 * L’état initial de la grille */
	private GridMatrixBean grid;
	/**
	 * Le nombre d’évolutions */
	private int numberOfEvolutions;



	public GameOfLifeBean() {
		super();
		this.numberOfEvolutions = 0;
		
	}

	public GameOfLifeBean(DimensionBean dimension, GridMatrixBean gridArray) {
		super();
		this.dimension = dimension;
		this.grid = gridArray;
		
	}


	public GameOfLifeBean(int numberOfEvolutions,DimensionBean dimension, GridMatrixBean grid) {
		super();
		this.dimension = dimension;
		this.grid = grid;
		this.numberOfEvolutions = numberOfEvolutions;
	}

	public GridMatrixBean getGrid() {
		return grid;
	}


	public void setGrid(GridMatrixBean grid) {
		this.grid = grid;
	}


	public DimensionBean getDimension() {
		return dimension;
	}


	public void setDimension(DimensionBean dimension) {
		this.dimension = dimension;
	}

	public int getNumberOfEvolutions() {
		return numberOfEvolutions;
	}

	public void setNumberOfEvolutions(int numberOfEvolutions) {
		this.numberOfEvolutions = numberOfEvolutions;
	}

}
