import java.util.*;

class Week3_5{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int count=0,i;
 String str=sc.nextLine();
  char[] c=str.toCharArray();
 for(i=0;i<str.length();i++){
 if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
 System.out.println(c[i]);
 count++;}}
 System.out.println("vowels are: "+count);
  System.out.println("consonants are: "+(str.length()-count));}}