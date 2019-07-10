package com.example.demo;

public class Context
{
	private Strategy strategy;
	
	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	public String executeStrategy(int startingNumber)
	{
		return strategy.doOperation(startingNumber);
	}
}