package com.epam.newyear_gifts;

public class Sweets {
       String sweetname;
       float weight;
       int price;
       
       public Sweets(String name, float weight, int price) {
    	   super();
    	   sweetname = name;
    	   this.weight = weight;
    	   this.price = price;
       }
       
       public Sweets() {
    	   super();
       }
       

	public String toString() {
    	   return "Sweets [sweetname=" + sweetname + ", weight = " + weight + ", price= "+price+"]";
       }
       
       public String getName() {
    	   return sweetname;
       }
       
       public void setName(String name) {
    	    sweetname = name;
       }
       
       public float getWeight() {
    	     return weight;   
       }
	 
       public int getprice() {
    	   return price;
       }
       
       void setPrice(int price) {
    	   this.price = price;
       }
       
       void setWeight(float weight) {
    	   this.weight = weight;
       }
}
