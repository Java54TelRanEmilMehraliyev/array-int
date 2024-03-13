package backend.utils;
import java.util.Arrays;

public class ArraysInt {
  
	public static int[] addNumber(int[] array, int number) {
	 int [] result = Arrays.copyOf(array, array.length +1);
	 result[result.length-1] = number;
	  return result;
  }
 
	 public static int[] insertNumber(int[] array, int index, int number) {
		    int [] result = array;
		    if(index > -1 && index <=array.length) {
		    	result = new int[array.length +1];
		    }
		    System.arraycopy(array, 0, result, 0,index);
		    result[index] = number;
		    System.arraycopy(array, index, result, index + 1, array.length - index);
			 return result;
		 }
 
 public static int[] removeNumber(int[] array, int index) {
    int [] result = array;
    if(index > -1 && index <= array.length) {
    	result = new int[array.length - 1];
    	System.arraycopy(array, 0, result, 0, index);
    	System.arraycopy(array, index + 1, result, index, result.length-index);
    }
	 return result;
    }

 public static int[] insertSorted(int[] sortedArray, int number) {
   //TODO
   //insert number into sorted array with keeping the sorted order
   //apply method binarySearch of class Arrays
	 int [] newArray = addNumber(sortedArray,number);
	 Arrays.sort(newArray);
	 
	 int index = Arrays.binarySearch(sortedArray, number);
	 
	 return new int[] {index};
   }
}

