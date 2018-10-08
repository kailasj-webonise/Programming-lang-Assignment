/* Language: JAVA

   Why:  Among the languages known to me, I have choose JAVA beacuse the primary objective of Java programming language creation was to make it portable, simple and secure programming language. Also there some excellent features of java which make java popular among the other languages.*/


import java.io.*;//line1
class Assignment//line2
{               //line3
	public static void main(String args[]) throws IOException//line4
	{                                                      //line5
		String str;//line6
		int vowels = 0, digits = 0,spaces = 0;//line7
		char ch;  //line8

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//line9

		System.out.print("Enter a String : ");//line10
		str = br.readLine();       //line11

		for(int i = 0; i < str.length(); i++)//line12
		{                              //  line13
			ch = str.charAt(i);    //line14

			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')//line15
				vowels ++;             //line16
			else if(Character.isDigit(ch)) //line17
				digits ++;             //line18
			else if(Character.isWhitespace(ch))//line19
				spaces ++;             //line20
		}                                      //line21

		System.out.println("Vowels : " + vowels);//line22
		System.out.println("Digits : " + digits);//line23
		System.out.println("Spaces : " + spaces);//line24
	}//line25
}//line26

   /*output:
    Enter a String : kailas07 joshi
    Vowels : 5
    Digits : 2
    Spaces : 1
   */



/* Discription of each line */
 
/* Line1: line1 is a java headear file in which import is used for including something in our java program. IO is simply  input and output from the user to java          application. So if we have to take a input from the user then we have to use imoprt java.io.*;           */

/* line2: line 2 is simple decration of the class having the as Assignment.       /*

/* Line4: line4 is called as main method of the class. A program always start the exicution from main method. We can not change the format of the main method it should be  as it is only we can change is sequence of 'String' & 'args'. In main method 'public' is assess modifier which has to be public so that java runtime can execute this method. When java runtime starts, there is no object of the class present. That’s why the main method has to be static so that JVM can load the class into memory and call the main method. Every method should return something, MAIN method does not return anythink to JVM so that void return type is used. main is the name of java main method and it is fixed. String args[] this indicates that java main method accepts 1 string type argument. Also called as java command line argument. 
 There may be a possibel IOException and we  have to handel it. There are to ways to handel either use a try-catch block or use the 'throws IOException' at end of main method.                             */

/* Line 6,7,8: In these lines simple variabel declration and initialization is done. String , Integer and Character type variable's are declared.    */

/* Line 9: At this line  BufferedReader is a class used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. br is the objet of the class bufferedReader which is used to call the method readline(). IputStreamReader is passed as argument to bufferedReader class so the input will take from keyboard line by line.       */

/* Line 10: This line is used to print something on the output screen. 'System' is the class in the java.lang package. 'out' is static member of system class. 'println' is a method of java.io.PrintStream.        */

/* Line 11: In this line Readline() method is call which is bufferedReader method used to get input from the user. And storing the input in variable str.  */

/* Line 12: At this line there is a FOR loop in which three things are there which is initialization, Condition & Increment/Decrement. In the initialization a loop variable is initialize with a perticular value. Then the condition is given. Loop will exicute till the condition is true. After that variable increment or decrement is there.    */

/* Line 14: At this line singal charater from the string is stored to the varible 'ch' by using the charAt() method. This method is used to returns the character at the specified index. */

/* Line 15: This is the if condition means if the condition is satisfied only then the code below is exicuted otherwise not. */

/* Line 17: If the if condition is not true then else if condition is checked and if it is true then the code below it is exicuted ortherwise not.  */

/* Line 16,18 & 20: Only one of three lines will exicuted depending upon the condition.

/* line 22, 23 & 24: these are printf statements use to print on the output.   */


                                                       /* Exicution Process */


   /*   
           First we have to save the file having the name same as class name i.e Assignment having extention ".java". After that we have to compile the file using command "javac Assignment" if there is no error in the code compilation will be done. After that we have to run the file using " java Assignment" command.
Exicution will start from the main method. Variable's   vowels, digits & spaces are initialized to zero. Then a string is provided as input. After that for loop is exicuted. In the loop variable i is initialized with 0 and the loop will exicutes as many times as the number of character in the input string. Every time i is incremented by 1. After that character at the i location in the string is stored in the character ch. After that depending upon the character in ch one of the condition from if else ladder will be exicuted. And value of one of the variabel will be exicuted.There are three condition if the character is vowel then the variable vowel will be incrimented, if the character is digit then variable digit is incrimented by one and last if the character is blank or white spaces then varibale spaces is incrimented. And at the last total number of vowels, digits and spaces is printed.              
                                                                                                  */ 

                                                     



