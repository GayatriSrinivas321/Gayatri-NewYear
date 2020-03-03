package com.epam.newyear_gifts;

import java.util.Comparator;

public class sortByPriceSweets implements Comparator<Sweets> {
	public int compare (Sweets sweet1, Sweets sweet2) {
		return sweet1.price - sweet2.price;
	}

}
