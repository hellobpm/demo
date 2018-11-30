package jj.spring.boot.demo;

import java.util.stream.Stream;

public class AAA {

	public static void main(String[] args) {
		System.out.println("AAA.main");
		Stream.of(1, 2, 3).forEach(System.out::println);
	}
}
