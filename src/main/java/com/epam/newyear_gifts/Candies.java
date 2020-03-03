package com.epam.newyear_gifts;

public class Candies {
    String candyname;
    float weight;
    int price;
    
    public Candies(String name, float weight, int price) {
 	   super();
 	   candyname = name;
 	   this.weight = weight;
 	   this.price = price;
    }
    
    public Candies() {
 	   super();
    }
    

	public String toString() {
 	   return "Candies [candyname=" + candyname + ", weight = " + weight + ", price= "+price+"]";
    }
    
    public String getName() {
 	   return candyname;
    }
    
    public void setName(String name) {
    	candyname = name;
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
