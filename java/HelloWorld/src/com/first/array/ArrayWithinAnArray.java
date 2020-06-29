package com.first.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayWithinAnArray{
   public static void main(String args[]) {
	   Integer[] myArray1 = {23, 56, 78};
      Integer[] myArray2 = {123, 156, 178, 191};
      Integer[] myArray3 = {223, 256, 278, 291};
      Integer[] myArray4 = {323, 356, 378, 391};
      Integer [][] arrayOfArrays = {myArray1, myArray2, myArray3, myArray4};
      arrayOfArrays[0] = new Integer[]{1, 2, 3, 4, 5};
      System.out.println(Arrays.deepToString(arrayOfArrays));
      
      Stream<Integer[]> stream = Arrays.stream(arrayOfArrays);
      stream.forEach(ele -> {
    	  for(int element : ele) {
    		  System.out.println(element);
    	  }
      });
      
      List<ArrayDemo> list = Arrays.asList(new ArrayDemo(), new ArrayDemo());
      
      IntStream iStream = IntStream.range(1,100);
      iStream.map(operand->operand*2).forEach(System.out::println);
   }
}