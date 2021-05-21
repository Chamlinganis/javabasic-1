
/**
 * Write a description of class HappyOrNotSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class HappyOrNotSwitch
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Are you happy ? ");
    System.out.println(" if happy press 'H' and if not 'N' ");
    char a = sc.nextLine().charAt(0);
    switch(a){
    case 'H':
    System.out.println( " you are happy ");
    break;
    case 'N':
    System.out.println(" you are not happy ");
    break;
    }
    }
}
