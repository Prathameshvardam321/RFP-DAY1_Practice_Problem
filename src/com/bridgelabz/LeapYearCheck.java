package com.bridgelabz;

import java.util.Scanner;

public class LeapYearCheck {
    static boolean checkLeapYear(int year){
        if (year%400==0){
            return true;
        } else if (year%4==0 && year%100!=0) {
            return true;
        }

        return false;
    }
    static void printAnswer(boolean value,int year){
        if (value==true){
            System.out.println(year+" is leap year.");
        }
        else
            System.out.println(year+" is not leap year.");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scan.nextInt();
        printAnswer(checkLeapYear(year),year);
    }
}
