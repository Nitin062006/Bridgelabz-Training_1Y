class Calculator{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	
	
	public static void main(String []args){
		System.out.println("------------------------------WELCOME TO MY PROJECT------------------------------");
		
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number 1:");
		int a =sc.nextInt();
		System.out.println("Enter Number 2:");
		int b=sc.nextInt();
		System.out.println("1 FOR ADDITION");
		System.out.println("2 FOR SUBTRACTION");
		System.out.println("3 FOR MULTIPLICATION");
		System.out.println("4 FOR DIVISION");
		Calculator c1=new Calculator();
		while(true){
		int choice=sc.nextInt();
		switch(choice){
			case 1:
			int Addition=cl.add(a,b);
			System.out.println("Addition of two number:-" +Addition);
			break;
			
			case 2:
		    int Subtraction =c1.sub(a,b);
			System.out.println("Substraction of two number:-" +Subtraction);
			break:
			
			case 3:
			int Multiply =c1.mul(a,b);
			System.out.println("multiply of two number:-" +Multiply);
			breakl;
			
			case 4;
			int Division =c1.div(a,b);
			System.out.println("division of two number:- +Division);
			break;
			
			default:
			System.out.println("INVALID INPUT");
		}
		
		}
	}
}
			
			
			
	
	