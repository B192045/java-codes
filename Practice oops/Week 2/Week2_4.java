import java.util.*;

class Dog{
 String name;
 String breed;
 String color;
 int height;
 String type;
 Dog(String name,String breed,String color,int height,String type){
 this.name=name;
 this.breed=breed;
 this.color=color;
 this.height=height;
 this.type=type;}
 
String getName(){
 return name;}

 String getBreed(){
 return breed;}

String getColor(){
 return color;}

int getHeight(){
 return height;}

String getType(){
 return type;}}

class Week2_4{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 Dog o1=new Dog("snoopy","pomerian","white",1,"gaurd");
 Dog o2=new Dog("rocky","lab","brown",3,"sniffer");
 System.out.println("Enter preferred breed: ");
 String prefbreed=sc.nextLine();
 System.out.println("Enter preferred color: ");
 String prefcolor=sc.nextLine();
 System.out.println("Enter preferred type: ");
 String preftype=sc.nextLine(); 
 System.out.println("Enter preferred height: ");
 int prefheight=sc.nextInt();
 
 if(prefbreed.equals(o1.getBreed())&&prefcolor.equals(o1.getColor())&&prefheight==(o1.getHeight())&&preftype.equals(o1.getType()))
 System.out.println(o1.getName());
 if(prefbreed.equals(o2.getBreed())&&prefcolor.equals(o2.getColor())&&prefheight==(o2.getHeight())&&preftype.equals(o2.getType()))
 System.out.println(o2.getName());}}
 
 
 
 
 



 