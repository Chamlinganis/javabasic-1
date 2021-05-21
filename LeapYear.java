
/**
 * Write a description of class LeapYear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LeapYear
{
 public static void main(String[] args){
     int a;
     Scanner sc = new Scanner(System.in);
     System.out.println(" Enter a year ");
     a = sc.nextInt();
if((a%4==0) && (a%400==0) || (a%100!=0)){
System.out.println(+a+" is a leap year");
}
else{
    System.out.println(" it's not a leap year ");
}
}
}