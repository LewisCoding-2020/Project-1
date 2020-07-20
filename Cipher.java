//**********************************************************
//	SU20 CPSC 50100 Programming Fundamentals
//	Tracy B
//	PROGRAMMING ASSIGNMENT 1
//**********************************************************

import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {

		System.out.println("Welcome to the Cipher program. ");
		System.out.println("Please enter 5 numbers from 0 and 19 ");
		
		int num1, num2, num3, num4, num5;
		int numGuess1 = 0;
		int numGuess2 = 0;
		int numGuess3 = 0;
		int numGuess4 = 0;
		int numGuess5 = 0;
		int random;
		int encodedNum;
		
		Scanner scan = new Scanner(System.in);
		Random key = new Random();
		random = key.nextInt(9) + 1;  //generates random from 0-9

		System.out.print("1st number:  ");
		num1 = scan.nextInt();
		numGuess1=num1;
			if (num1 > 0 && num1 < 19)
			{	System.out.print("2nd number:  ");
				num2 = scan.nextInt();
				numGuess2=num2;
				
				if (num2 > 0 && num2 < 19)
				{	System.out.print("3rd number:  ");
					num3 = scan.nextInt();
					numGuess3=num3;
				
			
					if (num3 > 0 && num3 < 19)
					{	System.out.print("4th number:  ");
						num4 = scan.nextInt();
						numGuess4=num4;
				
						if (num4 > 0 && num4 < 19)
						{	System.out.print("5th number:  ");
							num5 = scan.nextInt();
							numGuess5=num5;
			
							if (num5 > 0 && num5 < 19)
							{	System.out.println();
								int total = numGuess1 + numGuess2 + numGuess3 + numGuess4 + numGuess5;
								System.out.println("Total = " + total);
								System.out.println("Your random key is " + random);
								encodedNum = (total + random)%10;
								System.out.println("Your encoded number is " + encodedNum);
							}
							else	
							{	System.out.println("Please read directions and try again!");
							}
						}
						else	
						{	System.out.println("Please read directions and try again!");
						}
					}	
					else	
					{	System.out.println("Please read directions and try again!");
					}
				}	
				else	
				{	System.out.println("Please read directions and try again!");
				}
			}			
											
			else	
			{	System.out.println("Please read directions and try again!");
			}

			
			scan.close();


	}
}
