
package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BasicStreams {
	
	public static void main(String[] args) {
//		getEvenNumbers();
//		convertUpperCase();
		sortAList();
//		startsWithCertainChar();
//		findFirstMatch();
//		removeNull();
		sortByLength();
	//	arithmetics();
		
	}

	public static void getEvenNumbers() {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,13,5,16,19,3,26);
		List<Integer> evenList =
				list.stream().filter(n -> n %2 == 0).
				collect(Collectors.toList());
		System.out.println("Even Numbers::"+ evenList); 
		
	}
	
	public static void convertUpperCase() {
		List<String> lowerCase = Arrays.asList("Apple", "Banana", "Cherry", "Dates", "Plums");
		List<String> convertedCase = lowerCase.stream().
				map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Converted Case::"+ convertedCase);
				
	}
	
	public static void sortAList() {
		List<String>inputLength = Arrays.asList("tree","for","welcome","usa","go","bunch");
		List<String> sortedList = inputLength.stream().
				sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		System.out.println("Sorted List::"+ sortedList);
	}
	
	public static void startsWithCertainChar() {
		List<String> inputList = Arrays.asList("cherry", "apple", "umbrella", "base", "Ant");
		int count =(int) inputList.stream().filter(s -> s.toLowerCase().startsWith("b")).count();
		System.out.println("Count::"+count);
	}
	
	private static void findFirstMatch() {
		List<String> inputList = Arrays.asList("cherry", "apple","amla", "umbrella", "base", "Ant");
		Optional<String> matchedStr = inputList.stream().
				filter(s -> s.startsWith("A")).
				findFirst();
		 matchedStr.ifPresent(System.out::println); 
		
	}
	
	private static void removeNull() {
		List<String> input = Arrays.asList("apple", "", null, "banana", " ", "cherry");
		List<String> result = input.stream().filter(Objects::nonNull).filter(s -> !s.trim().isEmpty()).
			collect(Collectors.toList());
		System.out.println("NonNull chars: "+result);
	}
	
	private static void sortByLength() {
		List<String> words = Arrays.asList("tree", "welcome", "usa", "for", "go", "bunch");
		List<String> sorted = words.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println("SortedLength: "+sorted);
	}
	
	private static void arithmetics() {
		List<Integer> inputs = Arrays.asList(1,2,3,4,6,9,13,5,16);
		//1. Sum
		int sum = inputs.stream().reduce(0, (a,b) -> (a+b));
		System.out.println("Sum:" +sum);
		//2. Product
		int product = inputs.stream().reduce(1, (a,b)-> a*b);
		System.out.println("Product: "+product);
		//3. Average
		double avg = inputs.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("Average: "+avg);
		//4. Min
		int min = inputs.stream().mapToInt(Integer::intValue).min().orElseThrow(NoSuchElementException::new);
		System.out.println("Minimum: "+min);
		
		//5.Max
		int max = inputs.stream().mapToInt(Integer::intValue).max().orElseThrow(NoSuchElementException::new);
		System.out.println("Maximum: "+max);
		
		//6. Modulus
		List<Integer> divide = inputs.stream().map(n -> n / 2).collect(Collectors.toList());
		System.out.println("Divide by 2: "+divide);
		
	}
}
