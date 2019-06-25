package ac.scggi.app.lambda;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BiFuncTest {
	public static void main(String[] args) {
		BiFunction<Double, String, Long> adderToLong = (d, s) -> (long)(d+Long.parseLong(s));
		Function<Long, BigDecimal> bigDecimalConverter = l -> BigDecimal.valueOf(l);
		
		BiFunction<Double, String, BigDecimal> biFunc = adderToLong.andThen(bigDecimalConverter);
		
		BigDecimal bd = biFunc.apply(20.33d, "34");
		System.out.println(bd);
		
		Comparator<Integer> comp = (a, b) -> a.compareTo(b);
		
		BinaryOperator<Integer> opMax = BinaryOperator.maxBy(comp);
		
		System.out.println(opMax.apply(5, 6));
		
		System.out.println(BinaryOperator.minBy(comp).apply(5, 6));
		
	}
}
