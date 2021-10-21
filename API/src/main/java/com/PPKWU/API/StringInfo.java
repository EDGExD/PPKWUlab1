package com.PPKWU.API;

public class StringInfo {
    int numbersOfUpper;
    int numbersOfLower;
    int numbersOfSpecialChar;
    int numbersOfNumbers;

    public void countAll(String str)
    {
        countLower(str);
        countUpper(str);
        countDigit(str);
        countSpecialChar(str);
    }

    private void countUpper(String str){
        numbersOfUpper=0;
        for(int i=0; i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                numbersOfUpper++;
            }
        }
    }

    private void countLower(String str){
        numbersOfLower=0;
        for(int i=0; i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                numbersOfLower++;
            }
        }
    }

    private void countDigit(String str){
        numbersOfNumbers=0;
        for(int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                numbersOfNumbers++;
            }
        }
    }

    private void countSpecialChar(String str){
        numbersOfSpecialChar=str.length()-(numbersOfLower+numbersOfNumbers+numbersOfUpper);
    }
}
