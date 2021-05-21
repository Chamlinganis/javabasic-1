   
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Calculator
{
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter value of a ");
    int a = sc.nextInt();
    System.out.println("Enter value of b ");
    int b = sc.nextInt();
    System.out.println("Enter value of c ");
    int c = sc.nextInt();
    System.out.println(" Sum of" +a+ " , " +b+ " and " +c+ " is " +(a+b+c));
}
}
