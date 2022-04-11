package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       String oddAndEven = "123456789";
       String oddString = "";
       String evenString = "";
       for (int i = 0; i < oddAndEven.length(); i++) {
           if ((int) oddAndEven.charAt(i) % 2 == 0) {
               evenString += oddAndEven.charAt(i);
           } else {
               oddString += oddAndEven.charAt(i);
           }
       }
       System.out.println(evenString.toString() + " " + oddString.toString());


       String countOfDigitsInString = "1b2c3abfasdd";
       int count = 0;
       for (int i = 0; i < countOfDigitsInString.length(); i++) {
           if (Character.isDigit(countOfDigitsInString.charAt(i))) {
               count++;
           }
       }
       System.out.println(count);
       count = 0;


       String onlyDigits = "";
       for (int i = 0; i < countOfDigitsInString.length(); i++) {
           if (Character.isDigit(countOfDigitsInString.charAt(i))) {
               onlyDigits += countOfDigitsInString.charAt(i);
           }
       }
       System.out.println(onlyDigits);

       String stringWithoutRepetition = "abadacafagae";
       String result = stringWithoutRepetition.replaceAll("(?s)(.)(?=.*\\1)", "");
       System.out.println(result);


       String countsOfChars = "ababcdcbcae";
       char exampleChar='a';
       int counter=0;
       char[] charArr = countsOfChars.toCharArray();
       for (int i = 0; i < charArr.length; i++) {
           if(charArr[i]==exampleChar){
               counter++;
           }
       }
       System.out.println(counter);



       StringBuilder reverseString=new StringBuilder("Hello");
       System.out.println(reverseString.reverse().toString());


       String subString = "name";
       String exampleString = "Hello my name is name";
       System.out.println((exampleString + "\0").split(subString).length - 1);


       String reverseSubString="My name is Alan";
       String[] reverseSubStringArr=reverseSubString.split(" ");
       StringBuilder resultString=new StringBuilder();
       for(int i=reverseSubStringArr.length-1;i>=0;i--){
           resultString.append(reverseSubStringArr[i]).append(" ");
       }
       System.out.println(resultString.toString());


       String[] alphabetString={"Java is really cool language","Alfa","Beta version"};
       Arrays.sort(alphabetString);
       System.out.println(Arrays.toString(alphabetString));


       String shortestWordString="The main reason";
       String[] shortestWordArr=shortestWordString.split(" ");
       String shortestWord=shortestWordArr[0];
       for (int i=0;i<shortestWordArr.length;i++){
           if(shortestWord.length()>=shortestWordArr[i].length()){
               shortestWord=shortestWordArr[i];
           }
       }
       System.out.println(shortestWord);


       String countOfWordsInString="The main reason for this";
       String[] countOfWordsInStringArr=countOfWordsInString.split(" ");
       System.out.println(countOfWordsInStringArr.length);


       String stringWithSpaces="hellomyworld";
       String resStringWithSpaces=stringWithSpaces.replaceAll(".(?=.)", "$0 ");
       System.out.println(resStringWithSpaces);



       StringBuilder stringPalindrome=new StringBuilder("alola");
       boolean isPalindrome=stringPalindrome.toString().equals(stringPalindrome.reverse().toString());
       System.out.println(isPalindrome);


       String subStringExample="newSubString";
       String stringReplaceSub="Hello my friend";
       String resStringReplaceSub=stringReplaceSub.replaceAll("friend",subStringExample);
       System.out.println(resStringReplaceSub);


       String stringDistanceBetweenSub="Java is very popular language";
       String subStringDistance1="is";
       String subStringDistance2="language";
       int distanceBetweenSub=(stringDistanceBetweenSub.indexOf(subStringDistance1)+subStringDistance1.length()-stringDistanceBetweenSub.indexOf(subStringDistance2));
       System.out.println(distanceBetweenSub*-1);



   }
   }



