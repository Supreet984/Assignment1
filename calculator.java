import java.util.Scanner;
import java.util.*;
class Calculator{
void calc(int number)
{ switch(number)
{ case 1: System.out.print("+");
          break;
case 2:  System.out.print("-");
         break;
case 3:  System.out.print("/");
         break;
case 4:  System.out.print("*");
         break;
}
}
}
class main{
public static void main(String...args)
{

     Scanner sc = new Scanner(System.in);
     Calculator calcs = new Calculator();
     System.out.println("Enter a number");
     int number = sc.nextInt();
         calcs.calc(number);
}
}