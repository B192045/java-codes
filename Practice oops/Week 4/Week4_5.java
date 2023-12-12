import java.util.*;

class SBI{
 String branch_name;
 String password;
 SBI(String branch_name,String password){
 this.branch_name=branch_name;
 this.password=password;}}

 class Account{
 double balance;
 double amount;
 Account(double balance){
 this.balance=balance;}

 double credit(int amount){
 balance=balance+amount;
 return balance;}

 double debit(int amount){
 balance=balance-amount;
 return balance;}

 double getBalance(){
 return balance;}

 void exit(){
 System.out.println("Exit the application");}
}

class Week4_5{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter branch name: ");
 String branch_name=sc.nextLine();
 System.out.println("Enter password: ");
 String password=sc.nextLine();
 SBI s=new SBI(branch_name,password);
 Account a=new Account(1000);
 if(s.branch_name.equals("basar")||"Nizamabad".equals(s.branch_name)){
 while(true){
 System.out.println("Enter operations to perform 1.Credit 2.Debit 3.Getbalance   4.Exit");
 int n=sc.nextInt();
 switch(n){
 case 1:
 System.out.println("Enter amount to be credited: ");
 sc.nextLine();
 //double amoun = Double.parseDouble(sc.nextLine());
 int amoun=sc.nextInt();
 System.out.println("Credited amount is "+a.credit(amoun));
 break;
 case 2:
 System.out.println("Enter amount to be debited: ");
 sc.nextLine();
 int amount=sc.nextInt();
 //double amount = Double.parseDouble(sc.nextLine());
 System.out.println("Debited amount is "+a.debit(amount));
 break;
 case 3:
 System.out.println("Balance amount is "+a.getBalance());
 break;
 case 4:
 System.exit(0);
 break;}}}
 else
 System.out.println("Invalid branch name");}}
 
 
 
 
 
 