# MakeChangeProject

## Overview

- General Starter Setup
	Import Scanner, declare a variable for it, close at the end of main method.
	
- User Story #1 & 2
	Standard sysout println scanner initialization using the user input.

- User Story #3
	If, else if, and else statements using boolean expressions determine if the
	amounts entered result in insufficient funds, exact amounts, or that change
	is needed. For the first and second instances, sysout printlns say as much and
	end the program.

- User Story #4
	The else statement is dedicated to calculating change using methods for each
	denomination which then return the quantities of each.
	Each denomination method begins by determining if it's needed at all using
	boolean expressions ('change >= denomination value).
	The methods utilize modulus, casting, and normal math functions.
	When I reached the coin types, I decided that I needed to create a 'getCoins'
	method and use the resulting 'coin' value for the coin denominations, factoring
	out the dollar bills.
	
	Once all methods were complete, testing began using a plethora of values.
	A road block was hit when I was unable to figure out why I was off by 1 penny
	multiple times (Time for a break).

	After a good nights sleep and time away from the screen, I figured it out!
	We were given a hint that we might need to add 0.005 somewhere. After some trial
	and error, I got everything in the right order.
	Line 12: Declare & initialize 'change'
	Line 13: Declare & initialize 'rounded' and use Math.round() to 2 decimal
	places. This cleans up the number for when it prints out (Line 23).
	Line 14: Then and only then add that 0.005 to 'change', make sure to use this in
	the 'getCoins' method so that the pennies value is correct.

- Moment of Truth
	I tested all examples given in the instructions (multiple times): all good
	I had my husband throw out random numbers: all good
	Project #1 Complete!

## Technologies Used
- Java
- Eclipse
- Git
- Google - Stack Overflow
- Saturday TA (Thank you!)

## Lessons Learned
- Methods Inception
- Modulus
- Casting
- Math functions (java.lang.Math)
- if, else if, else