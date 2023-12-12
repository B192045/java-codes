import java.util.*;

class Palindrome{
int i;
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a=n;
 int rev=0,rem;
 while(n>0){
 rem=n%10;
 rev=rev*10+rem;
 n=n/10;}
 if(a==rev)
 System.out.println("palindrome");
 else
 System.out.println("no");
 }}