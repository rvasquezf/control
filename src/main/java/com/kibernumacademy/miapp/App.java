package com.kibernumacademy.miapp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

  public static int calculateSum(List<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * 2)
            .sum();
  }
  
//  public static int calculateProduct(List<Integer> numbers) {
//	    return numbers.stream()
//	            .filter(n -> n % 2 == 0)
//	            .mapToInt(n -> n * 2)
//	            .reduce(1, (a, b) -> a * b);
//	}
  
  public static double calculateAverage(List<Integer> numbers) {
	    return numbers.stream()
	            .filter(n -> n % 2 == 0)
	            .mapToDouble(n -> n)
	            .average()
	            .orElse(0.0);
	}
  
  
  public static List<String> convertToUpperCase(List<String> strings) {
    return strings.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
}
  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("La suma es: " + calculateSum(numbers));
    System.out.println("El promedio es: " + calculateAverage(numbers));

    List<String> strings = Arrays.asList("control", "inventario", "grupo", "3");
    System.out.println("Las palabras en mayúsculas son: " + convertToUpperCase(strings));
  }
  

}
