package assignment3June27;

import java.util.Random;

public class RandomNumberDistinguishImpl  
{  
	public static void main(String args[])   
	{   
		randomNumber rn = new randomNumber();
		rn.start();
		checkNumber cn = new checkNumber();
		cn.start();
	} 
}	
	
class randomNumber extends Thread
{
	public void run()
	{
		try {
			for(int i=0;i<10;i++)
			{
				Random random=new Random();
				int num = random.nextInt((50 - 10)) - 10;
				Thread.sleep(1000);
				System.out.println("Random number is " +num);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class checkNumber extends Thread
{
	public void run()
	{
		try {
//			ThreadLocalRandom num = ThreadLocalRandom.current();
			for(int i=0;i<10;i++)
			{
				Random random=new Random();
				int num = random.nextInt((50 - 10)) - 10;
				Thread.sleep(1000);
				if(num>=0) {
					System.out.println(num+" is a positive random number ");
				}
				else {
					System.out.println(num+" is a negative random number");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
 