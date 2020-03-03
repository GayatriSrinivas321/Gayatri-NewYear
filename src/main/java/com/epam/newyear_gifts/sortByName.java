package com.epam.newyear_gifts;

import java.util.Comparator;

public class sortByName implements Comparator<Candies>{
	    public int compare(Candies candy1, Candies candy2) {
	    	return candy1.candyname.compareTo(candy2.candyname);
	    }
}
