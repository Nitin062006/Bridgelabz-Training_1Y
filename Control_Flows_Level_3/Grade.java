import java.util.Scanner;
class Leapyear{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the marks:");

int mark =sc.nextInt();
 
if(year<1582){
	System.out.println("year should be 1582 0r later");