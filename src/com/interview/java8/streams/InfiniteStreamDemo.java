package com.interview.java8.streams;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamDemo {

	public static void main(String[] args) {
		
		Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);
		List<Integer> collect = infiniteStream.limit(10).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		infiniteStream = Stream.iterate(2, i -> i * 2);
		List<Integer> collect2 = infiniteStream.limit(5).collect(Collectors.toList());
		collect2.forEach(System.out::println);
	
		Supplier<UUID> randomUUIDs = UUID :: randomUUID;
		Stream<UUID> generate = Stream.generate(randomUUIDs);
		List<UUID> uuidList = generate.skip(5).limit(5).collect(Collectors.toList());
		uuidList.forEach(System.out::println);
	}

}
