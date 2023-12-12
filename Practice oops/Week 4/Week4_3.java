/*3. In following game app, we have many types of monsters that can attack. We shall design a superclass called Monster and define the method attack() in the superclass. The subclasses shall then provides their actual implementation. In the main program, we declare instances of superclass, substituted with actual subclass (Up casting); and invoke method defined in the superclass.*/

import java.util.*;

class Monster{
 void attack(){
 System.out.println("MONSTER ATTACK");}
 }

class Firemonster extends Monster{
 void attack(){
 System.out.println("FIRE ATTACK");}
 }

class Watermonster extends Monster{
void attack(){
 System.out.println("MONSTER ATTACK");}
 }

class Stonemonster extends Monster{
void attack(){
 System.out.println("STONE ATTACK");}
 }

class Week4_3{
 public static void main(String args[]){
 Monster m1=new Firemonster();
 Monster m2=new Watermonster();
 Monster m3=new Stonemonster();
 m1.attack();
 m2.attack();
 m3.attack();}}
 