/*2.Suppose that we are required to model students and teachers in our application. We can define a superclass called Person to store common properties such as name and address, and subclasses Student and Teacher for their specific properties. For students, we need to maintain the courses taken and their respective grades; add a course with grade, print all courses taken and the  average grade. Assume that a student takes no more than 30 courses for the entire program. For teachers, we need to maintain the courses taught currently, and able to add or remove a course taught. Assume that a teacher teaches not more than 5 courses concurrently.*/

import java.util.*;

class Person{
 String name;
 String address;
 Person(String name,String address){
 this.name=name;
 this.address=address;}}

class Student{
 int grade;
 String courses_taken;
 HashMap<Integer,String> h1=new HashMap<>();

 Student(String name,String address){
 super(name,address);}
 
 void addcourse(){
 int 