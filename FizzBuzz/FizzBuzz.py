#Fizz Buzz
#For multiples of 3 --> Fizz 
#For multiples of 5 --> Buzz 
#For multiples of both --> FizzBuzz

def main(): 
	#count and print numbers 1 to 100

	for i in range (1, 100): 
		if i % 15 == 0: 
			print ("FizzBuzz")

		elif i % 3 == 0: 
			print("Fizz")

		elif i % 5 == 0: 
			print("Buzz")

		else: 
			print(i)
main()
