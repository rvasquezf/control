package com.kibernumacademy.miapp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.annotations.common.util.impl.LoggerFactory;

public class App {
	
private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(App.class);
	
public static int calculateSum(List<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * 2)
            .sum();
  }
  
  
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
    
   
    LOGGER.info("La suma es: " + calculateSum(numbers));
    LOGGER.info("El promedio es: " + calculateAverage(numbers));

    List<String> strings = Arrays.asList("control", "inventario", "grupo", "3");
    
    LOGGER.info("Las palabras en mayúsculas son: " + convertToUpperCase(strings));
  }
  

}
