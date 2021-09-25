package test;

import java.util.Date;

public class TimeTest{
	public static long timeToMillis(){
		return new Date().getTime();
	}

	public static int toSec(long ms){
		return (int)ms/1000;
	}

	public static int toMinute(int sec){
		return sec/60;
	}

	public static void main(String[]args){
		long start = timeToMillis();

		while(timeToMillis()-start < 5000){
			System.out.println(toSec(timeToMillis()-start));
		}
	}
}
