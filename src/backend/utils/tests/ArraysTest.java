package backend.utils.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static backend.utils.ArraysInt.*;

class ArraysTest {
	int [] array = {10,25,30,40,100};

	@Test
	void addNumberTest() {
		int[] arrayExpected = {10,25,30,40,100, -2};
		int[] arrayActual = addNumber(array,-2);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	@Test
	void insertNumberTest() {
		int[] arrayExpectedLast = {10,25,30,40,100,25}; 
		int[] arrayExpectedFirst = {25,10,25,30,40,100};
		int[] arrayExpectedMiddle = {10,25,25,30,40,100};
		int[] arrayActualLast = insertNumber(array,5,25);
		int[] arrayActualFirst = insertNumber(array,0,25);
		int[] arrayActualMiddle = insertNumber(array,2,25); 
        assertArrayEquals(arrayExpectedLast, arrayActualLast);
        assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
        assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
	}
	@Test
	void removeNumberTest() {
		int[] arrayExpectedLast = {10,25,30,40}; 
		int[] arrayExpectedFirst = {25,30,40,100};
		int[] arrayExpectedMiddle = {10,25,40,100};
		int[] arrayActualLast = removeNumber(array, array.length -1);
		int[] arrayActualFirst = removeNumber(array, 0);
		int[] arrayActualMiddle = removeNumber(array,2);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
        assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
        assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
	}
	@Test
	void insertSortedTest() {
		int[] arrayExpectedLast = {10,25,30,40,100,150}; 
		int[] arrayExpectedFirst = {10,10,25,30,40,100};
		int[] arrayExpectedMiddle = {10,25,30,35,40,100};
		int[] arrayActualLast = insertSorted(array, 150);
		int[] arrayActualFirst = insertSorted(array, 10);
		int[] arrayActualMiddle = insertSorted(array,35);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
        assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
        assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
	 }
	@Test
	void copyOfTest() {
		int[] arrayExpectedSameLength = {10,25,30,40,100};
		int[] arrayExpectedLessLength = {10,25,30};
		int[] arrayExpectedGreaterLength = {10,25,30,40,100,0};
	    int[] arrayActualSameLength = Arrays.copyOf(array, array.length);
	    int[] arrayActualLessLength = Arrays.copyOf(array, array.length - 2);
	    int[] arrayActualGreaterLength = Arrays.copyOf(array, array.length + 1);
	    assertArrayEquals(arrayExpectedSameLength,arrayActualSameLength);
	    assertArrayEquals(arrayExpectedLessLength,arrayActualLessLength);
	    assertArrayEquals(arrayExpectedGreaterLength,arrayActualGreaterLength);
	}
	}


