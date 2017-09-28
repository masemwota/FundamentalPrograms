//Fizz Buzz
//For multiples of 3 --> Fizz 
//For multiples of 5 --> Buzz 
//For multiples of both --> FizzBuzz

public static void main(String [] args) 
{
	//count and print from 1 to 100
	for(int i = 0; i <= 100; i++)
	{
		//check multiples 
		if(i % 15 == 0)
			System.out.println("FizzBuzz");

		else if(i % 3 == 0)
			System.out.println("Fizz");

		else  if (i % 5 == 0)
			System.out.println("Buzz");

		else 
			Sysem.out.println(i);
	}
}