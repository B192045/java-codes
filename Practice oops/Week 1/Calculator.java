import java.util.*;

class operations{
 double addition(int a,int b){
 return a+b;}
 double subtraction(int a,int b){
 return a-b;}
 double multipication(int a,int b){
 return a*b;}
 double division(int a,int b){
 return a/b;}}

 class Calculator{
 public static void main(String args[]){
 operations o1=new operations();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter num of operations: ");
 int c=sc.nextInt();
 while(c>0){
 System.out.println("enter operation to be performed 1.addition 2.subtraction  3.multiplication  4.division 5.Exit");
 int n=sc.nextInt();
 switch(n){
 case 1:
 System.out.println(o1.addition(10,20));
 break;
 case 2:
 System.out.println(o1.subtraction(20,10));
 break;}
 c--;}}}