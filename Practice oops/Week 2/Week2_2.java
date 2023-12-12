import java.util.*;

class Lamp{
 String lamptype;
 boolean isOn;
 Lamp(boolean isOn){
 this.isOn=isOn;}

 void turnOn(){
 isOn=true;
 System.out.println("light is turn on");}

 void turnOff(){
 isOn=false;
 System.out.println("light is turn off");}}

 class Week2_2{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter true to switch on false to switch off led(to know current state)");
 boolean s=sc.nextBoolean();
 System.out.println("enter true to switch on false to switch off halogen(to know current state)");
 boolean st=sc.nextBoolean();
 Lamp led=new Lamp(s);
 Lamp halogen=new Lamp(st);
 led.turnOn();
 halogen.turnOff();}}

 
 