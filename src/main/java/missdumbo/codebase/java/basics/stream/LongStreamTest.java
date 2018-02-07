package missdumbo.codebase.java.basics.stream;

import java.util.stream.LongStream;

public class LongStreamTest {
	public static void main(String[] args) {
		final int n = 5;
		LongStream ls = LongStream.range(1, n);
		System.out.println("average:" + ls.average().getAsDouble());
		ls = LongStream.range(1, n);
		System.out.println("count:" + ls.count());
		ls = LongStream.range(1, n);
		System.out.println("sum:" + ls.sum());
		ls = LongStream.range(1, n);
		System.out.println("max:" + ls.max().getAsLong());
		ls = LongStream.range(1, n);
		System.out.println("min:" + ls.min().getAsLong());
		
		ls = LongStream.range(1, n);
		long factorial = ls.reduce(1, (long a, long b) -> a * b);
		System.out.println("factorial:" + factorial);
		ls.close();
	}
}
