import java.util.*;
class Height{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int Height[]=new int[3];
		for(int i=0;i<=3;i++){
		System.out.println("Enter the age of amar");
		int amar=sc.nextInt();
		System.out.println("Enter the age of akbar");
		int akbar=sc.nextInt();
		System.out.println("Enter the age of anthony");
		int anthony=sc.nextInt();
		System.out.println("Enter the height of amar");
		int a1=sc.nextInt();
		System.out.println("Enter the height of akbar");
		int a2=sc.nextInt();
		System.out.println("Enter the height of anthony");
		int a3=sc.nextInt();
		if(amar<akbar && amar<anthony){
			System.out.println("Amar is the youngest");
		}
			else if(akbar<amar && akbar<anthony){
				System.out.println("Akbar is the youngest");
			}
			else{
				System.out.println("Anthony is the youngest");
			}
			if(a1>a2 || a1>a3){
				System.out.println("Amar is the tallest");
			}
				else if(a2>a1 || a2>a3){
					System.out.println("Akbar is the tallest");
				}
				else{
					System.out.println("Anthony is the tallest");
				}
		    }
	    }
    }