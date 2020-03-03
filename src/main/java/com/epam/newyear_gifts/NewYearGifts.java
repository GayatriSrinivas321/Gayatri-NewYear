package com.epam.newyear_gifts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewYearGifts {
	Scanner sc = new Scanner(System.in);
	int noOfCandies;
	int noOfGifts;
	int noOfSweets;
	static List<Candies> candies = new ArrayList<Candies>();
	static List<Sweets> sweets = new ArrayList<Sweets>();
	static List<Gifts> gifts = new ArrayList<Gifts>();
	
	 public void input() {
		 NewYearGifts new_year = new NewYearGifts();
		 new_year.enterCandies(candies);
		 new_year.enterSweets(sweets);
		 new_year.enterGifts(gifts);
		 
		 while(true) {
			 System.out.println("Enter your choice: 1.Display Candies according to their names\n2.Display all the asweets according to their price\n3.Display all the gifts\n4.exit");
			 int input = sc.nextInt();
			 if(input == 4) {
				 break;
			 }
			new_year.choice(input);
		 }
	 }
		
		 public void choice(int input) {
			 switch(input) {
			 case 1 :
				 Collections.sort(candies,  new sortByName());
				 for(int i = 0; i < noOfCandies; i++) {
					 System.out.println(candies.get(i) + " ");
				 }
				 break;
			 case 2 :
				 Collections.sort(sweets,  new sortByPriceSweets());
				 for(int i = 0; i < noOfSweets; i++) {
					 System.out.println(sweets.get(i) + " ");
				 }
				 break;
			 case 3 :
				 Collections.sort(gifts,  new sortByCount());
				 for(int i = 0; i < noOfGifts; i++) {
					 System.out.println(gifts.get(i) + " ");
				 }
				 break;
			 case 4 :
				 break;
			 default :
				 System.out.println("Invalid Input");
				 break;
					 
			 }
			 
		 }
		 
		public void enterGifts(List<Gifts> gifts) {
			 System.out.println("Enter the number of gifts");
			 noOfGifts = sc.nextInt();
			 System.out.println("Enter the name, weigth, price ,no of items,the Gift");
			 for(int i = 0;i < noOfGifts;i++) {
				 Gifts gift = new Gifts(sc.next(), sc.nextFloat(),sc.nextInt(),sc.nextInt());
				 gifts.add(gift);
			 }
		 }
		 
		 public void enterCandies(List<Candies> candies) {
			 System.out.println("Enter the number of candies");
			 noOfCandies = sc.nextInt();
			 System.out.println("Enter the name, weigth, price of the Candy");
			 for(int i = 0;i < noOfCandies;i++) {
				 Candies candy = new Candies(sc.next(), sc.nextFloat(),sc.nextInt());
				 candies.add(candy);
			 }
		 }
		 
		 public void enterSweets(List<Sweets> candies) {
			 System.out.println("Ener the number of sweets");
			 noOfSweets = sc.nextInt();
			 System.out.println("Enter the name, weigth, price of the Candy");
			 for(int i = 0;i < noOfSweets;i++) {
				 Sweets s = new Sweets(sc.next(), sc.nextFloat(),sc.nextInt());
				 sweets.add(s);
			 }
		 }	
	 
}