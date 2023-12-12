import java.util.*;

class Product{
 int product_id;
 String product_name;
 double product_qty;
 double product_price;
 Product(int product_id,String product_name,double product_qty,double product_price){
 this.product_id=product_id;
 this.product_name=product_name;
 this.product_qty=product_qty;
 this.product_price=product_price;}
 
 double price(double qty,double product_price){
 return qty*product_price;
 }
}

 class Week3_11{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 double sum=0,sums=0;
 while(true){
 System.out.println("Print 6 to exit the application and know total price");
 System.out.println("Enter product id: ");
 int pid=sc.nextInt();
 if(pid==6)
 break;
 System.out.println("Enter quantity of product: ");
 double qty=sc.nextDouble();
 switch(pid){
 case 1:
 Product p1=new Product(1,"sofa",qty,99.9);
 double a=p1.price(qty,99.9);
 System.out.println(a);
 sums=sums+a;
 System.out.println("Total price is: "+sums);
 break;
 case 2:
 Product p2=new Product(2,"TV",qty,20.20);
 double b=p2.price(qty,20.20);
 System.out.println(b);
 sums=sums+b;
 System.out.println("Total price is: "+sums);
 break;
 case 3:
 Product p3=new Product(3,"fridge",qty,6.87);
 double c=p3.price(qty,6.87);
 System.out.println(c);
 sums=sums+c;
 System.out.println("Total price is: "+sums);
 break;
 case 4:
 Product p4=new Product(4,"stove",qty,45.5);
 double d=p4.price(qty,45.5);
 System.out.println(d);
 sums=sums+d;
 System.out.println("Total price is: "+sums);
 break;
 case 5:
 Product p5=new Product(5,"bed",qty,40.49);
 double e=p5.price(qty,40.49);
 System.out.println(e);
 sums=sums+e;
 System.out.println("Total price is: "+sums);
 break;
 case 6: 
 System.exit(0);
}}


 }}