import java.util.*;

class Primefactors{
 public static void main(String args[]){
 int c=0,i;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter num: ");
 int n=sc.nextInt();
 for(i=2;i<=n;i++){
 if(n%i==0){
 System.out.println(i);
 c++;}
 }
 System.out.println(c);}}