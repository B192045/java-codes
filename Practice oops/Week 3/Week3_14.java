import java.util.*;

class Ebook{
 String Book_name;
 String Book_author;
 int Book_count;
 Ebook(String Book_name,String Book_author,int Book_count){
 this.Book_name=Book_name;
 this.Book_author=Book_author;
 this.Book_count=Book_count;}
 
int count(){
Book_count=Book_count-1;
return Book_count;}

 String getbook(){
 return Book_name;}}

/*Class Customer{
 int cust_id;
 String cust_name;
 String cust_address;
 Customer(int cust_id,String cust_name,String cust_address){
 this.cust_id=cust_id;
 this.cust_name=cust_name;
 this.cust_address=cust_address;}}*/

class Week3_14{
 public static void main(String args[]){
 Ebook e1=new Ebook("panchatantra","aish",5);
 Ebook e2=new Ebook("vipula","bharathi",10);
 Ebook e3=new Ebook("biology","amulya",100);
 System.out.println("Available books are panchatantra vipula biology");
 System.out.println("Enter the book u wish to buy: ");
 Scanner sc=new Scanner(System.in);
 String book=sc.nextLine();
 if(book.equals(e1.getbook())){
 System.out.println("Initial Count is: "+e1.Book_count);
 System.out.println("Remaining count of books: "+e1.count());
 System.out.println(e1.getbook());}
 if(book.equals(e2.getbook())){
 System.out.println("Initial Count is: "+e2.Book_count);
 System.out.println("Remaining count of books: "+e2.count());
 System.out.println(e2.getbook());}
 if(book.equals(e3.getbook())){
 System.out.println("Initial Count is: "+e3.Book_count);
 System.out.println("Remaining count of books: "+e3.count());
 System.out.println(e3.getbook());}
}}

 
 
 

