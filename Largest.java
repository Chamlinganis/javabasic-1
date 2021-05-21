
/**
 * Write a description of class Largest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Largest
{
public static void main(String[] args){
    Scanner a1 = new Scanner(System.in);
    System.out.println(" Enter a value ");
    int a = a1.nextInt();
    System.out.println(" Enter b value ");
    int b = a1.nextInt();
    if (a>b){
        System.out.println(+a+  " is greater than " +b);
    }
    if(b>a){
        System.out.println(+b+ " is greater than " +a);
    }
}
}