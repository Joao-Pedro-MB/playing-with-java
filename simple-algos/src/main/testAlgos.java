package main;

import props.Product;
import algo.algoDef;
import java.util.Scanner;

public class testAlgos {
	public static void main(String[] args) {

		Product products[] = {   
				new Product("Lamborghini", 1000000),
				new Product("Jipe", 46000),
				new Product("Brasília", 16000),
				new Product("Smart", 46000),
				new Product("Fusca", 17000),
		};

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Choose algo");

	    int choice = myObj.nextInt();
		    
		switch (choice) {
			case 1:
				int lowerValue = algoDef.findLowerValue(products, 0, 5);
				System.out.println(products[lowerValue].getPrice());
					
			case 2:
				algoDef.selectionSort(products);

			case 3:
				algoDef.insertionSort(products);

			case 4:
				algoDef.mergeSort(products, 0, products.length-1);
				algoDef.printOrder(products);
				
			case 5:
				algoDef.quickSort(products, 0, products.length-1);
				algoDef.printOrder(products);
		}
		
		myObj.close();
	}
}
