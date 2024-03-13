package backend.utils;
import java.util.Arrays;

public class ArraysInt {
  
	public static int[] addNumber(int[] array, int number) {
	 int [] result = Arrays.copyOf(array, array.length +1);
	 result[result.length-1] = number;
	  return result;
  }
 
 public static int[] insertNumber(int[] array, int index, int number) {
    int [] result = new int[array.length + 1];
    System.arraycopy(array, 0, result, 0,index);
    result[index] = number;
    System.arraycopy(array, index, result, index + 1, array.length - index);
	 return result;
 }
 
 public static int[] removeNumber(int[] array, int index) {
    //TODO
    //apply method arrayCopy of class System
	 return null;
    }

 public static int[] insertSorted(int[] sortedArray, int number) {
   //TODO
   //insert number into sorted array with keeping the sorted order
   //apply method binarySearch of class Arrays
	 return null;
   }
}

