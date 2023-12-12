import java.util.*;

class Shape{
 int s;
 int getArea(int s){
 return s*s;}
 int getPerimeter(int s){
 return 4*s;}}

class Circle extends Shape{
 double r;
 double getArea(double r){
 return 3.14*r*r;}
 double getPerimeter(double r){
 return 2*3.14*r;}}

class Rectangle extends Shape{
 double l;
 double b;
 double getArea(double l,double b){
 return l*b;}
 double getPerimeter(double l,double b){
 return 2*(l+b);}}

class Week4_1{
 public static void main(String args[]){
 Shape s=new Shape();
 Circle c=new Circle();
 Rectangle r=new Rectangle();
 System.out.println("Area of square: "+s.getArea(2));
 System.out.println("Perimeter of square: "+s.getPerimeter(2));
 System.out.println("Area of circle: "+c.getArea(3));
 System.out.println("Perimeter of circle: "+c.getPerimeter(3));
 System.out.println("Area of rectangle: "+r.getArea(2,3));
 System.out.println("Perimeter of rectangle: "+r.getPerimeter(2,3));}}





