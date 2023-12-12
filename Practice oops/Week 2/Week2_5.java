import java.util.*;

class Car{
 String company;
 double mileage;
 double speed;
 String color;
 Car(String company,double mileage,double speed,String color){
 this.company=company;
 this.mileage=mileage;
 this.speed=speed;
 this.color=color;}

 double getMileage(double mileage){
 return mileage;}

 double getSpeed(double speed){
 return speed;}

 String getColor(String color){
 return color;}

 String getCompany(String company){
 return company;}}

 class Week2_5{
 public static void main(String args[]){
 Car c1=new Car("alto",60,60,"white");
 Car c2=new Car("baleno",62,62,"red");
 Car c3=new Car("swift",63,63,"white");
 if(c1.getMileage()<c2.getMileage()&&c1.getMileage()<c3.getMileage()){
 System.out.println(c1.getMileage());
 System.out.println(c1.getMileage());
 System.out.println(c1.getMileage());
 System.out.println(c1.getMileage());}
 



 


 