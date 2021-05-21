
/**
 * Write a description of class SwitchOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SwitchOdd
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter a number mate  ");
    int x = sc.nextInt();
    int rem = x%2;
    switch(rem){
        case 0:
        System.out.println( " It's an even number ");
        break;
        case 1:
        System.out.println(" It's an odd number ");
        break;
    }
    }
}
