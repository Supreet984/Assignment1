
//For output
import java.util.*;
//For input
import java.util.Scanner;
class Ticket{
public
	int a=15;
        double b=11.2;
	void test(){
        double c=a+b;
        int y,z;
         y=23;
         z=56;
	float x= y + z;
           x=(float) y+z;
	System.out.println("Inside Test method"+c+"\t"+x);
	
}
}
class Main{
public static void main(String...args)
{ Ticket first = new Ticket();
   Scanner sc= new Scanner(System.in);  
      System.out.println("Enter first number\n");
	first.a=sc.nextInt();
	System.out.println("Enter another number");
	first.b=sc.nextDouble();

   first.test();
}
}