import java.util.*;

class Largest{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int i,max=0,min=999,input;
 ArrayList<Integer> list=new ArrayList<>();
 System.out.println("enter elements: ");
 for(i=0;i<5;i++){
 input=sc.nextInt();
 list.add(input);}
 System.out.println(list);
 for(i=0;i<5;i++){
 if(list.get(i)>max)
 max=list.get(i);
 if(list.get(i)<min)
 min=list.get(i);
}
 System.out.println("maximum is: "+max);
 System.out.println("minimum is: "+min);
 }}
