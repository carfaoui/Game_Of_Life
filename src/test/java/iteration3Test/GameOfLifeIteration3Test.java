package iteration3Test;
/**
 * 
 * @author chaima_arfaoui
 *
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import iteration3.Beans.ExtractDataBean;
import iteration3.Beans.GameOfLifeBean;
import iteration3.Beans.GridMatrixBean;
import iteration3.Beans.GridMatrixBean.GridArray;

public class GameOfLifeIteration3Test {

	GridMatrixBean grid_3x3 = null;
	GridMatrixBean grid_4x4 = null;
	GridMatrixBean grid_5x5 = null;
	GridMatrixBean grid_6x6 = null;
	GridMatrixBean grid_7x7 = null;
	GridMatrixBean grid_8x8 = null;

	@Before
	public void init() {

		// ************Grilles de 3x3 ************//

		grid_3x3 = new GridMatrixBean();
		GridArray array1 = new GridArray();
		boolean row1col1 = false;
		boolean row1col2 = true;
		boolean row1col3 = false;
		array1.getArray().add(row1col1);
		array1.getArray().add(row1col2);
		array1.getArray().add(row1col3);
		grid_3x3.getGridArray().add(array1);

		GridArray array2 = new GridArray();
		boolean row2col1 = false;
		boolean row2col2 = true;
		boolean row2col3 = false;
		array2.getArray().add(row2col1);
		array2.getArray().add(row2col2);
		array2.getArray().add(row2col3);
		grid_3x3.getGridArray().add(array2);

		GridArray array3 = new GridArray();
		boolean row3col1 = false;
		boolean row3col2 = true;
		boolean row3col3 = false;
		array3.getArray().add(row3col1);
		array3.getArray().add(row3col2);
		array3.getArray().add(row3col3);
		grid_3x3.getGridArray().add(array3);

		// ************Grilles de 4x4 ************
		grid_4x4 = new GridMatrixBean();
		GridArray array1_4x4 = new GridArray();
		boolean row1col1_4x4 = false;
		boolean row1col2_4x4 = false;
		boolean row1col3_4x4 = false;
		boolean row1col4_4x4 = false;
		array1_4x4.getArray().add(row1col1_4x4);
		array1_4x4.getArray().add(row1col2_4x4);
		array1_4x4.getArray().add(row1col3_4x4);
		array1_4x4.getArray().add(row1col4_4x4);
		grid_4x4.getGridArray().add(array1_4x4);

		GridArray array2_4x4 = new GridArray();
		boolean row2col1_4x4 = false;
		boolean row2col2_4x4 = false;
		boolean row2col3_4x4 = false;
		boolean row2col4_4x4 = false;
		array2_4x4.getArray().add(row2col1_4x4);
		array2_4x4.getArray().add(row2col2_4x4);
		array2_4x4.getArray().add(row2col3_4x4);
		array2_4x4.getArray().add(row2col4_4x4);
		grid_4x4.getGridArray().add(array2_4x4);

		GridArray array3_4x4 = new GridArray();
		boolean row3col1_4x4 = false;
		boolean row3col2_4x4 = false;
		boolean row3col3_4x4 = false;
		boolean row3col4_4x4 = false;
		array3_4x4.getArray().add(row3col1_4x4);
		array3_4x4.getArray().add(row3col2_4x4);
		array3_4x4.getArray().add(row3col3_4x4);
		array3_4x4.getArray().add(row3col4_4x4);
		grid_4x4.getGridArray().add(array3_4x4);

		GridArray array4_4x4 = new GridArray();
		boolean row4col1_4x4 = false;
		boolean row4col2_4x4 = false;
		boolean row4col3_4x4 = false;
		boolean row4col4_4x4 = false;
		array4_4x4.getArray().add(row4col1_4x4);
		array4_4x4.getArray().add(row4col2_4x4);
		array4_4x4.getArray().add(row4col3_4x4);
		array4_4x4.getArray().add(row4col4_4x4);
		grid_4x4.getGridArray().add(array4_4x4);

		// ************Grilles de 5x5 ************
		grid_5x5 = new GridMatrixBean();
		GridArray array1_5x5 = new GridArray();
		boolean row1col1_5x5 = false;
		boolean row1col2_5x5 = false;
		boolean row1col3_5x5 = false;
		boolean row1col4_5x5 = false;
		boolean row1col5_5x5 = false;
		array1_5x5.getArray().add(row1col1_5x5);
		array1_5x5.getArray().add(row1col2_5x5);
		array1_5x5.getArray().add(row1col3_5x5);
		array1_5x5.getArray().add(row1col4_5x5);
		array1_5x5.getArray().add(row1col5_5x5);
		grid_5x5.getGridArray().add(array1_5x5);

		GridArray array2_5x5 = new GridArray();
		boolean row2col1_5x5 = false;
		boolean row2col2_5x5 = false;
		boolean row2col3_5x5 = true;
		boolean row2col4_5x5 = false;
		boolean row2col5_5x5 = false;
		array2_5x5.getArray().add(row2col1_5x5);
		array2_5x5.getArray().add(row2col2_5x5);
		array2_5x5.getArray().add(row2col3_5x5);
		array2_5x5.getArray().add(row2col4_5x5);
		array2_5x5.getArray().add(row2col5_5x5);
		grid_5x5.getGridArray().add(array2_5x5);

		GridArray array3_5x5 = new GridArray();
		boolean row3col1_5x5 = false;
		boolean row3col2_5x5 = true;
		boolean row3col3_5x5 = false;
		boolean row3col4_5x5 = false;
		boolean row3col5_5x5 = false;
		array3_5x5.getArray().add(row3col1_5x5);
		array3_5x5.getArray().add(row3col2_5x5);
		array3_5x5.getArray().add(row3col3_5x5);
		array3_5x5.getArray().add(row3col4_5x5);
		array3_5x5.getArray().add(row3col5_5x5);
		grid_5x5.getGridArray().add(array3_5x5);

		GridArray array4_5x5 = new GridArray();
		boolean row4col1_5x5 = false;
		boolean row4col2_5x5 = true;
		boolean row4col3_5x5 = true;
		boolean row4col4_5x5 = true;
		boolean row4col5_5x5 = false;
		array4_5x5.getArray().add(row4col1_5x5);
		array4_5x5.getArray().add(row4col2_5x5);
		array4_5x5.getArray().add(row4col3_5x5);
		array4_5x5.getArray().add(row4col4_5x5);
		array4_5x5.getArray().add(row4col5_5x5);
		grid_5x5.getGridArray().add(array4_5x5);

		GridArray array5_5x5 = new GridArray();
		boolean row5col1_5x5 = false;
		boolean row5col2_5x5 = false;
		boolean row5col3_5x5 = false;
		boolean row5col4_5x5 = false;
		boolean row5col5_5x5 = false;
		array5_5x5.getArray().add(row5col1_5x5);
		array5_5x5.getArray().add(row5col2_5x5);
		array5_5x5.getArray().add(row5col3_5x5);
		array5_5x5.getArray().add(row5col4_5x5);
		array5_5x5.getArray().add(row5col5_5x5);
		grid_5x5.getGridArray().add(array5_5x5);

		// ************Grilles de 6x6 ************
		grid_6x6 = new GridMatrixBean();
		GridArray array1_6x6 = new GridArray();
		boolean row1col1_6x6 = false;
		boolean row1col2_6x6 = false;
		boolean row1col3_6x6 = true;
		boolean row1col4_6x6 = false;
		boolean row1col5_6x6 = true;
		boolean row1col6_6x6 = false;
		array1_6x6.getArray().add(row1col1_6x6);
		array1_6x6.getArray().add(row1col2_6x6);
		array1_6x6.getArray().add(row1col3_6x6);
		array1_6x6.getArray().add(row1col4_6x6);
		array1_6x6.getArray().add(row1col5_6x6);
		array1_6x6.getArray().add(row1col6_6x6);
		grid_6x6.getGridArray().add(array1_6x6);

		GridArray array2_6x6 = new GridArray();
		boolean row2col1_6x6 = false;
		boolean row2col2_6x6 = false;
		boolean row2col3_6x6 = true;
		boolean row2col4_6x6 = false;
		boolean row2col5_6x6 = false;
		boolean row2col6_6x6 = false;
		array2_6x6.getArray().add(row2col1_6x6);
		array2_6x6.getArray().add(row2col2_6x6);
		array2_6x6.getArray().add(row2col3_6x6);
		array2_6x6.getArray().add(row2col4_6x6);
		array2_6x6.getArray().add(row2col5_6x6);
		array2_6x6.getArray().add(row2col6_6x6);
		grid_6x6.getGridArray().add(array2_6x6);

		GridArray array3_6x6 = new GridArray();
		boolean row3col1_6x6 = false;
		boolean row3col2_6x6 = false;
		boolean row3col3_6x6 = false;
		boolean row3col4_6x6 = true;
		boolean row3col5_6x6 = true;
		boolean row3col6_6x6 = true;
		array3_6x6.getArray().add(row3col1_6x6);
		array3_6x6.getArray().add(row3col2_6x6);
		array3_6x6.getArray().add(row3col3_6x6);
		array3_6x6.getArray().add(row3col4_6x6);
		array3_6x6.getArray().add(row3col5_6x6);
		array3_6x6.getArray().add(row3col6_6x6);
		grid_6x6.getGridArray().add(array3_6x6);

		GridArray array4_6x6 = new GridArray();
		boolean row4col1_6x6 = false;
		boolean row4col2_6x6 = false;
		boolean row4col3_6x6 = false;
		boolean row4col4_6x6 = false;
		boolean row4col5_6x6 = false;
		boolean row4col6_6x6 = false;
		array4_6x6.getArray().add(row4col1_6x6);
		array4_6x6.getArray().add(row4col2_6x6);
		array4_6x6.getArray().add(row4col3_6x6);
		array4_6x6.getArray().add(row4col4_6x6);
		array4_6x6.getArray().add(row4col5_6x6);
		array4_6x6.getArray().add(row4col6_6x6);
		grid_6x6.getGridArray().add(array4_6x6);

		GridArray array5_6x6 = new GridArray();
		boolean row5col1_6x6 = false;
		boolean row5col2_6x6 = false;
		boolean row5col3_6x6 = false;
		boolean row5col4_6x6 = false;
		boolean row5col5_6x6 = false;
		boolean row5col6_6x6 = false;
		array5_6x6.getArray().add(row5col1_6x6);
		array5_6x6.getArray().add(row5col2_6x6);
		array5_6x6.getArray().add(row5col3_6x6);
		array5_6x6.getArray().add(row5col4_6x6);
		array5_6x6.getArray().add(row5col5_6x6);
		array5_6x6.getArray().add(row5col6_6x6);
		grid_6x6.getGridArray().add(array5_6x6);

		GridArray array6_6x6 = new GridArray();
		boolean row6col1_6x6 = false;
		boolean row6col2_6x6 = false;
		boolean row6col3_6x6 = false;
		boolean row6col4_6x6 = false;
		boolean row6col5_6x6 = false;
		boolean row6col6_6x6 = false;
		array6_6x6.getArray().add(row6col1_6x6);
		array6_6x6.getArray().add(row6col2_6x6);
		array6_6x6.getArray().add(row6col3_6x6);
		array6_6x6.getArray().add(row6col4_6x6);
		array6_6x6.getArray().add(row6col5_6x6);
		array6_6x6.getArray().add(row6col6_6x6);
		grid_6x6.getGridArray().add(array6_6x6);

		// ************Grilles de 7x7 ****************************
		grid_7x7 = new GridMatrixBean();
		GridArray array1_7x7 = new GridArray();
		boolean row1col1_7x7 = false;
		boolean row1col2_7x7 = false;
		boolean row1col3_7x7 = false;
		boolean row1col4_7x7 = false;
		boolean row1col5_7x7 = false;
		boolean row1col6_7x7 = false;
		boolean row1col7_7x7 = false;
		array1_7x7.getArray().add(row1col1_7x7);
		array1_7x7.getArray().add(row1col2_7x7);
		array1_7x7.getArray().add(row1col3_7x7);
		array1_7x7.getArray().add(row1col4_7x7);
		array1_7x7.getArray().add(row1col5_7x7);
		array1_7x7.getArray().add(row1col6_7x7);
		array1_7x7.getArray().add(row1col7_7x7);
		grid_7x7.getGridArray().add(array1_7x7);

		GridArray array2_7x7 = new GridArray();
		boolean row2col1_7x7 = false;
		boolean row2col2_7x7 = true;
		boolean row2col3_7x7 = false;
		boolean row2col4_7x7 = false;
		boolean row2col5_7x7 = false;
		boolean row2col6_7x7 = true;
		boolean row2col7_7x7 = false;
		array2_7x7.getArray().add(row2col1_7x7);
		array2_7x7.getArray().add(row2col2_7x7);
		array2_7x7.getArray().add(row2col3_7x7);
		array2_7x7.getArray().add(row2col4_7x7);
		array2_7x7.getArray().add(row2col5_7x7);
		array2_7x7.getArray().add(row2col6_7x7);
		array2_7x7.getArray().add(row2col7_7x7);
		grid_7x7.getGridArray().add(array2_7x7);

		GridArray array3_7x7 = new GridArray();
		boolean row3col1_7x7 = false;
		boolean row3col2_7x7 = true;
		boolean row3col3_7x7 = false;
		boolean row3col4_7x7 = false;
		boolean row3col5_7x7 = false;
		boolean row3col6_7x7 = true;
		boolean row3col7_7x7 = true;
		array3_7x7.getArray().add(row3col1_7x7);
		array3_7x7.getArray().add(row3col2_7x7);
		array3_7x7.getArray().add(row3col3_7x7);
		array3_7x7.getArray().add(row3col4_7x7);
		array3_7x7.getArray().add(row3col5_7x7);
		array3_7x7.getArray().add(row3col6_7x7);
		array3_7x7.getArray().add(row3col7_7x7);
		grid_7x7.getGridArray().add(array3_7x7);

		GridArray array4_7x7 = new GridArray();
		boolean row4col1_7x7 = false;
		boolean row4col2_7x7 = false;
		boolean row4col3_7x7 = false;
		boolean row4col4_7x7 = false;
		boolean row4col5_7x7 = false;
		boolean row4col6_7x7 = true;
		boolean row4col7_7x7 = false;
		array4_7x7.getArray().add(row4col1_7x7);
		array4_7x7.getArray().add(row4col2_7x7);
		array4_7x7.getArray().add(row4col3_7x7);
		array4_7x7.getArray().add(row4col4_7x7);
		array4_7x7.getArray().add(row4col5_7x7);
		array4_7x7.getArray().add(row4col6_7x7);
		array4_7x7.getArray().add(row4col7_7x7);
		grid_7x7.getGridArray().add(array4_7x7);

		GridArray array5_7x7 = new GridArray();
		boolean row5col1_7x7 = false;
		boolean row5col2_7x7 = false;
		boolean row5col3_7x7 = true;
		boolean row5col4_7x7 = false;
		boolean row5col5_7x7 = true;
		boolean row5col6_7x7 = true;
		boolean row5col7_7x7 = false;
		array5_7x7.getArray().add(row5col1_7x7);
		array5_7x7.getArray().add(row5col2_7x7);
		array5_7x7.getArray().add(row5col3_7x7);
		array5_7x7.getArray().add(row5col4_7x7);
		array5_7x7.getArray().add(row5col5_7x7);
		array5_7x7.getArray().add(row5col6_7x7);
		array5_7x7.getArray().add(row5col7_7x7);
		grid_7x7.getGridArray().add(array5_7x7);

		GridArray array6_7x7 = new GridArray();
		boolean row6col1_7x7 = false;
		boolean row6col2_7x7 = false;
		boolean row6col3_7x7 = true;
		boolean row6col4_7x7 = false;
		boolean row6col5_7x7 = false;
		boolean row6col6_7x7 = false;
		boolean row6col7_7x7 = false;
		array6_7x7.getArray().add(row6col1_7x7);
		array6_7x7.getArray().add(row6col2_7x7);
		array6_7x7.getArray().add(row6col3_7x7);
		array6_7x7.getArray().add(row6col4_7x7);
		array6_7x7.getArray().add(row6col5_7x7);
		array6_7x7.getArray().add(row6col6_7x7);
		array6_7x7.getArray().add(row6col7_7x7);
		grid_7x7.getGridArray().add(array6_7x7);

		GridArray array7_7x7 = new GridArray();
		boolean row7col1_7x7 = false;
		boolean row7col2_7x7 = false;
		boolean row7col3_7x7 = false;
		boolean row7col4_7x7 = false;
		boolean row7col5_7x7 = true;
		boolean row7col6_7x7 = true;
		boolean row7col7_7x7 = false;
		array7_7x7.getArray().add(row7col1_7x7);
		array7_7x7.getArray().add(row7col2_7x7);
		array7_7x7.getArray().add(row7col3_7x7);
		array7_7x7.getArray().add(row7col4_7x7);
		array7_7x7.getArray().add(row7col5_7x7);
		array7_7x7.getArray().add(row7col6_7x7);
		array7_7x7.getArray().add(row7col7_7x7);
		grid_7x7.getGridArray().add(array7_7x7);

		// ************Grilles de 8x8 ****************************
		grid_8x8 = new GridMatrixBean();
		GridArray array1_8x8 = new GridArray();
		boolean row1col1_8x8 = false;
		boolean row1col2_8x8 = true;
		boolean row1col3_8x8 = true;
		boolean row1col4_8x8 = false;
		boolean row1col5_8x8 = false;
		boolean row1col6_8x8 = false;
		boolean row1col7_8x8 = false;
		boolean row1col8_8x8 = false;
		array1_8x8.getArray().add(row1col1_8x8);
		array1_8x8.getArray().add(row1col2_8x8);
		array1_8x8.getArray().add(row1col3_8x8);
		array1_8x8.getArray().add(row1col4_8x8);
		array1_8x8.getArray().add(row1col5_8x8);
		array1_8x8.getArray().add(row1col6_8x8);
		array1_8x8.getArray().add(row1col7_8x8);
		array1_8x8.getArray().add(row1col8_8x8);
		grid_8x8.getGridArray().add(array1_8x8);

		GridArray array2_8x8 = new GridArray();
		boolean row2col1_8x8 = false;
		boolean row2col2_8x8 = false;
		boolean row2col3_8x8 = false;
		boolean row2col4_8x8 = true;
		boolean row2col5_8x8 = false;
		boolean row2col6_8x8 = false;
		boolean row2col7_8x8 = false;
		boolean row2col8_8x8 = false;
		array2_8x8.getArray().add(row2col1_8x8);
		array2_8x8.getArray().add(row2col2_8x8);
		array2_8x8.getArray().add(row2col3_8x8);
		array2_8x8.getArray().add(row2col4_8x8);
		array2_8x8.getArray().add(row2col5_8x8);
		array2_8x8.getArray().add(row2col6_8x8);
		array2_8x8.getArray().add(row2col7_8x8);
		array2_8x8.getArray().add(row2col8_8x8);
		grid_8x8.getGridArray().add(array2_8x8);

		GridArray array3_8x8 = new GridArray();
		boolean row3col1_8x8 = false;
		boolean row3col2_8x8 = true;
		boolean row3col3_8x8 = true;
		boolean row3col4_8x8 = true;
		boolean row3col5_8x8 = false;
		boolean row3col6_8x8 = false;
		boolean row3col7_8x8 = false;
		boolean row3col8_8x8 = false;
		array3_8x8.getArray().add(row3col1_8x8);
		array3_8x8.getArray().add(row3col2_8x8);
		array3_8x8.getArray().add(row3col3_8x8);
		array3_8x8.getArray().add(row3col4_8x8);
		array3_8x8.getArray().add(row3col5_8x8);
		array3_8x8.getArray().add(row3col6_8x8);
		array3_8x8.getArray().add(row3col7_8x8);
		array3_8x8.getArray().add(row3col8_8x8);
		grid_8x8.getGridArray().add(array3_8x8);

		GridArray array4_8x8 = new GridArray();
		boolean row4col1_8x8 = false;
		boolean row4col2_8x8 = true;
		boolean row4col3_8x8 = true;
		boolean row4col4_8x8 = true;
		boolean row4col5_8x8 = true;
		boolean row4col6_8x8 = true;
		boolean row4col7_8x8 = true;
		boolean row4col8_8x8 = false;
		array4_8x8.getArray().add(row4col1_8x8);
		array4_8x8.getArray().add(row4col2_8x8);
		array4_8x8.getArray().add(row4col3_8x8);
		array4_8x8.getArray().add(row4col4_8x8);
		array4_8x8.getArray().add(row4col5_8x8);
		array4_8x8.getArray().add(row4col6_8x8);
		array4_8x8.getArray().add(row4col7_8x8);
		array4_8x8.getArray().add(row4col8_8x8);
		grid_8x8.getGridArray().add(array4_8x8);

		GridArray array5_8x8 = new GridArray();
		boolean row5col1_8x8 = false;
		boolean row5col2_8x8 = false;
		boolean row5col3_8x8 = false;
		boolean row5col4_8x8 = false;
		boolean row5col5_8x8 = false;
		boolean row5col6_8x8 = false;
		boolean row5col7_8x8 = false;
		boolean row5col8_8x8 = false;
		array5_8x8.getArray().add(row5col1_8x8);
		array5_8x8.getArray().add(row5col2_8x8);
		array5_8x8.getArray().add(row5col3_8x8);
		array5_8x8.getArray().add(row5col4_8x8);
		array5_8x8.getArray().add(row5col5_8x8);
		array5_8x8.getArray().add(row5col6_8x8);
		array5_8x8.getArray().add(row5col7_8x8);
		array5_8x8.getArray().add(row5col8_8x8);
		grid_8x8.getGridArray().add(array5_8x8);

		GridArray array6_8x8 = new GridArray();
		boolean row6col1_8x8 = false;
		boolean row6col2_8x8 = false;
		boolean row6col3_8x8 = false;
		boolean row6col4_8x8 = false;
		boolean row6col5_8x8 = true;
		boolean row6col6_8x8 = true;
		boolean row6col7_8x8 = true;
		boolean row6col8_8x8 = false;
		array6_8x8.getArray().add(row6col1_8x8);
		array6_8x8.getArray().add(row6col2_8x8);
		array6_8x8.getArray().add(row6col3_8x8);
		array6_8x8.getArray().add(row6col4_8x8);
		array6_8x8.getArray().add(row6col5_8x8);
		array6_8x8.getArray().add(row6col6_8x8);
		array6_8x8.getArray().add(row6col7_8x8);
		array6_8x8.getArray().add(row6col8_8x8);
		grid_8x8.getGridArray().add(array6_8x8);

		GridArray array7_8x8 = new GridArray();
		boolean row7col1_8x8 = true;
		boolean row7col2_8x8 = true;
		boolean row7col3_8x8 = false;
		boolean row7col4_8x8 = false;
		boolean row7col5_8x8 = false;
		boolean row7col6_8x8 = false;
		boolean row7col7_8x8 = false;
		boolean row7col8_8x8 = false;
		array7_8x8.getArray().add(row7col1_8x8);
		array7_8x8.getArray().add(row7col2_8x8);
		array7_8x8.getArray().add(row7col3_8x8);
		array7_8x8.getArray().add(row7col4_8x8);
		array7_8x8.getArray().add(row7col5_8x8);
		array7_8x8.getArray().add(row7col6_8x8);
		array7_8x8.getArray().add(row7col7_8x8);
		array7_8x8.getArray().add(row7col8_8x8);
		grid_8x8.getGridArray().add(array7_8x8);

		GridArray array8_8x8 = new GridArray();
		boolean row8col1_8x8 = true;
		boolean row8col2_8x8 = true;
		boolean row8col3_8x8 = false;
		boolean row8col4_8x8 = false;
		boolean row8col5_8x8 = false;
		boolean row8col6_8x8 = false;
		boolean row8col7_8x8 = false;
		boolean row8col8_8x8 = false;
		array8_8x8.getArray().add(row8col1_8x8);
		array8_8x8.getArray().add(row8col2_8x8);
		array8_8x8.getArray().add(row8col3_8x8);
		array8_8x8.getArray().add(row8col4_8x8);
		array8_8x8.getArray().add(row8col5_8x8);
		array8_8x8.getArray().add(row8col6_8x8);
		array8_8x8.getArray().add(row8col7_8x8);
		array8_8x8.getArray().add(row8col8_8x8);
		grid_8x8.getGridArray().add(array8_8x8);

	}

	// Test pour la dimension 3x3
	@SuppressWarnings("deprecation")
	@Test
	public void launch_3x3_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration3/data3x3";
		ExtractDataBean file = new ExtractDataBean();

		/** récupération des donnés depuis le fichier */
		GameOfLifeBean gameOfLife_3x3 = file.retrieveDataFromFile(file.getPath(dataFileName));

		int row_3x3 = gameOfLife_3x3.getDimension().getRow();
		int col_3x3 = gameOfLife_3x3.getDimension().getCol();
		int numberOfEvolutions_3x3 = gameOfLife_3x3.getNumberOfEvolutions();

		// création de grille initial à partir des données de fichier data
		boolean[][] firstGrid = gameOfLife_3x3.createBooleanGridFromGridMatrix(row_3x3, col_3x3,
				gameOfLife_3x3.getGrid());

		boolean[][] lastGridFromGetGeneration = gameOfLife_3x3.getGeneration(numberOfEvolutions_3x3, row_3x3, col_3x3,
				firstGrid);
		boolean[][] lastGridFromInitTest = gameOfLife_3x3.createBooleanGridFromGridMatrix(row_3x3, col_3x3, grid_3x3);

		Assert.assertEquals(lastGridFromGetGeneration, lastGridFromInitTest);

	}

	// Test pour la dimension 4x4
	@Test
	public void launch_4x4_Test() {

		/** lecture de fichier */
		String dataFileName = "iteration3/data4x4";
		ExtractDataBean file = new ExtractDataBean();

		/** récupération des donnés depuis le fichier */
		GameOfLifeBean gameOfLife_4x4 = file.retrieveDataFromFile(file.getPath(dataFileName));
		int row_4x4 = gameOfLife_4x4.getDimension().getRow();
		int col_4x4 = gameOfLife_4x4.getDimension().getCol();
		int numberOfEvolutions_4x4 = gameOfLife_4x4.getNumberOfEvolutions();

		// création de grille initial à partir des données de fichier data
		boolean[][] firstGrid = gameOfLife_4x4.createBooleanGridFromGridMatrix(row_4x4, col_4x4,
				gameOfLife_4x4.getGrid());

		boolean[][] lastGridFromGetGeneration = gameOfLife_4x4.getGeneration(numberOfEvolutions_4x4, row_4x4, col_4x4,
				firstGrid);
		boolean[][] lastGridFromInitTest = gameOfLife_4x4.createBooleanGridFromGridMatrix(row_4x4, col_4x4, grid_4x4);

		Assert.assertEquals(lastGridFromGetGeneration, lastGridFromInitTest);

	}

	// Test pour la dimension 5x5
	@Test
	public void launch_5x5_test() {
		/** lecture de fichier */
		String dataFileName = "iteration3/data5x5";
		ExtractDataBean file = new ExtractDataBean();

		/** récupération des donnés depuis le fichier */
		GameOfLifeBean gameOfLife_5x5 = file.retrieveDataFromFile(file.getPath(dataFileName));

		int row_5x5 = gameOfLife_5x5.getDimension().getRow();
		int col_5x5 = gameOfLife_5x5.getDimension().getCol();
		int numberOfEvolutions_5x5 = gameOfLife_5x5.getNumberOfEvolutions();

		// création de grille initial à partir des données de fichier data
		boolean[][] firstGrid = gameOfLife_5x5.createBooleanGridFromGridMatrix(row_5x5, col_5x5,
				gameOfLife_5x5.getGrid());

		boolean[][] lastGridFromGetGeneration = gameOfLife_5x5.getGeneration(numberOfEvolutions_5x5, row_5x5, col_5x5,
				firstGrid);
		boolean[][] lastGridFromInitTest = gameOfLife_5x5.createBooleanGridFromGridMatrix(row_5x5, col_5x5, grid_5x5);

		Assert.assertEquals(lastGridFromGetGeneration, lastGridFromInitTest);

	}

	// Test pour la dimension 6x6
	@Test
	public void launch_6x6_Test() {
		/** lecture de fichier */
		String dataFileName = "iteration3/data6x6";
		ExtractDataBean file = new ExtractDataBean();

		/** récupération des donnés depuis le fichier */
		GameOfLifeBean gameOfLife_6x6 = file.retrieveDataFromFile(file.getPath(dataFileName));
		int row_6x6 = gameOfLife_6x6.getDimension().getRow();
		int col_6x6 = gameOfLife_6x6.getDimension().getCol();
		int numberOfEvolutions_6x6 = gameOfLife_6x6.getNumberOfEvolutions();

		// création de grille initial à partir des données de fichier data
		boolean[][] firstGrid = gameOfLife_6x6.createBooleanGridFromGridMatrix(row_6x6, col_6x6,
				gameOfLife_6x6.getGrid());

		boolean[][] lastGridFromGetGeneration = gameOfLife_6x6.getGeneration(numberOfEvolutions_6x6, row_6x6, col_6x6,
				firstGrid);
		boolean[][] lastGridFromInitTest = gameOfLife_6x6.createBooleanGridFromGridMatrix(row_6x6, col_6x6, grid_6x6);

		Assert.assertEquals(lastGridFromGetGeneration, lastGridFromInitTest);

	}

	// Test pour la dimension 7x7
	@Test
	public void launch_7x7_Test() {
		/** lecture de fichier */
		String dataFileName = "iteration3/data7x7";
		ExtractDataBean file = new ExtractDataBean();

		/** récupération des donnés depuis le fichier */
		GameOfLifeBean gameOfLife_7x7 = file.retrieveDataFromFile(file.getPath(dataFileName));
		int row_7x7 = gameOfLife_7x7.getDimension().getRow();
		int col_7x7 = gameOfLife_7x7.getDimension().getCol();
		int numberOfEvolutions_7x7 = gameOfLife_7x7.getNumberOfEvolutions();

		// création de grille initial à partir des données de fichier data
		boolean[][] firstGrid = gameOfLife_7x7.createBooleanGridFromGridMatrix(row_7x7, col_7x7,
				gameOfLife_7x7.getGrid());

		boolean[][] lastGridFromGetGeneration = gameOfLife_7x7.getGeneration(numberOfEvolutions_7x7, row_7x7, col_7x7,
				firstGrid);
		boolean[][] lastGridFromInitTest = gameOfLife_7x7.createBooleanGridFromGridMatrix(row_7x7, col_7x7, grid_7x7);

		Assert.assertEquals(lastGridFromGetGeneration, lastGridFromInitTest);

	}

	// Test pour la dimension 8x8
	@Test
	public void launch_8x8_Test() {
		/** lecture de fichier */
		String dataFileName = "iteration3/data8x8";
		ExtractDataBean file = new ExtractDataBean();

		/** récupération des donnés depuis le fichier */
		GameOfLifeBean gameOfLife_8x8 = file.retrieveDataFromFile(file.getPath(dataFileName));
		int row_8x8 = gameOfLife_8x8.getDimension().getRow();
		int col_8x8 = gameOfLife_8x8.getDimension().getCol();
		int numberOfEvolutions_8x8 = gameOfLife_8x8.getNumberOfEvolutions();

		// création de grille initial à partir des données de fichier data
		boolean[][] firstGrid = gameOfLife_8x8.createBooleanGridFromGridMatrix(row_8x8, col_8x8,
				gameOfLife_8x8.getGrid());

		boolean[][] lastGridFromGetGeneration = gameOfLife_8x8.getGeneration(numberOfEvolutions_8x8, row_8x8, col_8x8,
				firstGrid);
		boolean[][] lastGridFromInitTest = gameOfLife_8x8.createBooleanGridFromGridMatrix(row_8x8, col_8x8, grid_8x8);

		Assert.assertEquals(lastGridFromGetGeneration, lastGridFromInitTest);

	}
}
