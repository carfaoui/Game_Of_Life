package iteration3.Beans;

/**
 * 
 * @author chaima_arfaoui
 *
 */
public class DimensionBean {
	/**
	 * nombre de ligne*/
	private int row;
	/**
	 * nombre de colonne*/
	private int col;
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	
	public DimensionBean() {
		super();
		
	}
	public DimensionBean(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	

}
