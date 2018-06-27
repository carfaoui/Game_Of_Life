package iteration3.Services.Imp;

import static iteration3.Utils.Utils.ALIVE;
import static iteration3.Utils.Utils.ENCODING;
import static iteration3.Utils.Utils.SEPARATOR;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import iteration3.Beans.DimensionBean;
import iteration3.Beans.GameOfLifeBean;
import iteration3.Beans.GridMatrixBean;
import iteration3.Beans.GridMatrixBean.GridArray;
import iteration3.Services.ExtractDataServices;

public class ExtractDataServicesImpl implements ExtractDataServices {
	@Override
	public String getPath(String dataFileName) {

		ClassLoader classLoader = getClass().getClassLoader();
		String fileDataPath = new File(classLoader.getResource(dataFileName).getFile()).getAbsolutePath();
		return fileDataPath;

	}

	@Override
	public GameOfLifeBean retrieveDataFromFile(String sourceFileName) {
		List<String> lines = null;
		try {
			lines = readFile(sourceFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DimensionBean dimension = this.extractDimension(lines);
		int numberOfEvolutions = this.extractnumberOfEvolutions(lines);
		GridMatrixBean grid = this.extractGrid(lines);

		GameOfLifeBean gameOfLife = new GameOfLifeBean(numberOfEvolutions, dimension, grid);

		return gameOfLife;
	}

	@Override
	/**
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public List<String> readFile(String fileName) throws IOException {
		Path path = Paths.get(fileName);
		return Files.readAllLines(path, ENCODING);
	}

	@Override
	public DimensionBean extractDimension(List<String> lines) {
		DimensionBean dimension = new DimensionBean();
		dimension.setRow(Integer.parseInt(lines.get(1).split(SEPARATOR)[0]));
		dimension.setCol(Integer.parseInt(lines.get(1).split(SEPARATOR)[1]));
		return dimension;
	}

	@Override
	public GridMatrixBean extractGrid(List<String> lines) {
		List<String> subLines = lines.subList(2, lines.size());
		GridMatrixBean matrix = new GridMatrixBean();
		for (int i = 0; i < subLines.size(); i++) {
			String[] s = subLines.get(i).split("");
			GridArray g = setRow(s);
			matrix.getGridArray().add(g);

		}

		return matrix;

	}

	@Override
	public int extractnumberOfEvolutions(List<String> lines) {
		return Integer.parseInt(lines.get(0));
	}

	@Override
	public GridArray setRow(String[] s) {
		GridArray gridArray = new GridArray();
		for (int i = 1; i < s.length; i++) {
			if (s[i].equals(ALIVE)) {
				gridArray.getArray().add(true);
			} else {
				gridArray.getArray().add(false);
			}

		}
		return gridArray;

	}

}
