/*
 Date : 22 sept 2024
 Write a c++ program to print Fibonacci Series
 Expected output : Fibonacci Series 5 is :
	       	   0 1 1 2 3 
*/



#include <iostream>

using namespace std;

int main() 
{
    int num = 5; 
    int firstTerm = 0, secondTerm = 1;

    cout << "Fibonacci Series is " << num << endl;

    for (int i = 1; i <= num; ++i) 
    {
        cout << firstTerm << " ";

        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }

    cout << endl;
    return 0;
}



/* 

	output : Fibonacci Series 5 is :
		 0 1 1 2 3 

*/
