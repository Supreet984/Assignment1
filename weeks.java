import java.util.Scanner;
import java.util.*;

class Week{
  

     void days(int number){
     if(number==1)
{ System.out.print("Sunday");
}
   else if(number==2)
{
   System.out.print("Monday\n");
 }
else if(number==3){
   System.out.print("Tuesday\n");
}   
else if(number==4){
   System.out.print("Wednesday\n");
}
else if(number==5){
   System.out.print("Thursday\n");
}
else if(number==6){
   System.out.print("Friday\n");
}
else if(number==7) {
    System.out.print("Saturday\n");
}
else{
System.out.print("There are only 7 days\n");
}
}
}
class Main{
   public static void main(String...args)
{
 Scanner sc = new Scanner(System.in); 

 Week day = new Week();
System.out.println("Enter a number");
 int number=sc.nextInt();
day.days(number);
}

}
