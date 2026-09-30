//:: calculator with loop of do while ::

import java.util.Scanner;
class demo3
{
public static void main (String args[])
{ 
  int no1,no2,choice;

    System.out.print("enter value of a :");

    Scanner s1=new Scanner(System.in);
    no1=s1.nextInt();

    System.out.print("enter value of b :");
    no2=s1.nextInt();

     System.out.println("1. sum ");
     System.out.println("2. subtraction");
     System.out.println("3. mutipliation");
     System.out.println("4. division");
     System.out.println("5. madulos");
     System.out.println("6. contiune");
     System.out.println("7. exit");

     System.out.println("enter you choice (1-7) :");
     choice=s1.nextInt();

if(choice==1)
{
System.out.println("sum is :"+(no1+no2));
}

if(choice==2)
{
System.out.println("subtraction is :"+(no1-no2));
}

if(choice==3)
{
System.out.println("multipliation is :"+(no1*no2));
}

if(choice==4)
{
         if(no2==0)
           {
            System.out.println("::This is invalid value number of B ::");
            System.out.println("::pls enter valid value number of B ::");
           }

         else
            {
             System.out.println("division is :"+(no1/no2));
            }
}
if(choice==5)
{
System.out.println("madulos is :: "+(no1%no2));
}

if(choice>=8)
{
System.out.println("this is invalid choice");
}
if(choice == 6)
{   do{
    System.out.print("enter value of a :");

    Scanner s2=new Scanner(System.in);
    no1=s2.nextInt();

    System.out.print("enter value of b :");
    no2=s2.nextInt();

     System.out.println("1. sum ");
     System.out.println("2. subtraction");
     System.out.println("3. mutipliation");
     System.out.println("4. division");
     System.out.println("5. madulos");
     System.out.println("6. contiune");
     System.out.println("7. exit");

     System.out.println("enter you choice :");
     choice=s2.nextInt();
if(choice==1)
{
System.out.println("sum is :"+(no1+no2));
}

if(choice==2)
{
System.out.println("subtraction is :"+(no1-no2));
}

if(choice==3)
{
System.out.println("multipliation is :"+(no1*no2));
}

if(choice==4)
{
         if(no2==0)
           {
            System.out.println("::This is invalid value number of B ::");
            System.out.println("::pls enter valid value number of B ::");
           }

         else
            {
             System.out.println("division is :"+(no1/no2));
            }
}
if(choice==5)
{
System.out.println("madulos is :: "+(no1%no2));
}

if(choice>=8)
{
System.out.println("this is invalid choice");
}


      }while(choice ==6);
if(choice==7){
System.out.println("\n");
}
}
}
}