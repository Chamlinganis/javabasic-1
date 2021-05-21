
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;
public class Rectangle
{
    public static void main(String[] args){
    Scanner ar = new Scanner(System.in);
    System.out.println(" Enter value of a "); 
    double a = ar.nextDouble();
    System.out.println(" Enter value of b ");
    double b = ar.nextDouble();
    System.out.println(" Enter value of c");
    double c = ar.nextDouble();
    double s = (a+b+c)/2;
    double area = Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5);
    System.out.println( " The answer s  is " +area);
}
}
