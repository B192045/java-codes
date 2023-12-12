import java.util.*;

class Details{
 String Emp_name;
 String Emp_gender;
 int Emp_age;
 String Emp_designation;
 int Emp_salary;
 String Emp_address;
 int id;
 Details(int id,String Emp_name,String Emp_gender,int Emp_age,String Emp_designation,int Emp_salary,String Emp_address){
 this.id=id;
 this.Emp_name=Emp_name;
 this.Emp_gender=Emp_gender;
 this.Emp_age=Emp_age;
 this.Emp_designation=Emp_designation;
 this.Emp_salary=Emp_salary;
 this.Emp_address=Emp_address;}

 int getId(){
 return id;}

 String getName(){
 return Emp_name;}

  String getGender(){
  return Emp_gender;}

  int getAge(){
  return Emp_age;}

  String getDesignation(){
  return Emp_designation;}

  int getSalary(){
  return Emp_salary;}

  String getAddress(){
  return Emp_address;}}

 class Week3_10{
 public static void main(String args[]){
 Details d1=new Details(1,"Aish","F",21,"b.tech",2000000,"nirmal");
 Details d2=new Details(2,"bhar","M",22,"b.tech",20000000,"hyd");
 Scanner sc=new Scanner(System.in);
 System.out.println("enter id: ");
 int id=sc.nextInt();
 if(id==d1.getId())
 System.out.println(d1.getName());
 if(id==d2.getId())
 System.out.println(d2.getName());}}
 
 




 