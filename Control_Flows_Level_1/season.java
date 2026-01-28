import java.util.Scanner;
class season{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month:");
		int a= sc.nextInt();
		System.out.println("enter the day:");
		int b=sc.nextInt();
		if (a>2&&a<7){
			if(a==3 &&b<=20) {
            System.out.println("not a spring season");}
            else if(a==6&& b>=20){
                System.out.println(" not a spring season");
            }
                
		else
        System.out.println("Spring season");
			}
		
		
    
		else{
		System.out.println("not a spring season");
        }
		}
	}
	
    


