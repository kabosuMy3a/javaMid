package edu.handong.csee.java;

import java.text.SimpleDateFormat ;
import java.util.Date ;


public class Counter {

	private static int count = 0;
	private long credit ; 
	Counter () {
	
		count++;
		credit = 5741_5151_1414_1242_1L ;
		System.out.println(count);
		System.out.println(credit);
		System.out.println(credit+count);

	}

	public static String getCurrentDate(String fmt){


		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date()) ;

	}

	public static void main(String[] args) {

		Counter c1 = new Counter();
		Counter c2 = new Counter();
		System.out.println(Counter.getCurrentDate("yyyyMMdd"));
	}

}
