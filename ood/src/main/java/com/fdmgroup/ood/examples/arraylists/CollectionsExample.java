package com.fdmgroup.ood.examples.arraylists;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(35);
		ages.add(20);
		ages.add(45);
		ages.add(35);
		ages.add(20);
		System.out.println(Collections.frequency(ages, 35)); // 2
		System.out.println(Collections.max(ages)); // 45
		System.out.println(Collections.min(ages)); // 20
		Collections.sort(ages);
		System.out.println(ages); // [20, 20, 35, 35, 45]
	}
}