/*
* This is the file with your answer, do not rename or move it.
* Write your code in it, and save it before submitting your answer.
*/

#include <iostream>
#include <string>
#include <cstring>
#include <cstdlib>
#include <cstdio>
using namespace std;


// ----------------------------------------------------------------------------

/**
 * Abbreviates name passed into function. The abbreviated version contains just
 * the first letter of each personal name, and the full last name.
 *
 * @par Examples:
 * - "John Smith" becomes "J. Smith"
 * - "Bob Alan Faria Stewart" becomes "B. A. F. Stewart"
 *
 * This method declaration must be kept unmodified.
 *
 * @param full_name: Input string containing name.
 * @return Abbreviated version of name.
 */
string abbreviateFullName(string fullName) 
{ 
    string answer = "";
    bool space = false;
    string point = ". ";

    for(int i = fullName.length(); i >= 0; i--)
	{
		switch(fullName[i]) {
			case ' ':
				space = true;
			break;
			default:
				if(!space) {
					answer = fullName[i] + answer;
				} else {
					if(i > 0 && fullName[i-1] == ' ')
						answer = fullName[i] + point + answer;
					else if(i == 0)
						answer = fullName[i] + point + answer;
				}	
		}
	}
    return answer + "\0";
}

// ----------------------------------------------------------------------------

#ifdef USE_MAIN

void checkName( const string fullName )
{
    string answer = abbreviateFullName( fullName );

    cout << "name: " << fullName << "   abbreviated name: " << answer << "\n";

}

// ----------------------------------------------------------------------------

/**
 * Tests the checkName function.
 * This test code is provided only for your convenience.
 */
int main()
{
    checkName( "John Smith" );
    checkName( "Anna Maria Simpson" );
    checkName( "Bob Alan Faria Stewart" );

    return 0;
}

#endif

// ----------------------------------------------------------------------------
 

 