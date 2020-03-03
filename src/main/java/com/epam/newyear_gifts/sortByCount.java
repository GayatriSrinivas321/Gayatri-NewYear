package com.epam.newyear_gifts;

import java.util.Comparator;

public  class sortByCount implements Comparator<Gifts>{
    public int compare(Gifts gift1, Gifts gift2) {
    	return gift1.count - gift2.count;
    }

}
