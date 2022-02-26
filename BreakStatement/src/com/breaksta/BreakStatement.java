package com.breaksta;

public class BreakStatement {
	
	public static void main(String[] args)
	{
		int i;
		char c;
		for(i=1; i<=10;i++)
		{
			if(i==7)
			{
				break;
			}
			System.out.println(i);
		}
		for(c='a'; c<='z'; c++)
		{
			if(c=='j')
			{
				continue;
			}
			System.out.println(c);
		}
	}

}
