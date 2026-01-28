import java.util.Scanner;
class Leapyear{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the year:");

int year =sc.nextInt();
 
if(year<1582){
	System.out.println("year should be 1582 0r later");
}
else{
	if((year%4==0 && year%100!=0) || year%400==0){
		System.out.println("Leap year");
	}
	else{
		System.out.println("not a leap year");
	}
}
}
}