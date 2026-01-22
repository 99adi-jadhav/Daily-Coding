/*
  Date : 30 sept 2024
  Write a c++ program to print String only letters which are capital
  Expected Output :     Original sentence: Chatrapati Shivaji Maharaj
			Uppercase Letters: CSM

  			
*/

#include <iostream>
#include <ctype.h>

using namespace std;

int main() 
{
    char str[] = "Chatrapati Shivaji Maharaj";
	
    cout << "\nOriginal sentence: " << str << endl;

    cout << "Uppercase Letters: ";
    for (int i = 0; str[i] != '\0'; i++) 
    {
        if (isupper(str[i])) 
        {
            cout << str[i];
        }
    }
    cout << endl;

    return 0;
}



/*
	Output :
			Original sentence: chatrapati shivaji maharaj 
			Uppercase Letters: CSM
*/
