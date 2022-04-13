package com.company;

import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src\\com\\company\\fileread.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            String[] reverseSubStringArr = s.split(" ");
            StringBuilder resultString = new StringBuilder();
            for (int i = reverseSubStringArr.length - 1; i >= 0; i--) {
                resultString.append(reverseSubStringArr[i]).append(" ");
            }
            String reversedString = resultString.toString();
            br.close();
            fr.close();

            String subStringExample = "newSubString";
            String resStringReplaceSub = reversedString.replaceAll("Hello", subStringExample);
            FileWriter frw = new FileWriter("src\\com\\company\\filewrite.txt");
            frw.write(resStringReplaceSub);
            frw.flush();
            frw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



