package com.epam.newyear_gifts;

//import java.util.ArrayList;

public class Gifts {
       String name;
       float weight;
       int price;
       int count;
       
       public Gifts(String name, float weight, int price,int count) {
    	   super();
    	   this.name = name;
    	   this.weight = weight;
    	   this.price = price;
    	   this.count = count;
       }
       
       public Gifts() {
    	   super();
       }
       

	public String toString() {
    	   return "Gifts [name=" + name + ", weight = " + weight + ", price= "+price+"]";
       }
       
       public String getName() {
    	   return name;
       }
       
       public void setName(String name) {
    	    this.name = name;
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
