package com.gla.Methods.Level_1;


//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
//        Hint =>
//a. Simple Interest = Principal * Rate * Time / 100
//b. Take user input for principal, rate, time
//c. Write a method to calculate the simple interest given principle, rate and time as
//        parameters
//d. Output “The Simple Interest is _ for Principal _, Rate of Interest _ and Time _”

import java.util.Scanner;
public class Simple_Interest {
    public static void interest(double p, double r, double t){
        double si=(p*r*t)/100;
        System.out.println("Simple Interest is "+si);
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Principal : ");
        int p= s1.nextInt();
        System.out.print("Enter Rate : ");
        int r= s1.nextInt();
        System.out.print("Enter Time : ");
        int t=s1.nextInt();

        interest(p,r,t);
    }
}
