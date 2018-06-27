package iteration3.Beans;

/**
 * 
 * @author chaima_arfaoui
 *
 */

import java.util.ArrayList;
import java.util.List;

/**cette classe : permet de creer une grille à partir de fichier data ( input file )*/

public class GridMatrixBean {
	private List<GridArray> gridArray = new ArrayList<>();

	public List<GridArray> getGridArray() {
		return gridArray;
	}

	public void setGridArray(List<GridArray> gridArray) {
		this.gridArray = gridArray;
	}

	public static class GridArray {
		
		private List<Boolean> array = new ArrayList<>();

		public List<Boolean> getArray() {
			return array;
		}

		public void setArray(List<Boolean> array) {
			this.array = array;
		}

	}

}
