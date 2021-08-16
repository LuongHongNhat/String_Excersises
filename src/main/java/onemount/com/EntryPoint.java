package onemount.com;

import java.util.Scanner;

public class EntryPoint
{
    private static String inputString() {
        System.out.println("Input your string:");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        return inputString;
    }

    private static String inputChar() {
        System.out.println("Input your char:");
        Scanner sc = new Scanner(System.in);
        String inputChar = sc.nextLine();
        return inputChar;
    }

    public static void main( String[] args )
    {
        String inputStr = inputString();

        // Bai_1
        System.out.println("My Uppercase character in string are : " + String_Excersises.getUppercaseCharacter(inputStr));
        System.out.println("=============");

        // Bai_2
        System.out.println("String without numeric is : " + String_Excersises.nonNumericStr(inputStr));
        System.out.println("=============");

        // Bai_3
        System.out.println("Number of vowel & consonant are : " + String_Excersises.countVowelAndConsonant(inputStr));
        System.out.println("=============");

        // Bai_4
        String inputChar = inputChar();
        System.out.println("Total input char in string are : " + String_Excersises.countNumberOfCharAppear(inputStr,inputChar));
        System.out.println("=============");

        // Bai_7
        System.out.println("Total words in string are : " + String_Excersises.countWordsInString(inputStr));
        System.out.println("=============");

    }
}
