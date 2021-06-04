package com.fdmgroup.ood.examples.loops;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

import com.fdmgroup.ood.datatypes.Book;

public class MoreLoops {

	public static void main(String[] args) {
		System.out.println(sumRange(1, 10));
		printMultiplicationTables(9);
		multipleLoopTypes();
		showRemovingFromCollection();
	}

	public static void multipleLoopTypes() {
		// using more than one variable in a loop
		for (int i = 4, j = 1, k = 2; i > 3 && k < 10; i++, k++) {
			j++;
			System.out.println("i= " + i + " j=" + j + " k=" + k);
		}

		// Missing out sections of the for loop
		int counter = 0;
		for (; counter < 5;) {
			System.out.println(counter);
			counter++;
		}
	}

	public static void printMultiplicationTables(int number) {
		System.out.println("Multiplication table " + number);
		for (int counter = 1; counter <= 10; counter++) {
			System.out.println(number + " x " + counter + " = " + (number * counter));
		}
	}

	public static int sumRange(int lowerbound, int upperbound) {
		int sum = 0;

		// for loop from lower to upper bound
		for (int i = lowerbound; i <= upperbound; i++) {
			sum += i;
		}

		// while loop from lower to upper bound
		int i = lowerbound;
		while (i <= upperbound) {
			sum += i;
			i++;
		}

		// do while
		i = lowerbound;
		do {
			sum += i;
			i++;
		} while (i <= upperbound);

		return sum;
	}

	public static void showRemovingFromCollection() {
		Book myFirstBook = new Book("My First", 9.99);
		Book mySecondBook = new Book("My Second", 15.99);
		// List needs importing
		List<Book> myBooks = new ArrayList<>();
		myBooks.add(myFirstBook);
		myBooks.add(mySecondBook);
		for (Book book : myBooks) {
			myBooks.remove(book);
			System.out.println(book);
		}
	}

	// ConcurrentModificationException - modifying a loop whilst checking the
	// contents
	/*
	 * for (Book book : myBooks) { if (book.equals(myFirstBook)) {
	 * myBooks.remove(book); } }
	 */
	// Using a safe Iterator
//	for(
//
//	Iterator<Book> iterator = myBooks.iterator();iterator.hasNext();)
//	{
//		Book book = iterator.next();
//		if (book.equals(myFirstBook)) {
//			iterator.remove();
//		}
//	}
//
//	// Or while with an Iterator
//	Iterator<Book> iterator = myBooks.iterator();while(iterator.hasNext())
//	{
//		if (iterator.next().equals(myFirstBook)) {
//			iterator.remove();
//		}
//	}

}
