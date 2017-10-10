package com.accenture.demo.tdd;

public class StringCalculator {

	public int add(String strNumber) {
		int returnValue = 0;

		String[] numbersArray = strNumber.split(",");
		if (numbersArray.length > 2) {
			throw new RuntimeException("only 2 numbers allowed.");
		}

		for (String number : numbersArray) {
			if (!number.isEmpty()) {
				returnValue += Integer.parseInt(number);
			}
		}
		return returnValue;
	}

}
