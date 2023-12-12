import java.util.*;

class TV{
 int channel;
 int volume;
 boolean isOn;

 void turnOn(){
 isOn=true;
 System.out.println("Turns on the TV");}

 void turnOff(){
 isOn=false;
 System.out.println("Turns off the TV");}

 void setChannel(int newchannel){
 channel=newchannel;
 System.out.println("Sets to new channel "+channel);}

 void setVolume(int newvolume){
 volume=newvolume;
 System.out.println("Sets to new volume "+volume);}

 void channelUp(){
 if(isOn&&channel>=1&&channel<=39){
 channel=channel+1;
 System.out.println("Increased to new channel "+channel);}
 else
 System.out.println("Please ensure TV is on");}

 void channelDown(){
 if(isOn&&channel>=2&&channel<=40){
 channel=channel-1;
 System.out.println("Decreased to new channel "+channel);}
 else
 System.out.println("Please ensure TV is on");}

 void volumeUp(){
 volume++;
 System.out.println("Sets to new volume "+volume);}

 void volumeDown(){
 volume--;
 System.out.println("Sets to new volume "+volume);}}

class Week2_3{
 public static void main(String args[]){
 TV t1=new TV();
 int o;
 Scanner sc=new Scanner(System.in);
 System.out.println("Set channel nums from 1 to 40");
 int n=sc.nextInt();
 System.out.println("Set volume nums from 1 to 7");
 int p=sc.nextInt();
 while(true){
 System.out.println("Select operation to performed 1.Turn on 2.Turn off 3.setchannel 4.setvolume 5.channelup 6.channeldown 7.volumeup 8.volumedown 9.exit");
 o=sc.nextInt();
 switch(o){
 case 1:
 t1.turnOn();
 break;
 case 2:
 t1.turnOff();
 break;
 case 3:
 t1.setChannel(n);
 break;
 case 4:
 t1.setVolume(p);
 break;
 case 5:
 t1.channelUp();
 break;
 case 6:
 t1.channelDown();
 break;
 case 7:
 t1.volumeUp();
 break;
 case 8:
 t1.volumeDown();
 break;
 case 9:
 System.exit(0);
 default:
 System.out.println("invalid");}}
}}

 
 
 