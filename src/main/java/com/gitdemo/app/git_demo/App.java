package com.gitdemo.app.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data)
	{
		
		
		if(data.equals(Constant.DATA_TYPE))
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Bye........");
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
