import java.util.*;
public class Palindrome {
	public static void main(String args[])
	{
		     
		 int n;
		 int result=0;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 int inc=n+1;
		 while(result==0)
		 {
		 	result=check_palin(inc);
		 	inc++;
		 }
		 System.out.println(result);
		 sc.close(); 
	}
	public static int check_palin(int num)
	{
		int r,sum=0,temp;
		temp=num;    
		while(num>0)
		{    
			r=num%10;  //getting remainder	
			sum=(sum*10)+r;   
			num=num/10;    
		}    
		if(temp==sum)    
		{        
			return(sum);
		}	
		return 0;
	}
}
