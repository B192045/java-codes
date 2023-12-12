import java.util.*;

class Circle{
 double radius;
 Circle(double radius){
 this.radius=radius;}
 
 double Area(){
 return 3.14*radius*radius;}
 
 double perimeter(){
 return 3.14*radius*2;}}

 public class Week2_1{
 public static void main(String args[]){
 Circle c1=new Circle(10);
 System.out.println(c1.Area());
 System.out.println(c1.perimeter());
}}