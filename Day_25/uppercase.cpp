/*
  Date : 3 october 2024
  Write a c++ program to print String in Uppercase
  Expected Output :    Original sentence: chatrapati shivaji maharaj
		       Uppercase Sentence :  CHATRAPATI SHIVAJI MAHARAJ

  			
*/

#include <iostream>
#include <string>
using namespace std;

int main() 
{
    char str[] = "chatrapati shivaji maharaj";

    cout << "Original sentence: " << str << endl;

    cout << "Uppercase sentence: ";
    for (int i = 0; str[i] != '\0'; i++)
     {
        char ch = toupper(str[i]);
        cout << ch;
    }
    cout << endl;

    return 0;
}



/*
	Output :
			 Original sentence: chatrapati shivaji maharaj
		         Uppercase Sentence :  CHATRAPATI SHIVAJI MAHARAJ

*/
