package onemount.com;

import java.util.ArrayList;
import java.util.List;

public class String_Excersises {
    public static List<String> getUppercaseCharacter(String inputStr1) {
//        char[] upperChar = new char[inputStr1.length()];
        List<String> upperChar = new ArrayList<String>();
        for (int i = 0; i < inputStr1.length(); i++) {
            if(Character.isUpperCase(inputStr1.charAt(i))) {
//                System.out.println(inputStr1.charAt(i));
                 upperChar.add(String.valueOf(inputStr1.charAt(i)));
            }
        }
        return upperChar;
    }

    public static String nonNumericStr(String inputStr) {
//        List<String> nonNumericStr = new ArrayList<String>();
        String nonNumericStr = "";
        for (int i = 0; i < inputStr.length(); i++) {
            if(!Character.isDigit(inputStr.charAt(i))) {
//                System.out.print(inputStr2.charAt(i));
                nonNumericStr += inputStr.charAt(i);
            }
        }
        return nonNumericStr;
    }

    public static String countVowelAndConsonant(String inputString) {
        int vowel = 0;
        int consonant = 0;
        String result = "";
        inputString = inputString.toLowerCase();
        for(int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if((ch >= 'a'&& ch <= 'z')) {
                consonant++;
            }
        }
        return result += String.valueOf(vowel) + " " + String.valueOf(consonant);
    }
    public static int countNumberOfCharAppear(String inputString, String c) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            String charInArray = String.valueOf(inputString.charAt(i));
            if(c.equals(charInArray)){
                count ++;
            }
        }
        return count;
    }

    public static int countWordsInString(String inputString) {
        int count = 0;
        String[] str = inputString.split(" +");
        return str.length;
    }

}
