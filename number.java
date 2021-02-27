import java.util.Scanner;
import java.util.*;
class Greatest{
public
int a,b,c;

 void findGreatestNumber(){
if(a>b)
 {
if(a>c)
{
System.out.print("a is greater");
}

}
else if(b>c)
{
System.out.print("b is greater");
}
else{
System.out.print("c is greater");
}
}
}
class Main{
public static void main(String...args)
{ 
  Scanner sc= new Scanner(System.in);
 Greatest first= new Greatest();
 System.out.print("Enter three numbers");
  first.a=sc.nextInt();
  first.b=sc.nextInt();
  first.c=sc.nextInt();
first.findGreatestNumber();
}}

