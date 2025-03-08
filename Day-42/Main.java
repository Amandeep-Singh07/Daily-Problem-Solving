// Problem Statement



// Eric operates a taxi service and charges passengers based on the distance traveled and the waiting time. The total fare is calculated using a base fare, cost per mile, and cost per minute of wait time.



// Implement this calculation using an abstract class `FareCalculator` and an interface `FareDetails`. The abstract class should define an abstract method `calculateFare`, while the interface should declare constants for base fare, cost per mile, and cost per minute.



// Formula: 

// Total Fare = base fare + (distance * cost per mile) + (waiting time * cost per minute)



// Eric's Standard Fee Structure:

// Base fare = 3.50
// Cost per mile = 2.50
// Cost per minute = 0.20
// Input format :
// The first line of the input consists of a double value representing the distance traveled in miles.

// The second line consists of an integer representing the waiting time in minutes (a non-negative value).

// Output format :
// The output prints "Total Fare: " followed by a double value representing the total fare, rounded to two decimal places.



// Refer to the sample output formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 0.0 ≤ distance travelled ≤ 50.0

// 1 ≤ waiting time ≤ 60

// Sample test cases :
// Input 1 :
// 7.3
// 6
// Output 1 :
// Total Fare: 22.95
// Input 2 :
// 13.25
// 5
// Output 2 :
// Total Fare: 37.63

