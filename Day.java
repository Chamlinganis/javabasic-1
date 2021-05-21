
/**
 * Write a description of class Day here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Day
{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number according to the day u want to see");
int a = sc.nextInt();
a = a%7;
 switch(a){
     case 1:
     System.out.println("this is sunday");
     break;
     case 2:
     System.out.println("this is monday ");
     break;
     case 3:
     System.out.println("this is tuesday");
     break;
     case 4:
     System.out.println("this is wednesday ");
     break;
     case 5:
     System.out.println("this is thursday ");
     break;
     case 6:
     System.out.println("this is friday");
     break;
     case 7:
     System.out.println("this is saturday ");
     break;
     case 0:
     System.out.println( " this is saturday ");
     break;
}
System.out.println(" dherai ramailo hune milda ");
}
}
