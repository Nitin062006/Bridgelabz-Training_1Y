import java.util.Scanner;

class TwoSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6,7,8,9};
		int t=9;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==t){
			System.out.println(arr[i]+"+"+arr[j]+"="+t);}
	}
}}}