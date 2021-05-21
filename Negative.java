
/**
 * Write a description of class Negative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Negative
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println( " Enter a number ");
    int a = sc.nextInt();
    if( a>=0 ){
    System.out.println(("00"+a));
    }
    if(a%2==0){
        System.out.println(" It's an even number ");
    }
    if(a>=100 && a<=999){
    System.out.println(" It's an 3 digit number ");
    }
    else if (a>=10 && a<=99){
    System.out.println(" It's an 2 digit number ");
    }
    else {
    System.out.println(" It's a negative number ");
    }
    }
}
