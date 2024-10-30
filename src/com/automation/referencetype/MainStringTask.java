package com.automation.referencetype;
import java.util.Scanner;

/*
Task 1
A string is given. Output the first, last and middle (if any) characters. Write a program
that outputs the part of the string up to and including the first point encountered. Also
provide for outputting the number of spaces.

Task 2
Find a specified substring in a string and replace it with a new substring. The user
enters the string, its substring to replace and the new substring.

Task 3
A string of words separated by spaces is entered. Find the longest word and display it
on the screen. The case when there may be several longest words is not handled.
 */

public class MainStringTask {
    public static void main(String[] args) {
        String str = "A string is given. Output the first, last and middle (if any) characters.";
        // Output the first, last and middle (if any) characters
        System.out.println("The string is: " + str);
        System.out.println("First character: " + str.charAt(0)  + " The last character: " + str.charAt(str.length()-1) + " The middle character: " + str.charAt((str.length()-1)/2));

        // Output the part of the string up to and including the first point encountered
        int charPosition = str.indexOf(".");
        System.out.println(str.substring(0, charPosition + 1));

        // Output the number of spaces.
        String[] newStr = str.split(" ");
        int strLength = newStr.length - 1;
        System.out.println("Amount of the spaces: " + strLength);

        //Enter the string, substring to replace and the new substring. Exchange part of the string
        // by the new part and output new string.
        repalaceString();

        //Find the longest word and display it on the screen.
        theLongestWord();

    }

    static void repalaceString() {
        Scanner scan = new Scanner(System.in);
        String mainStr = scan.nextLine();  //Enter full string
        String replaceBlock = scan.nextLine();  //Enter part for replace
        String newPart = scan.nextLine();    //Enter new Part
        String newString = new String();     //Create empty string

        //Split main string and create array
        String[] arrayStr = mainStr.split(" ");
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].equals(replaceBlock)) {  //Compare element of string array with part that will be replaced
                arrayStr[i] = newPart;
            }
            newString = newString.concat(arrayStr[i]).concat(" "); //Creating a new string
        }
        System.out.println(newString);
    }

    static void theLongestWord() {
        Scanner scan = new Scanner(System.in);
        String mainStr = scan.nextLine();   //Enter full string
        String newString = new String();     //Create empty string
        String[] arrayStr = mainStr.split(" "); //Split main string and create array
        String maxElem = new String();

        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].length() > maxElem.length()) {   //Find Element with max length
                maxElem = arrayStr[i];
            }
        }
        System.out.println(maxElem);  //Output Element with max length
    }
}
