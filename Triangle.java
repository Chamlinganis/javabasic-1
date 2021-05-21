
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter three side of triangle ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a!=b && b!=c && a!=c ){
    System.out.println(" It's a scalene triangle ");
    }
    else if(a==b || b==c || a==c){
    System.out.println(" It's a isosceles triangle ");
    }
    else if(a==b && a==c ){
    System.out.println(" it's a equilateral ");
}
    }
}

