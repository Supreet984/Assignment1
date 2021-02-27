import java.util.Scanner;
import java.util.*;

class Leap{

void years(int year){

if(year%4==0){
System.out.print("Leap year");
}
else{
System.out.print("Not leap year");
}
}
}
class Main{
public static void main(String...args)
{
  Scanner sc = new Scanner(System.in);

 Leap year = new Leap();
 System.out.println("Enter a year");
 int number=sc.nextInt();
 year.years(number);
}
}

