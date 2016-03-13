package com.Session3.Assignment3;

import java.util.Random;
import java.util.Scanner;
public class RendomNumber {

	/*
	 * Problem :
	 * Write a java program which generates a random number such that 0 <= Random Number <= N- 1 * where N is a given input number.
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Please enter a integer number for max limit of random number: ");
		Scanner scan = new Scanner(System.in);
		RandomNumberCalculator random = new RandomNumberCalculator(scan.nextInt());
		System.out.println("Random number is : "+random.generateNumber());
	}
}


class RandomNumberCalculator
{
	private int number;
	
	public RandomNumberCalculator(int number)
	{
		this.number = number;
	}
	
	public int generateNumber()
	{
		Random rand = new Random();
		return rand.nextInt(this.number);
	}
}