import java.util.Scanner;
import java.util.*;
class DayOfTheWeek{
void day(int number)
{ switch(number)
{ case 1: System.out.print("Sunday");
	break;
case 2: System.out.print("Monday");
	break;
case 3: System.out.print("Tuesday");
	break;
case 4: System.out.print("Wednesday");
	break;
case 5: System.out.print("Thursday");
	break;
case 6: System.out.print("Friday");
	break;
case 7: System.out.print("Saturday");
	break;
default: System.out.print("There ARE only 7 days in a week");
} 
}
}
class main{
public static void main(String...args)
{
  
  Scanner sc = new Scanner(System.in);
  DayOfTheWeek days = new DayOfTheWeek();
  System.out.println("Enter a number");
  int number = sc.nextInt();
days.day(number);
}
}