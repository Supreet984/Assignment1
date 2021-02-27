import java.util.Scanner;
import java.util.*;

class Fibonacciseries(){

void terms(int n){

int i,r,r1,r2;
r1=1,r=0;
System.out.print(r1," ");
System.out.print(r," ");
for(i=2;i<n;i++){
r2=r1+r;
System.out.print(r2," ");
r=r1;
r1=r2;
}
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

int numb;
System.out.print("Enter the numbers ");

numb=sc.nextInt();

Fibonacciseries numbers = new Fibonacciseries()
numbers.terms(numb);

}
}
