package com.example.demo;

public class FooBarQuixStrategyDemo
{
	public static void main ( String[] args )
	{
		Context context = new Context(new StartingNumber());
		System.out.println( context.executeStrategy(1));
		System.out.println( context.executeStrategy(2));
		System.out.println( context.executeStrategy(3));
		System.out.println( context.executeStrategy(4));
		System.out.println( context.executeStrategy(5));
		System.out.println( context.executeStrategy(6));
		System.out.println( context.executeStrategy(7));
		System.out.println( context.executeStrategy(8));
		System.out.println( context.executeStrategy(9));
		System.out.println( context.executeStrategy(10));
		System.out.println( context.executeStrategy(13));
		System.out.println( context.executeStrategy(15));
		System.out.println( context.executeStrategy(21));
		System.out.println( context.executeStrategy(33));
		System.out.println( context.executeStrategy(51));
		System.out.println( context.executeStrategy(53));
	}
}



