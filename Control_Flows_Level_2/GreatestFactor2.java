import java.util.Scanner;
class GreatestFactor2{
public static void main(String []args){
Scanner sc =new Scanner(System.in);
System.out.println("enter the num");
int n =sc.nextInt();
int i=n-1;

while(i>=1){
	if(n%i==0){
		System.out.println("Greatest factor is:" +i);
		break;
	}
	i--;
}

}
}
