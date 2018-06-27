package iteration3.Services;

import java.io.IOException;
import java.util.List;

import iteration3.Beans.DimensionBean;
import iteration3.Beans.GameOfLifeBean;
import iteration3.Beans.GridMatrixBean;
import iteration3.Beans.GridMatrixBean.GridArray;

public interface ExtractDataServices {
	/**
	 * récupérer le path de ficheir à partir de String
	 * @param fileName nom de fichier
	 * @return String
	 * 
	 */
	String getPath(String fileName);
	/**
	 * récupérer les données depuis le fichier
	 * @param sourceFileName nom de fichier
	 * @return String
	 * 
	 */
	GameOfLifeBean retrieveDataFromFile(String sourceFileName);
	/**
	 * récupérer les données depuis le fichier
	 * @param sourceFileName nom de fichier
	 * @return List<String> 
	 * 
	 */
	List<String> readFile(String fileName) throws IOException;
	/**
	 * récupérer la dimension de grille depuis le fichier
	 * @param lines nombre de ligne de fichier data
	 * @return DimensionBean 
	 * 
	 */
	DimensionBean extractDimension(List<String> lines);
	/**
	 * récupérer la grille type string depuis le fichier data 
	 * transformer grille type String vers grille type GridMatrixBean
	 * @param lines nombre de ligne de fichier data
	 * @return GridMatrixBean 
	 * 
	 */
	GridMatrixBean extractGrid(List<String> lines) ;
	/**
	 * récupérer nombre d'évolution de la grille  depuis le fichier data 
	 * @param lines nombre de ligne de fichier data
	 * @return int 
	 * 
	 */
	int extractnumberOfEvolutions(List<String> lines);
	/**
	 * transformation d'un tableau type string vers un tableau type GridArray
	 * @param tableau de string 
	 * @return GridArray 
	 * 
	 */
	GridArray setRow(String[] s);

}
