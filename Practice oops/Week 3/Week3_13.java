import java.util.*;

class Week3_13{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter dice 10 times and enter output of two dice");
 int suc=0;
 int n=0;
 while(n<=10){
 int a=sc.nextInt();
 int b=sc.nextInt();
 if(a==b)
 suc++;
 n++;}
 System.out.println("succesfull atempts are: "+suc);}}