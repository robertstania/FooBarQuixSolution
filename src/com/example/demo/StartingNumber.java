package com.example.demo;

public class StartingNumber implements Strategy
{
	public String doOperation (int startingNumber)
	{
		String result  = "";
		
		if ( startingNumber % 3 == 0 )
		{
			result += "Foo";
		}
		if ( startingNumber % 5 == 0 )
		{
			result += "Bar";
		}
		if ( startingNumber % 7 == 0 )
		{
			result += "Qix";
		}
		String convertedNumber = Integer.toString ( startingNumber );
		
		for ( int i = 0 ; i < convertedNumber.length ( ) ; i++ )
		{
			char c = convertedNumber.charAt ( i );
			if ( c == '3' )
			{
				result += "Foo";
			}
			if ( c == '5' )
			{
				result += "Bar";
			}
			if ( c == '7' )
			{
				result += "Qix";
			}
		}
		return result ;
	}
}

