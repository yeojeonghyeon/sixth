package com.first.wildcard;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class WildCardParam {
	public static void addNumbers(List<? super Integer> list) {
		IntStream.range(1, 11).forEach(new IntConsumer() {
			@Override
			public void accept(int ele) {
				list.add(ele);
			}
		});
	}
	public static void addNumbersUsingLambda(List<? super Integer> list) {
		IntStream.range(1, 11).forEach((ele)->list.add(ele));
	}
	public static void printAll(List<? extends Number> list) {
		list.stream().forEach((ele)->System.out.println(ele));
//		list.stream().forEach(System.out::println);
	}
}
class Client{
	public static void main(String[] args) {
		List<?> superList;
		List<? super Integer> stack = new Stack<Integer>();
		List<? super Integer> list = new ArrayList<Integer>();
		superList = stack;
		superList = list;
		WildCardParam.addNumbers(stack);
		WildCardParam.addNumbersUsingLambda(list);
		WildCardParam.printAll((List<? extends Number>)list);
		WildCardParam.printAll((Stack<Integer>)stack);
	}
}