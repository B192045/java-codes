/*4. RGUKT planned to provide vehicles (2 and 4 wheelers) to all class CR’s, and requested the company name and model of 2 and 4 wheelers from CR’s. As Indian market has lot of models in 2 wheelers and 4 wheelers, Mr. Ramesh is in dilemma to choose the best model among all 2 wheelers and 4 wheelers. 
Write an application which compares the best model among 2 wheelers and 4 wheelers. Create a super class Vehicle, derive the sub-classes TwoWheeler and FourWheeler .
Two wheeler can have properties such as Company, Model, Mileage, Fuel Capacity, Displacement, Front Brake, Rear Brake, Tyre Type, Head lamp, User Reviews
Four wheeler can have properties such as Company, Model, Mileage, Fuel Capacity, Displacement, Air Conditioner, air bags, Power Steering, Rain Sensing Wiper.
Maintain atleast four 2-wheelers and Four 4-wheelers details in repository.Application usage : Display all companies and models of 2 and 4 wheelers available in 
repository. User can choose any number of vehicles to compare, compare among them and display the Company and model of the vehicle to buy. If user opted for 2 wheeler, compare only 2 wheeler vehicles and same with 4 wheeler.*/

import java.util.*;

class Vehicle{
 String company;
 String model;
 int mileage;
 int fuelcapacity;
 int displacement;
 
 Vehicle(String company,String model,int mileage,int fuelcapacity,int displacement){
 this.company=company;
 this.model=model;
 this.mileage=mileage;
 this.fuelcapacity=fuelcapacity;
 this.displacement=displacement;}}

class Twowheeler extends Vehicle{
 boolean frontbrake;
 boolean rarebrake;
 String tyretype;
 boolean headlamp;
 String userreviews;

 Twowheeler(String company,String model,int mileage,int fuelcapacity,int displacement,boolean frontbrake,boolean rarebrake,String tyretype,boolean headlamp,String userreviews){
 super(company,model,mileage,fuelcapacity,displacement);
 this.frontbrake=frontbrake;
 this.rarebrake=rarebrake;
 this.tyretype=tyretype;
 this.headlamp=headlamp;
 this.userreviews=userreviews;}
}

class Week4_4{
 public static void main(String args[]){
 Vehicle v=new Twowheeler("honda",2,60,10,10,true,true,