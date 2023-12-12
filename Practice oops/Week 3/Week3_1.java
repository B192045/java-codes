import java.util.*;

class Week3_1{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int count=0,i;
 String a=sc.nextLine();
 Char c=a.toCharArray();
 System.out.println("Enter character to count occurences: ");
 String b=sc.nextLine();
 for(i=0;i<c.length();i++){
 if(c[i].equals(b))
 count++;}
 System.out.println(count);
 }}