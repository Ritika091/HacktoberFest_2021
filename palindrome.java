import java.util.*;
public class Palindrome 
{  
public static void main(String[] args)   
{  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();
  int numcopy=num;
  int rev = 0;  
while(num != 0)   
{  
int r = num % 10;  
rev = rev * 10 + r;  
num = num/10;  
}  
if(rev==numcopy)
System.out.println(numcopy+" is a palindrome number.");
else
  System.out.println(numcopy+" is not a palindrome number.");
}  
} 
